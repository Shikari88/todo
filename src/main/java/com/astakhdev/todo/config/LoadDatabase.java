package com.astakhdev.todo.config;

import com.astakhdev.todo.model.ToDoLine;
import com.astakhdev.todo.repository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadDatabase {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(TodoRepository todoRepository) {
        return args -> {
            LOGGER.info("Loading " + todoRepository.save(new ToDoLine("Купи продукты", 12, false, new Date())));
            LOGGER.info("Loading " + todoRepository.save(new ToDoLine("Убери дом", 13, false, new Date())));
        };
    }
}
