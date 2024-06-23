package com.aendrix.sicurezze.repositories;

import com.aendrix.sicurezze.dto.ApplicationDto;

public interface ScrzAppRepositoryCustom {

    ApplicationDto getApplicationByCode(String code);
}


