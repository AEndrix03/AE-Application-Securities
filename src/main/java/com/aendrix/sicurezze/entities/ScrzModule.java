package com.aendrix.sicurezze.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "scrz_module")
public class ScrzModule {

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

    @Column(name = "insertdate")
    private Date insertdate;

    @Column(name = "updatedate")
    private Date updatedate;

    @Column(name = "owner")
    private String owner;

    @Column(name = "idtype")
    private long idtype;

    @Column(name = "idapp")
    private long idapp;

}
