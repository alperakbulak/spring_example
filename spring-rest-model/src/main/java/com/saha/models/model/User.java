package com.saha.models.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dozer.Mapping;

@Getter
@Setter
@ToString(exclude = "id")
public class User {
    private String name;
    private String lastName;
    private String userName;
    @Mapping("id")
    private String tcKimlik;

}
