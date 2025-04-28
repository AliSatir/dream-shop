package com.dailycodework.dreamshops.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Role() {
    }


    public Role(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users = new HashSet<>();

}
