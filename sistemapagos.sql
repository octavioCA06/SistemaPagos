-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-08-2022 a las 22:01:53
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
  `Folio` int(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `Alumno` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Paciente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Grupo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Ciclo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Fecha` date NOT NULL,
  `Concepto` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Tratamiento` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `ineso`
--

INSERT INTO `ineso` (`Alumno`, `Paciente`, `Grupo`, `Ciclo`, `Fecha`, `Concepto`, `Tratamiento`) VALUES
('Mónica Robles', 'Ana Paula Mendoza Figeroa', 'Miércoles - Grupo 3', 'Febrero - Junio 2023', '2022-07-09', 'Clínica $300', 'Ortopedia'),
('Ximena Flores De La Fuente ', 'Camila Flores De La Fuente', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortodoncia'),
('Sofia', 'Carmen ', 'Lunes - Grupo 2 / 5° Semestre', 'Septiembre - Febrero 2022', '2022-08-24', 'Clínica $300', 'Ortodoncia'),
('Liliana Aguilar López ', 'Daniela Gónzalez Ayala', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortopedia'),
('Ximena Flores De La Fuente ', 'Fernando Martínez Nuñéz', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $200', 'Ortopedia'),
('Mónica Robles', 'Guadalupe Martínez López', 'Miércoles - Grupo 3', 'Febrero - Junio 2023', '2022-07-10', 'Clínica $300', 'Ortopedia'),
('Mariana Montiel Fernandez', 'Jacinta Perez Becerril', 'Jueves Grupo 5', 'Marzo - Agosto 2023', '2022-08-02', 'Clínica $200', 'Ortopedia'),
('Ana', 'Jorge', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortodoncia'),
('Mónica Robles ', 'Julián Camacho ', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortopedia'),
('Juan Garcia', 'Lupita torres', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-12', 'Clínica $200', 'Ortopedia'),
('sol', 'mar', 'Jueves - Grupo 5', 'Febrero - Junio 2023', '2022-08-22', 'Clínica $300', 'Ortopedia'),
('Ximena Flores De La Fuente ', 'Maria Gónzalez Vega', 'Lunes - Grupo 2', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300', 'Ortodoncia'),
('xime', 'moni', 'Miércoles - Grupo 3 / 3° Semestre', 'Marzo - Agosto 2023', '2022-08-24', 'Clínica $300', 'Ortopedia'),
('juanita', 'pedrita', 'Jueves - Grupo 5', 'Febrero - Junio 2023', '2022-08-23', 'Clínica $200', 'Ortodoncia'),
('carmen', 'pedro', 'Viernes - Grupo 1 / 6° Semestre ', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300', 'Ortodoncia'),
('regina', 'rebeca', 'Lunes - Grupo 2 / 5° Semestre', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300', 'Ortodoncia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inpro`
--

CREATE TABLE `inpro` (
  `Folio` int(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `Alumno` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Paciente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Grupo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Ciclo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Fecha` date NOT NULL,
  `Concepto` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `inpro`
--

INSERT INTO `inpro` (`Alumno`, `Paciente`, `Grupo`, `Ciclo`, `Fecha`, `Concepto`) VALUES
('Ximena Flores De La Fuente', 'Camila Flores De La Fuente', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300'),
('corazon', 'de melon', 'Miércoles - Grupo 3 - 4° Sem', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300'),
('bolita', 'doggy', 'Martes - Grupo 4 - 3° Sem', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300'),
('lupis', 'drupis', 'Miércoles - Grupo 3', 'Febrero - Junio 2023', '2022-08-22', 'Clínica $300'),
('Marian Gómez Flores', 'Emilio Mondragón Fernandéz', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300'),
('mario', 'fer', 'Miércoles - Grupo 3 / 4° Semestre', 'Septiembre - Febrero 2022', '2022-08-23', 'Clínica $300'),
('Ximena Flores De La Fuente ', 'Fernando Montoya Cruz', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300'),
('Marian Gómez Flores', 'Jorge Martínez Mendoza', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300'),
('Diana Carrillo Castillo', 'Karla Beatriz Olvera', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $300'),
('Ximena Flores De La Fuente', 'Mariza Aguilar Olivares', 'Miércoles - Grupo 3', 'Febrero - Junio 2023', '2022-07-09', 'Clínica $300'),
('Ximena Flores De La Fuente ', 'Mónica Espinoza Torres', 'Miércoles - Grupo 3', 'Septiembre - Diciembre 2022', '2022-08-09', 'Clínica $300'),
('Marian Gómez Flores', 'Paulina Fernandez Carrillo', 'Martes - Grupo 4', 'Septiembre - Diciembre 2022', '2022-08-10', 'Clínica $200');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ineso`
--
-- ALTER TABLE `ineso`
--  ADD PRIMARY KEY (`Folio`);

--
-- Indices de la tabla `inpro`
--
-- ALTER TABLE `inpro`
--  ADD PRIMARY KEY (`Folio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
