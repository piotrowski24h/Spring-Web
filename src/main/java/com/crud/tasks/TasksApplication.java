package com.crud.tasks;

import com.crud.tasks.domian.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);

		TaskDto task = new TaskDto(1L, "test", "test context");
		System.out.println(task.getContent());
	}

}
