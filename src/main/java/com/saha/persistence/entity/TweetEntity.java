package com.saha.persistence.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
@Setter
@Entity
@Table(schema = "personel", name = "tweets")
public class TweetEntity {

    @Getter
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Getter 
    private String content;
 
    @ManyToOne
    private UserEntity userEntity;
    
    @CreatedDate
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createDate;
    
    @LastModifiedDate
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastModifiedDate;
}
