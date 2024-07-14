package com.jarvis.redis.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Entity
@ToString
@Getter
@Setter
@Data
public class Student implements Serializable {
    @Id
    private int id;
    private String name;
    private String country;

}
