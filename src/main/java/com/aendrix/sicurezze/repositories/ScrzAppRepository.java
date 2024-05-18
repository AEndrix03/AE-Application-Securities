package com.aendrix.sicurezze.repositories;

import com.aendrix.sicurezze.entities.ScrzApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScrzAppRepository extends JpaRepository<ScrzApp, Long>, ScrzAppRepositoryCustom {

}

