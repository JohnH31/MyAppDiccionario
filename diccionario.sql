CREATE DATABASE bd_diccionario;
USE bd_diccionario;
CREATE TABLE tbl_palabra(
	id_palabra INT PRIMARY KEY AUTO_INCREMENT,
	nombre_palabra VARCHAR(25) NOT NULL,
	significado_palabra VARCHAR(100) NOT NULL
);

SELECT * FROM tbl_palabra;

INSERT INTO tbl_palabra (nombre_palabra, significado_palabra)
VALUES ('abandonar', 'Dejar solo, sin atención, sin cuidados a una persona, un animal o una cosa.'),('abanico', 'Objeto que sirve para dar aire.'),
('abecedario', 'Conjunto de letras de un idioma ordenadas por orden alfabético.'),('abeja', 'Insecto de color amarillo y negro. Las abejas fabrican miel y cera.'),
('baño', 'Habitación de una casa o de un edificio destinada al aseo. El baño suele tener bañera o ducha, lavabo y retrete.'),('bacteria', 'Organismo muy pequeño que a veces produce enfermedades.'),
('balón', 'Pelota grande llena de aire que sirve para jugar y practicar deportes.'),('balcón', 'Espacio de la casa que sobresale hacia el exterior. Tiene barandilla.'),
('caña', 'Tallo hueco de las plantas.'),('cañón', 'Arma de gran tamaño con forma de tubo. Dispara proyectiles de hierro con forma de bola.'),
('cabaña', 'Casa pequeña hecha de ramas, cañas o troncos que suele estar en el campo.'),('caballo', 'Animal mamífero macho de tamaño mediano o grande. Tiene la cabeza alargada y las orejas pequeñas.'),
('cabello', 'Conjunto de pelos de la cabeza de una persona.'),('cabestrillo', 'Pañuelo o banda que se cuelga del hombro para inmovilizar un brazo o un hombro lesionado.'),
('danzar', 'Bailar al ritmo de una música.'),('débil', 'Persona o cosa que tiene poca fuerza o poca resistencia.'),
('debate', 'Discusión o intercambio de opiniones entre varias personas sobre un tema.'),('deber', 'Tarea u obligación de hacer algo por la ley o la moral.'),
('edificio', 'Construcción hecha con materiales resistentes. Los edificios pueden ser viviendas, oficinas, fábricas, escuelas y otras muchas cosas.'),
('habilidad', 'Cualidad de la persona que puede hacer cosas bien y con mucha facilidad.');