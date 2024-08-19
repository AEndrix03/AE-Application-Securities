package com.aendrix.sicurezze.controllers;

import com.aendrix.sicurezze.dto.ApplicationDto;
import com.aendrix.sicurezze.services.general.ScrzAppService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(ROOT + "/applications")
    public void createApplication(@RequestBody ApplicationDto applicationDto) throws BadRequestException {
        scrzAppService.createApplication(applicationDto);
    }

    @PostMapping(ROOT + "/applications/update")
    public ApplicationDto updateApplication(@RequestBody ApplicationDto applicationDto) throws BadRequestException {
        return scrzAppService.updateApplication(applicationDto);
    }

    @GetMapping(ROOT + "/applications/{code}")
    public ApplicationDto getApplicationByCode(@PathVariable String code) throws BadRequestException {
        return scrzAppService.getApplicationByCode(code);
    }

}
