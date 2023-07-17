package com.astakhdev.todo.repository;

import com.astakhdev.todo.model.ToDoLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<ToDoLine, Long> {
    List<ToDoLine> findByWhatToDo(String whatToDo);
}
