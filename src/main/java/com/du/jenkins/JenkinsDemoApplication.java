package com.du.jenkins;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableKnife4j
@SpringBootApplication
public class JenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
