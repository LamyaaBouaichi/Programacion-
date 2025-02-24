create DATABASE stream_web;
use stream_web;

create table usuarios (
    id_usuario int AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (200),
    email VARCHAR (200),
    edad INT,
    plan_base ENUM ('Básico', 'Estandar', 'Premium') not NULL,
    paquete_ad ENUM('Deporte', 'Cine', 'Infantil') not NULL,
    duracion ENUM ('Mensual', 'Anual') not NULL,
    coste_total DECIMAL (5, 2),
    fecha_alta DATETIME
);