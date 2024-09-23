package com.estudos.java.repository;

import com.estudos.java.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long> {
}
