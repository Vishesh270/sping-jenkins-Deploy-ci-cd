package com.jenkins_build.spring_jenkins;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringJenkinsApplication.class, args);
		System.out.println("Hi i am from project  ");

	}

}
