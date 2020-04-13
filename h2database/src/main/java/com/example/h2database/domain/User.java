package com.example.h2database.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME")
    private String name;
    @Column(name="SEX")
    private String sex;
    @Column(name="AGE")
    private int age;
    @CreatedDate
    @Column(name="CREATE_TIME")
    private Date createTime;
    @LastModifiedDate
    @Column(name="MODIFY_TIME")
    private Date updateTime;
}
