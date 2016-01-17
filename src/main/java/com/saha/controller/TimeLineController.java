package com.saha.controller;

import com.saha.annotations.JsonRestController;
import com.saha.model.Tweet;
import com.saha.service.TweetService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Alper
 */
@JsonRestController
@RequestMapping(value = "/tweets")
public class TimeLineController {
    @Autowired
    private TweetService tweetService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Tweet> tweets(@RequestParam(defaultValue = "0") Integer page,
                                    @RequestParam(defaultValue = "5") Integer size) {
        return tweetService.tweets(page, size);
    }
}
