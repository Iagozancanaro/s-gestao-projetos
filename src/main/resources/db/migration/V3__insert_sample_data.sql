-- projetos de exemplo
INSERT INTO project (name, description, start_date, end_date)
VALUES
('Sistema de Gestão de Projetos', 'Aplicação para gerenciamento de tarefas e equipes.', NOW(), NULL),
('Website Institucional', 'Criação do novo site da empresa.', NOW(), NULL),
('App Mobile de Vendas', 'Aplicativo para controle de pedidos e clientes.', NOW(), NULL);

-- tarefas vinculadas aos projetos
INSERT INTO task (title, description, status, priority, due_date, project_id)
VALUES
('Criar estrutura inicial do backend', 'Configurar projeto Spring Boot e banco de dados.', 'DOING', 'HIGH', NOW() + INTERVAL '5 days', 1),
('Implementar autenticação', 'Adicionar login e controle de acesso.', 'TODO', 'HIGH', NOW() + INTERVAL '10 days', 1),
('Desenhar layout do site', 'Criar protótipos no Figma.', 'DONE', 'MEDIUM', NOW() - INTERVAL '2 days', 2),
('Publicar site no servidor', 'Realizar deploy no ambiente de produção.', 'TODO', 'LOW', NOW() + INTERVAL '15 days', 2),
('Criar API de produtos', 'Implementar endpoints REST.', 'DOING', 'HIGH', NOW() + INTERVAL '7 days', 3),
('Testar fluxo de compras', 'Executar testes manuais e automatizados.', 'TODO', 'MEDIUM', NOW() + INTERVAL '12 days', 3);