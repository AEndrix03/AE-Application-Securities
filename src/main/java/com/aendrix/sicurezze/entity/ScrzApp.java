package com.aendrix.sicurezze.entity;

import com.aendrix.sicurezze.dto.ApplicationDto;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "scrz_app")
@Entity
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

    public ApplicationDto toDto() {
        return ApplicationDto.builder()
                .id(id)
                .name(name)
                .description(description)
                .code(code)
                .build();
    }

}
