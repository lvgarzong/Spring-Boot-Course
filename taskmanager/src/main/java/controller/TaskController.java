/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.example.taskmanager.entity.Task;
import com.example.taskmanager.service.TaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lvgarzon
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')") 
    public List<Task> getAll() {
        return taskService.findAll();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')") 
    public Task create(@RequestBody Task task) {
        return taskService.save(task);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')") 
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        return taskService.update(id, task);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')") 
    public void delete(@PathVariable Long id) {
        taskService.delete(id);
    }
}