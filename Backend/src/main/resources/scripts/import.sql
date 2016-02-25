-- UserRole data
INSERT INTO user_role (id, name, role) VALUES (1, 'ADMIN', 'ADMIN');
-- User
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (1,'Admin', 'Fodd','admin@email.com','admin@email.com', TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (2,'Joze', 'Carlos','jozecarlos@email.com','jozecarlos@email.com', TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (3,'Rodrigo', 'Silva','rodrigo@email.com', 'rodrigo@email.com',TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (4,'Edmilson', 'Silva','edmilson@email.com','edmilson@email.com', TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);
