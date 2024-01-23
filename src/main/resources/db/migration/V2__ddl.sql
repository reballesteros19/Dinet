CREATE TABLE persona
(
    id uuid DEFAULT gen_random_uuid(),
    apellido varchar(255),
    nombre varchar(255),
    telefono varchar(255),
    PRIMARY KEY (id)
)