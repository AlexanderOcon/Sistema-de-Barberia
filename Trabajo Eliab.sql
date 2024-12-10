CREATE DATABASE  IF NOT EXISTS Barberia;

USE Barberia;

CREATE TABLE Empleados (
  id_empleado INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100),      
  telefono VARCHAR(10),
  email VARCHAR(150),
  direccion VARCHAR(255)
);

CREATE TABLE Proveedores (
  id_proveedor INT PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(50),
  Apellido VARCHAR(50),
  Email VARCHAR(150),
  Telefono VARCHAR(10),    
  Url VARCHAR(200)
);

CREATE TABLE Productos (
  id_producto INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(150),
  descripcion VARCHAR(500), 
  precio FLOAT (10,2)
);

CREATE TABLE Detalle_Ventas (
  id_detalle_venta INT PRIMARY KEY AUTO_INCREMENT,
  id_venta INT,
  id_producto INT,
  cantidad INT
);

CREATE TABLE Ventas (
  id_venta INT PRIMARY KEY AUTO_INCREMENT,
  id_cliente INT,
  id_empleado INT,
  metodopagoV VARCHAR(20),
  fecha_venta DATE
);

CREATE TABLE Cliente (
  id_cliente INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100),      
  apellido VARCHAR(100),    
  telefono VARCHAR(20)      
);
  
  -- INSERTAR REGISTROS EMPLEADOS
INSERT INTO Empleados (nombre, telefono, email, direccion) VALUES ('Jeyner Perez Alvarez', '85080712', 'Jeynergeme23@gmail.com', 'Subida la gaviota,media cuadra al sur,Juigalpa');
INSERT INTO Empleados (nombre, telefono, email, direccion) VALUES (' Jorge Luis Pérez', '85203013', 'luisPerez@gmail.com', 'El tule, San miguelito');
INSERT INTO Empleados (nombre, telefono, email, direccion) VALUES ('María Jose López', '85080714', 'mariaLopez@gmail.com', 'Cancha padre miguel media al norte,Juigalpa');
INSERT INTO Empleados (nombre, telefono, email, direccion) VALUES ('Jostin Jose  Martínez', '60984929', 'jostinMartinez@gmail.com', 'Calle de la Libertad ');
INSERT INTO Empleados (nombre, telefono, email, direccion) VALUES ('Jasson Perez Alvarez', '57917648', 'Jassongeme23@gmail.com', 'Subida la gaviota,media cuadra al sur,Juigalpa');



-- INSERTAR REGISTROS PROVEEDORES
 INSERT INTO Proveedores (Nombre, Apellido, email , telefono, URL) VALUES ('Jasson ', 'Perez Alvarez','Jassongeme23@gmail.com','57917648', 'https//:herramientasparabarberos.com.ni');
 INSERT INTO Proveedores (Nombre, Apellido, email , telefono, URL) VALUES ('Jeyner ', 'Perez Alvarez','Jeynergeme01@gmail.com','84405563', 'https//:herramientasparabarberos.com.ni');
 INSERT INTO Proveedores (Nombre, Apellido, email , telefono, URL) VALUES ('Brandon ', 'Hermida Ocon','alexanderocon514@gmail.com','58395338', 'https//:herramientasparabarberos.com.ni');
 INSERT INTO Proveedores (Nombre, Apellido, email , telefono, URL) VALUES ('Ariel ', 'Suarez Marin','arielsuarez22@gamil.com','58296795', 'https//:herramientasparabarberos.com.ni');



-- INSERTAR REGISTROS CLIENTE
INSERT INTO Cliente (nombre, apellido, telefono) VALUES ('Carlos', 'López', '81234567');
INSERT INTO Cliente (nombre, apellido, telefono) VALUES ('Ana', 'Martínez', '84567890');
INSERT INTO Cliente (nombre, apellido, telefono) VALUES ('Luis', 'García', '85123456');
INSERT INTO Cliente (nombre, apellido, telefono) VALUES ('María', 'Hernández', '87456321');
INSERT INTO Cliente (nombre, apellido, telefono) VALUES ('Javier', 'Pérez', '89012345');


-- INSERTAR REGISTROS PRODUCTOS
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Máquina de Cortar Cabello', 'Máquina eléctrica para cortar cabello', 1200.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Tijeras Profesionales', 'Tijeras de precisión para corte de cabello', 250.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Gel para Peinar', 'Gel fijador para cabello', 75.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Crema Afeitar', 'Crema suave para afeitar', 120.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Secador de Pelo', 'Secador profesional para cabello', 950.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Cera para Peinar', 'Cera modeladora para el cabello', 90.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Maquina de Rasurar', 'Máquina para afeitar con batería recargable', 1100.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Aftershave', 'Loción calmante post-afeitado', 85.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Espuma Afeitar', 'Espuma para afeitar de acción suave', 65.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Shampoo Capilar', 'Shampoo para cabellos grasos', 120.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Aceite para Barba', 'Aceite hidratante para barba', 250.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Cortaúñas Profesional', 'Cortaúñas de acero inoxidable', 45.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Brocha para Afeitar', 'Brocha de cerdas suaves para aplicar crema de afeitar', 100.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Razor Blade', 'Cuchilla de afeitar de repuesto', 35.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Pomada para Cabello', 'Pomada para dar fijación al peinado', 150.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Cera para Cabello', 'Cera flexible para modelar el cabello', 80.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Tijeras de Despuntar', 'Tijeras para desmechar y dar forma al corte', 120.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Máquina para Barba', 'Máquina para recortar barba y bigote', 800.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Toalla Facial', 'Toalla de algodón para uso facial', 30.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Corta Cabello Profesional', 'Máquina profesional para cortar cabello con ajuste de longitud', 1600.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Peine de Barbero', 'Peine de acero inoxidable para el corte de cabello', 70.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Aceite Capilar', 'Aceite reparador para el cuero cabelludo', 220.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Loción Capilar', 'Loción para fortalecer el cabello', 95.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Lima de Uñas', 'Lima profesional para uñas de manos y pies', 40.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Bálsamo para Barba', 'Bálsamo hidratante para barba', 180.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Espuma de Afeitar', 'Espuma para afeitar suave y refrescante', 70.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Mascarilla Capilar', 'Mascarilla hidratante para cabellos secos', 200.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Hidratante para Barba', 'Crema hidratante para barba y piel', 140.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Cepillo para Cabello', 'Cepillo de cerdas suaves para el cuidado capilar', 55.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Shampoo para Barba', 'Shampoo específico para barba', 100.00);
INSERT INTO Productos (nombre, descripcion, precio) VALUES ('Cortadora de Cabello', 'Cortadora de cabello con múltiples accesorios', 950.00);


-- INSERTAR REGISTROS VENTAS
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (1, 1, 'Tarjeta', '2024-10-24');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (2, 2, 'Efectivo', '2024-10-25');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (3, 3, 'Tarjeta', '2024-10-26');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (4, 4, 'Efectivo', '2024-10-27');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (5, 5, 'Tarjeta', '2024-10-28');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (6, 1, 'Efectivo', '2024-10-29');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (7, 2, 'Tarjeta', '2024-10-30');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (8, 3, 'Efectivo', '2024-10-31');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (9, 4, 'Tarjeta', '2024-11-01');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (10, 5, 'Efectivo', '2024-11-02');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (11, 1, 'Tarjeta', '2024-11-03');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (12, 2, 'Efectivo', '2024-11-04');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (13, 3, 'Tarjeta', '2024-11-05');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (14, 4, 'Efectivo', '2024-10-24');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (15, 5, 'Tarjeta', '2024-10-25');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (16, 1, 'Efectivo', '2024-10-26');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (17, 2, 'Tarjeta', '2024-10-27');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (18, 3, 'Efectivo', '2024-10-28');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (19, 4, 'Tarjeta', '2024-10-29');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (20, 5, 'Efectivo', '2024-10-30');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (21, 1, 'Tarjeta', '2024-10-31');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (22, 2, 'Efectivo', '2024-11-01');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (23, 3, 'Tarjeta', '2024-11-02');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (24, 4, 'Efectivo', '2024-11-03');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (25, 5, 'Tarjeta', '2024-11-04');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (26, 1, 'Efectivo', '2024-11-05');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (27, 2, 'Tarjeta', '2024-10-24');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (28, 3, 'Efectivo', '2024-10-25');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (29, 4, 'Tarjeta', '2024-10-26');
INSERT INTO Ventas (id_cliente, id_empleado, metodopagoV, fecha_venta) VALUES (30, 5, 'Efectivo', '2024-10-27');


-- INSERTAR REGISTROS DETALLE_VENTA
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (1, 3, 3);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (2, 7, 1);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (3, 11, 4);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (4, 15, 2);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (5, 19, 3);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (6, 23, 5);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (7, 27, 2);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (8, 30, 1);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (9, 2, 4);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (10, 6, 3);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (11, 10, 5);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (12, 14, 2);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (13, 18, 1);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (14, 22, 3);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (15, 26, 4);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (16, 1, 2);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (17, 4, 3);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (18, 8, 1);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (19, 12, 4);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (20, 16, 2);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (21, 20, 2);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (22, 24, 3);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (23, 28, 5);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (24, 29, 1);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (25, 5, 4);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (26, 9, 1);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (27, 13, 3);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (28, 17, 2);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (29, 21, 5);
INSERT INTO Detalle_Ventas (id_venta, id_producto, cantidad) VALUES (30, 25, 3);

-- LEER REGISTROS
SELECT * FROM Empleados;
SELECT * FROM Cliente;
SELECT * FROM Productos;
SELECT * FROM Ventas;
SELECT * FROM Proveedores; 
SELECT * FROM Detalle_Ventas;

-- SELECT AVANZADOS DEL GRUPO 6
SELECT * FROM Empleados;

SELECT nombre, telefono 
FROM Cliente;

SELECT * FROM Empleados
 WHERE direccion LIKE '%Juigalpa%';
 
SELECT * FROM Productos
 WHERE nombre LIKE '%Cabello%';
 
SELECT * FROM Cliente 
ORDER BY apellido ASC;

SELECT * FROM Ventas 
WHERE fecha_venta BETWEEN '2024-10-24' 
AND '2024-10-30';

SELECT dv.id_detalle_venta, dv.id_venta, dv.cantidad, p.nombre 
AS producto_nombre, p.precio FROM Detalle_Ventas dv 
JOIN Productos p ON dv.id_producto = p.id_producto;

SELECT COUNT(*) AS total_ventas FROM Ventas;
SELECT SUM(cantidad) AS total_vendido 
FROM Detalle_Ventas 
WHERE id_producto = 3;

SELECT AVG(precio) 
AS precio_promedio FROM Productos;

SELECT MAX(precio) AS precio_maximo, MIN(precio)
 AS precio_minimo FROM Productos;



-- ACTUALIZAR REGISTROS 	
UPDATE Empleados SET telefono = '85080800' WHERE id_empleado = 1;
UPDATE Empleados SET telefono = '85080801' WHERE id_empleado = 2;
UPDATE Cliente SET telefono = '89012346' WHERE id_cliente = 1;
UPDATE Cliente SET telefono = '84567891' WHERE id_cliente = 2;

-- ELIMINAR REGISTROS Detalle_Ventas
DELETE FROM Ventas WHERE id_venta = 1;
DELETE FROM Ventas WHERE id_venta = 2;
DELETE FROM Detalle_Ventas WHERE id_venta = 1;
DELETE FROM Detalle_Ventas WHERE id_venta = 3;
DELETE FROM Empleados WHERE id_empleado = 2;
  
  
SELECT id_producto, nombre, precio FROM productos WHERE id_producto = 1;

ALTER TABLE Ventas ADD FOREIGN KEY (id_cliente) REFERENCES Cliente (id_cliente);

ALTER TABLE Ventas ADD FOREIGN KEY (id_empleado) REFERENCES Empleados (id_empleado);

ALTER TABLE Detalle_Ventas ADD FOREIGN KEY (id_producto) REFERENCES Productos (id_producto);

ALTER TABLE Detalle_Ventas ADD FOREIGN KEY (id_venta) REFERENCES Ventas (id_venta);
