CREATE TABLE task (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50),
    priority VARCHAR(50),
    due_date TIMESTAMP,
    project_id BIGINT,
    CONSTRAINT fk_task_project
        FOREIGN KEY (project_id)
        REFERENCES project (id)
        ON DELETE CASCADE
);