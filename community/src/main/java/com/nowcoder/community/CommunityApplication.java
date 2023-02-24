package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		//1)启动了tomcat
		//2)自动创建了spring容器，创建后自动扫描某些包下的某些bean，并自动装配到容器里
		SpringApplication.run(CommunityApplication.class, args);
	}

}
