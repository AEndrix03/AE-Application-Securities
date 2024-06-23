package com.aendrix.sicurezze.services.general;

import com.aendrix.sicurezze.dto.ApplicationDto;
import org.apache.coyote.BadRequestException;

import java.util.List;

public interface ScrzAppService {

    List<ApplicationDto> getAllApplications();

    void createApplication(ApplicationDto applicationDto) throws BadRequestException;

    ApplicationDto updateApplication(ApplicationDto applicationDto) throws BadRequestException;
}
