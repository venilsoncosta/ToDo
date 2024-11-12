package com.venilson.todo;

import com.venilson.todo.model.Status;
import com.venilson.todo.model.Tarefa;
import com.venilson.todo.repository.TarefaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Bean
	public CommandLineRunner LoadData(TarefaRepository tarefaRepository){
		return args -> {
			Tarefa tarefa1 = new Tarefa(null, "jogar bola", "ir jogar no ginásio da cidade",
					LocalDateTime.now(), Status.EM_ANDAMENTO);

			tarefaRepository.save(tarefa1);
		};
	}
}
