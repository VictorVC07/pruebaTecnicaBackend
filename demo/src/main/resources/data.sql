
-- Crear la tabla "users" si no existe
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS post (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    content TEXT,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);

-- Insertar usuarios
INSERT INTO users (id, name) VALUES (1,'usuario1');
INSERT INTO users (id, name) VALUES (2,'usuario2');



-- Insertar publicaciones
INSERT INTO post (title, content, user_id) VALUES ('Título 1', 'Contenido 1', 1);
INSERT INTO post (title, content, user_id) VALUES ('Título 2', 'Contenido 2', 2);