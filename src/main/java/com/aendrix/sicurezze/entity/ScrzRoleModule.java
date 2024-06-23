package com.aendrix.sicurezze.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "scrz_role_module")
public class ScrzRoleModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "idrole")
    private long idrole;

    @Column(name = "idmodule")
    private long idmodule;


}
