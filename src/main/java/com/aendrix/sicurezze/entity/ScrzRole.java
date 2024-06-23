package com.aendrix.sicurezze.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "scrz_role")
@Data
public class ScrzRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "code")
    private String code;
    @Column(name = "idapp")
    private long idapp;

}
