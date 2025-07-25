package com.ashu.Monolithic;

import com.ashu.Monolithic.Model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MonolithicApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(MonolithicApplication.class, args);
		Teacher beanteacher = applicationContext.getBean(Teacher.class);
		System.out.println("Teacher Bean"+beanteacher);
	}

}
