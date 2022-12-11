package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketingProjectRestV1Application {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectRestV1Application.class, args);
    }





    @Bean
    public ModelMapper mapper(){

        return new ModelMapper();
    }


}
