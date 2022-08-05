package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController   //將 RESTful 的功能引入
public class DemoApplication {

    @RequestMapping("/")   //
    public String home(){
        return "Demo2test123";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println( "Hello World!" );
    }

}
