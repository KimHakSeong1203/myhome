package com.palap.myhome.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Role {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
