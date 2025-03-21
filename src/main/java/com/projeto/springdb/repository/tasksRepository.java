

package com.projeto.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.springdb.entities.tasks;

import java.util.UUID;
@Repository
public interface tasksRepository extends JpaRepository<tasks, UUID> {

    tasks save(tasks task);
}
