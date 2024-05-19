package com.aendrix.sicurezze.services.general;

import com.aendrix.sicurezze.dto.ApplicationDto;
import com.aendrix.sicurezze.repositories.ScrzAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScrzAppServiceImpl implements ScrzAppService {

    @Autowired
    private ScrzAppRepository scrzAppRepository;

    public List<ApplicationDto> getAllApplications() {
        return scrzAppRepository.findAll()
                .stream()
                .map(app -> ApplicationDto.builder()
                        .id(app.getId())
                        .code(app.getCode())
                        .name(app.getName())
                        .description(app.getDescription())
                        .build())
                .toList();
    }

    @Override
    public void createApplication(ApplicationDto applicationDto) {

        scrzAppRepository.save(applicationDto.toEntity());
    }


}
