package com.aendrix.sicurezze.repositories;

import com.aendrix.sicurezze.entity.ScrzApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScrzAppRepository extends JpaRepository<ScrzApp, Long> {

    ScrzApp getApplicationByCode(String code);
}

