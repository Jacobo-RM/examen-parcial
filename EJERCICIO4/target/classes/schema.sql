CREATE TABLE director (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    nacionalidad VARCHAR(100),
    fecha_nacimiento VARCHAR(100)
);

CREATE TABLE peliculas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    director_id INT,
    fecha_estreno VARCHAR(100),
    rating INT,
    FOREIGN KEY (director_id) REFERENCES director(id)
);
