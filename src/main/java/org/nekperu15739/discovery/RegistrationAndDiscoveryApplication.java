package org.nekperu15739.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author nekperu15739
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistrationAndDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationAndDiscoveryApplication.class, args);
    }

}
