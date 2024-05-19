package com.aendrix.sicurezze.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "scrz_type")
public class ScrzType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")

    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

}
