package com.example.alibu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlibuApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(AlibuApplication.class, args);

	MyFirstService myFirstService= ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());


}

}
