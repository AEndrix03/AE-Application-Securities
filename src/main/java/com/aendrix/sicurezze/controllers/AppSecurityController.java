package com.aendrix.sicurezze.controllers;

import com.aendrix.sicurezze.dto.ApplicationDto;
import com.aendrix.sicurezze.services.general.ScrzAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppSecurityController {

    private final String ROOT = "appsec";

    @Autowired
    private ScrzAppService scrzAppService;

    @GetMapping(ROOT + "/applications")
    public List<ApplicationDto> getApplications() {
        return scrzAppService.getAllApplications();
    }
    
}
