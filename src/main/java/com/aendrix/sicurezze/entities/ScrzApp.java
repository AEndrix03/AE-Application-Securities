package com.aendrix.sicurezze.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="scrz_app")
public class ScrzApp {

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
  private java.sql.Date insertdate;

  @Column(name = "updatedate")
  private java.sql.Date updatedate;

  @Column(name = "owner")
  private String owner;


}
