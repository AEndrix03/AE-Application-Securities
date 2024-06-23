package com.aendrix.sicurezze.dto;

import com.aendrix.sicurezze.entity.ScrzApp;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ApplicationDto {

    private long id;
    private String name;
    private String description;
    private String code;

    public ScrzApp toEntity() {
        ScrzApp app = new ScrzApp();
        app.setId(id);
        app.setName(name);
        app.setDescription(description);
        app.setCode(code);
        return app;
    }
}
