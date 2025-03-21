package com.projeto.springdb.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.projeto.springdb.entities.tasks;
import com.projeto.springdb.repository.tasksRepository;

@Service
public class tasksService {
    @Autowired
    private final tasksRepository repository;

    public tasksService(tasksRepository repository) {
        this.repository = repository;
    }

    public List<tasks> listarTodas(Pageable pageable) {
        return repository.findAll();
    }

    public Optional<tasks> buscarPorId(UUID id) {
        return repository.findById(id);
    }

    public tasks salvar(tasks task) {
        return repository.save(task);
    }

    public void deletar(UUID id) {
        repository.deleteById(id);
    }
}