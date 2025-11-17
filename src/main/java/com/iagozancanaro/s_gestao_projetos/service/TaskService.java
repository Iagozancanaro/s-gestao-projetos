package com.iagozancanaro.s_gestao_projetos.service;

import com.iagozancanaro.s_gestao_projetos.domain.Project;
import com.iagozancanaro.s_gestao_projetos.domain.Task;
import com.iagozancanaro.s_gestao_projetos.enums.Status;
import com.iagozancanaro.s_gestao_projetos.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final ProjectService projectService;

    public Task saveTask(Task task) {
        if (task.getProject() == null || task.getProject().getId() == null) {
            throw new IllegalArgumentException("Task must have a project with id");
        }
        task.setProject(this.findProject(task.getProject().getId()));
        return taskRepository.save(task);
    }

    private Project findProject(Long projectId) {
        return projectService.findById(projectId)
                .orElseThrow(() -> new IllegalArgumentException("Project with id " + projectId + " not found"));
    }

    public Task updateTask(Long id, Status novoStatus) {
        if (novoStatus == null) {
            throw new IllegalArgumentException("Task status cannot be null.");
        }
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Task with id " + id + " not found"));
       task.setStatus(novoStatus);
       return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
