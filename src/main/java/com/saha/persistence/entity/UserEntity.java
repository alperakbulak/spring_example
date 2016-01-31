package com.saha.persistence.entity;

import java.util.Date;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(schema ="personel", name = "users")
@Getter
@Setter
public class UserEntity extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 120, unique = true, updatable = true)
    private String userName;

    @Column
    private String name;

    @Column
    private String lastName;

    @OneToOne(fetch = FetchType.LAZY)
    private ProfileEntity profile;

    @OneToMany(mappedBy = "userEntity", 
               cascade  = {CascadeType.MERGE,CascadeType.REMOVE},
               fetch    = FetchType.LAZY)
    private List<TweetEntity> tweets;
     

}