package com.aendrix.sicurezze.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "scrz_user_role")
public class ScrzUserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "iduser")
    private long iduser;

    @Column(name = "idrole")
    private long idrole;
}
