package com.aendrix.sicurezze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.aendrix.sicurezze"})

public class SicurezzeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SicurezzeApplication.class, args);
    }

}
