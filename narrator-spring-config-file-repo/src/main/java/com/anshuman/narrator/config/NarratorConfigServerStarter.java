package com.anshuman.narrator.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NarratorConfigServerStarter {

    public static void main(String []args) {
        SpringApplication.run(NarratorConfigServerStarter.class,args);
    }

}
