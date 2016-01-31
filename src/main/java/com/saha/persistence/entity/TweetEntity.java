package com.saha.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Entity
@Table(schema = "personel", name = "tweets")
public class TweetEntity extends BaseEntity{

    @Getter
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Getter 
    private String content;
 
    @ManyToOne
    private UserEntity userEntity;
    
}
