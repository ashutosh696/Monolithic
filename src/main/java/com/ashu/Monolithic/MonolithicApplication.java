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

		Student bean = applicationContext.getBean("ashu",Student.class);
		System.out.println("Student bean "+bean.getName());
	}

	@Bean("ashu")
	@Primary // if same type of two beans eg.Student exist,  use @Primary to inject this bean
	public Student getBean()
	{

		return  new Student(1,"Ashu");

	}

	@Bean("neha")// define name of bean for using @Qualifier to inject this bean if same type of two beans eg.Student exist
	public Student getBeans()
	{

		return  new Student(2,"Neha");

	}


}
