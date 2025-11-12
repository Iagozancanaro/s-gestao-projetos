package com.iagozancanaro.s_gestao_projetos.domain;

import com.iagozancanaro.s_gestao_projetos.enums.Priority;
import com.iagozancanaro.s_gestao_projetos.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "task")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private LocalDateTime dueDate;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

}
