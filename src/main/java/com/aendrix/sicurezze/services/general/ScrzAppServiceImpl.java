package com.aendrix.sicurezze.services.general;

import com.aendrix.sicurezze.dto.ApplicationDto;
import com.aendrix.sicurezze.entity.ScrzApp;
import com.aendrix.sicurezze.repositories.ScrzAppRepository;
import org.apache.coyote.BadRequestException;
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
                .map(ScrzApp::toDto)
                .toList();
    }

    /*@Override
    public ApplicationDto getApplicationByCode(String code) throws BadRequestException {
        ScrzApp app = scrzAppRepository.findById(id).orElse(null);
        if (app == null) {
            throw new BadRequestException("There is no application with given id.");
        }
        return app.toDto();
    }*/

    @Override
    public void createApplication(ApplicationDto applicationDto) throws BadRequestException {
        if (applicationDto == null) {
            throw new BadRequestException("ApplicationDto cannot be null.");
        }
        scrzAppRepository.save(applicationDto.toEntity());
    }

    @Override
    public ApplicationDto updateApplication(ApplicationDto applicationDto) throws BadRequestException {
        ScrzApp app = scrzAppRepository.findById(applicationDto.getId()).orElse(null);
        if (app == null) {
            throw new BadRequestException("There is no application with given id.");
        }
        app.setCode(applicationDto.getCode());
        app.setName(applicationDto.getName());
        app.setDescription(applicationDto.getDescription());
        return scrzAppRepository.save(app).toDto();
    }


}
