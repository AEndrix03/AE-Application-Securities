package com.aendrix.sicurezze.services.general;

import com.aendrix.sicurezze.dto.ApplicationDto;

import java.util.List;

public interface ScrzAppService {

    List<ApplicationDto> getAllApplications();

    void createApplication();
}
