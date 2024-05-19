package com.aendrix.sicurezze.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "scrz_user")
public class ScrzUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "mail")
    private String mail;

    @Column(name = "phone")
    private String phone;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "password")
    private String password;

    @Column(name = "lastlogin")
    private java.sql.Time lastlogin;

}
