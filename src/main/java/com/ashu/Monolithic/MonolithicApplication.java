package com.ashu.Monolithic;

import com.ashu.Monolithic.Model.Student;
import com.ashu.Monolithic.Model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class MonolithicApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(MonolithicApplication.class, args);
		Teacher beanteacher = applicationContext.getBean(Teacher.class);
		System.out.println("Teacher Bean"+beanteacher);

		Student bean = applicationContext.getBean(Student.class);
		System.out.println("Student bean "+bean.getName());
	}

	@Bean
	public Student getBean()
	{

		return  new Student(1,"Ashu");

	}


}
