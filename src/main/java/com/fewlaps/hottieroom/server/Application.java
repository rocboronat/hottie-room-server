package com.fewlaps.hottieroom.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Application {

    public static final Repository repository = new Repository();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
