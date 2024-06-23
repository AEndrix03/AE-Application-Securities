package com.aendrix.sicurezze.repositories;

import com.aendrix.sicurezze.dto.ApplicationDto;
import com.aendrix.sicurezze.entity.QScrzApp;
import com.aendrix.sicurezze.entity.ScrzApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.QuerydslUtils;
import org.springframework.stereotype.Repository;

public interface ScrzAppRepository extends JpaRepository<ScrzApp, Long>, ScrzAppRepositoryCustom, QuerydslPredicateExecutor<QScrzApp>, JpaSpecificationExecutor<ScrzApp> {

    @Repository
    class ScrzAppRepositoryImpl implements ScrzAppRepositoryCustom {

        @Autowired
        private ScrzAppRepository scrzAppRepository;

        @Autowired
        private QuerydslUtils qu;


        @Override
        public ApplicationDto getApplicationByCode(String code) {
            return null;
        }

    }

}

