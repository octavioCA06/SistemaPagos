-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-10-2022 a las 20:53:29
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemapagos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ineso`
--

CREATE TABLE `ineso` (
  `Folio` int(5) NOT NULL,
  `Alumno` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Paciente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Grupo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Ciclo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Fecha` date NOT NULL,
  `Concepto` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Tratamiento` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Observaciones` varchar(250) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `usuario_creacion` int(3) NOT NULL DEFAULT 1,
  `fecha_modificacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `usuario_modificacion` int(3) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `ineso`
--

INSERT INTO `ineso` (`Folio`, `Alumno`, `Paciente`, `Grupo`, `Ciclo`, `Fecha`, `Concepto`, `Tratamiento`, `Observaciones`, `fecha_creacion`, `usuario_creacion`, `fecha_modificacion`, `usuario_modificacion`) VALUES
(1, 'Mónica Robles', 'Ana Paula Mendoza Figeroa', 'Miércoles - Grupo 3', 'Febrero - Junio 2023', '2022-07-09', 'Clínica $300', 'Ortopedia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(2, 'Ximena Flores De La Fuente ', 'Camila Flores De La Fuente', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortodoncia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(4, 'Liliana Aguilar López ', 'Daniela Gónzalez Ayala', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortopedia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(5, 'Ximena Flores De La Fuente ', 'Fernando Martínez Nuñéz', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $200', 'Ortopedia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(7, 'Mariana Montiel Fernandez', 'Jacinta Perez Becerril', 'Jueves Grupo 5', 'Marzo - Agosto 2023', '2022-08-02', 'Clínica $200', 'Ortopedia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(8, 'Ana', 'Jorge', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortodoncia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(9, 'Mónica Robles ', 'Julián Camacho ', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortopedia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(10, 'Juan Garcia', 'Lupita torres', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-12', 'Clínica $200', 'Ortopedia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(11, 'sol', 'maria', 'Jueves - Grupo 5', 'Febrero - Junio 2023', '2022-08-22', 'Clínica $300', 'Ortopedia', 'pago de colegiatura', '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(12, 'Ximena Flores De La Fuente ', 'Maria Gónzalez Vega', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortodoncia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(13, 'xime', 'moni', 'Miércoles - Grupo 3 / 3° Semestre', 'Marzo - Agosto 2023', '2022-08-24', 'Clínica $300', 'Ortopedia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(14, 'juanita', 'pedrita', 'Jueves - Grupo 5', 'Febrero - Junio 2023', '2022-08-23', 'Clínica $200', 'Ortodoncia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(15, 'carmen', 'pedro', 'Viernes - Grupo 1 / 6° Semestre ', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300', 'Ortodoncia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(16, 'regina', 'rebeca', 'Lunes - Grupo 2 / 5° Semestre', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300', 'Ortodoncia', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(20, 'jose', 'maria', 'Lunes - Grupo 2 / 5° Semestre', 'Septiembre - Febrero 2022', '2022-10-03', 'Clínica $200', 'Ortodoncia', 'pago quincenal, modificado por octavio', '2022-10-04 05:00:00', 2, '2022-10-04 18:42:07', 2);

--
-- Disparadores `ineso`
--
DELIMITER $$
CREATE TRIGGER `modificacion_ineso_update` BEFORE UPDATE ON `ineso` FOR EACH ROW set new.fecha_modificacion = CURRENT_TIMESTAMP
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inpro`
--

CREATE TABLE `inpro` (
  `Folio` int(5) NOT NULL,
  `Alumno` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Paciente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Grupo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Ciclo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Fecha` date NOT NULL,
  `Concepto` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Observaciones` varchar(250) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `usuario_creacion` int(3) NOT NULL DEFAULT 1,
  `fecha_modificacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `usuario_modificacion` int(3) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `inpro`
--

INSERT INTO `inpro` (`Folio`, `Alumno`, `Paciente`, `Grupo`, `Ciclo`, `Fecha`, `Concepto`, `Observaciones`, `fecha_creacion`, `usuario_creacion`, `fecha_modificacion`, `usuario_modificacion`) VALUES
(1, 'Ximena Flores De La Fuente', 'Camila Flores De La Fuente', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(2, 'corazon', 'de melon', 'Miércoles - Grupo 3 - 4° Sem', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(3, 'bolita', 'doggy', 'Martes - Grupo 4 - 3° Sem', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300', 'pago', '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(4, 'lupis', 'drupis', 'Miércoles - Grupo 3', 'Febrero - Junio 2023', '2022-08-22', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(5, 'Marian Gómez Flores', 'Emilio Mondragón Fernandéz', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(6, 'mario', 'fer', 'Miércoles - Grupo 3 / 4° Semestre', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300', 'adios', '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(7, 'Ximena Flores De La Fuente ', 'Fernando Montoya Cruz', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(8, 'Marian Gómez Flores', 'Jorge Martínez Mendoza', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(9, 'Diana Carrillo Castillo', 'Karla Beatriz Olvera', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(10, 'Ximena Flores De La Fuente', 'Mariza Aguilar Olivares', 'Miércoles - Grupo 3', 'Febrero - Junio 2023', '2022-07-09', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(11, 'Ximena Flores De La Fuente ', 'Mónica Espinoza Torres', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-09', 'Clínica $300', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(12, 'Marian Gómez Flores', 'Paulina Fernandez Carrillo', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $200', NULL, '2022-10-04 05:00:00', 1, '2022-10-04 05:00:00', 1),
(13, 'cristian', 'alicia', 'Martes - Grupo 4 / 3° Semestre', 'Septiembre - Febrero 2022', '2022-10-04', 'Clínica $200', 'pago semanal, modificado por octavio', '2022-10-04 05:00:00', 1, '2022-10-04 18:49:32', 2);

--
-- Disparadores `inpro`
--
DELIMITER $$
CREATE TRIGGER `modificacion_inpro_update` BEFORE UPDATE ON `inpro` FOR EACH ROW set new.fecha_modificacion = CURRENT_TIMESTAMP
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(3) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre`, `contrasena`) VALUES
(1, 'admin', 'admin'),
(2, 'octavio', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ineso`
--
ALTER TABLE `ineso`
  ADD PRIMARY KEY (`Folio`),
  ADD KEY `ineso_usuario_creacion_FK` (`usuario_creacion`) USING BTREE,
  ADD KEY `ineso_usuario_modificacion_FK` (`usuario_modificacion`) USING BTREE;

--
-- Indices de la tabla `inpro`
--
ALTER TABLE `inpro`
  ADD PRIMARY KEY (`Folio`),
  ADD KEY `inpro_usuario_creacion_FK` (`usuario_creacion`),
  ADD KEY `inpro_usuario_modificacion_FK` (`usuario_modificacion`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ineso`
--
ALTER TABLE `ineso`
  MODIFY `Folio` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `inpro`
--
ALTER TABLE `inpro`
  MODIFY `Folio` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ineso`
--
ALTER TABLE `ineso`
  ADD CONSTRAINT `usuario_creacion_FK` FOREIGN KEY (`usuario_creacion`) REFERENCES `usuarios` (`id_usuario`),
  ADD CONSTRAINT `usuario_modificacion_FK` FOREIGN KEY (`usuario_modificacion`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `inpro`
--
ALTER TABLE `inpro`
  ADD CONSTRAINT `inpro_usuario_creacion_FK` FOREIGN KEY (`usuario_creacion`) REFERENCES `usuarios` (`id_usuario`),
  ADD CONSTRAINT `inpro_usuario_modificacion_FK` FOREIGN KEY (`usuario_modificacion`) REFERENCES `usuarios` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
