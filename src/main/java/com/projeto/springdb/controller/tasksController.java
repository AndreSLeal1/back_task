package com.projeto.springdb.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.springdb.entities.tasks;
import com.projeto.springdb.service.tasksService;

@RestController
@RequestMapping("/tasks")
public class tasksController {

    private final tasksService service;

    public tasksController(tasksService service) {
        this.service = service;
    }

    @GetMapping
    public List<tasks> listar(Pageable pageable) {
        return service.listarTodas(pageable);
    }

    @GetMapping("/{id}")
    public tasks buscarPorId(@PathVariable UUID id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("task não encontrada."));
    }

    @PostMapping
    public tasks criar(@RequestBody tasks tarefa) {
        return service.salvar(tarefa);
    }

    @PutMapping("/{id}")
    public tasks atualizar(@PathVariable UUID id, @RequestBody tasks task) {
        task.setId(id);
        return service.salvar(task);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        service.deletar(id);
    }
}
