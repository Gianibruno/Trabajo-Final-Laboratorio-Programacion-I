-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 24-05-2021 a las 17:35:42
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Autores`
--

CREATE TABLE `Autores` (
  `ID_Autor` int(6) NOT NULL COMMENT 'Ésta clave será exportada a la tabla Libros.',
  `Nombre_Autor` varchar(127) NOT NULL,
  `DNI` int(8) NOT NULL COMMENT '¿Necesitamos más que 8 dígitos aquí?',
  `Nacionalidad` varchar(31) NOT NULL COMMENT 'No necesitamos muchos caracteres para ésto.',
  `Fecha_Nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Lectores`
--

CREATE TABLE `Lectores` (
  `ID_Lector` int(6) NOT NULL COMMENT 'Ésta clave será exportada a la tabla Libros.',
  `Nombre_Lector` varchar(127) NOT NULL,
  `Estado` tinyint(1) NOT NULL DEFAULT 0 COMMENT 'Se me ocurrió hacerlo numérico. 0 será el estado por defecto (sin alquilar ni deber nada).',
  `Libro_0` int(6) NOT NULL COMMENT 'Importada de la tabla Libros',
  `Libro_1` int(6) NOT NULL,
  `Libro_2` int(6) NOT NULL,
  `Prestamo_Libro_0` tinyint(2) NOT NULL DEFAULT 30 COMMENT 'Honestamente no sé qué hacer aquí. Cualquier edición se agradece.',
  `Prestamo_Libro_1` tinyint(2) NOT NULL DEFAULT 30 COMMENT '¿Quizás un script en Java ayude?',
  `Prestamo_Libro_2` tinyint(2) NOT NULL DEFAULT 30
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Libros`
--

CREATE TABLE `Libros` (
  `ID_Libro` int(6) NOT NULL COMMENT 'Clave primaria auto-incremental.',
  `ISBN` bigint(13) NOT NULL COMMENT 'El ISBN tiene 13 números según lo que ví. Debe ser Int grande porque un Int normal no alcanza.',
  `Título` varchar(255) NOT NULL COMMENT '¿Necesitamos más que 255 caracteres?',
  `Editorial` varchar(127) NOT NULL,
  `Tipo` varchar(127) NOT NULL,
  `ID_Autor` int(6) NOT NULL COMMENT 'Clave foránea exportada de la tabla Autores.',
  `Alquilado_Por` int(6) NOT NULL COMMENT 'Clave foránea exportada de la tabla Lectores.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Autores`
--
ALTER TABLE `Autores`
  ADD PRIMARY KEY (`ID_Autor`);

--
-- Indices de la tabla `Lectores`
--
ALTER TABLE `Lectores`
  ADD PRIMARY KEY (`ID_Lector`),
  ADD KEY `Libro 0` (`Libro_0`),
  ADD KEY `Libro 1` (`Libro_1`),
  ADD KEY `Libro 2` (`Libro_2`);

--
-- Indices de la tabla `Libros`
--
ALTER TABLE `Libros`
  ADD PRIMARY KEY (`ID_Libro`),
  ADD KEY `Alquilado Por` (`Alquilado_Por`),
  ADD KEY `Autor Número` (`ID_Autor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Autores`
--
ALTER TABLE `Autores`
  MODIFY `ID_Autor` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Ésta clave será exportada a la tabla Libros.';

--
-- AUTO_INCREMENT de la tabla `Lectores`
--
ALTER TABLE `Lectores`
  MODIFY `ID_Lector` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Ésta clave será exportada a la tabla Libros.';

--
-- AUTO_INCREMENT de la tabla `Libros`
--
ALTER TABLE `Libros`
  MODIFY `ID_Libro` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria auto-incremental.';

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Lectores`
--
ALTER TABLE `Lectores`
  ADD CONSTRAINT `Libro 0` FOREIGN KEY (`Libro_0`) REFERENCES `Libros` (`ID_Libro`),
  ADD CONSTRAINT `Libro 1` FOREIGN KEY (`Libro_1`) REFERENCES `Libros` (`ID_Libro`),
  ADD CONSTRAINT `Libro 2` FOREIGN KEY (`Libro_2`) REFERENCES `Libros` (`ID_Libro`);

--
-- Filtros para la tabla `Libros`
--
ALTER TABLE `Libros`
  ADD CONSTRAINT `Alquilado Por` FOREIGN KEY (`Alquilado_Por`) REFERENCES `Lectores` (`ID_Lector`),
  ADD CONSTRAINT `Autor Número` FOREIGN KEY (`ID_Autor`) REFERENCES `Autores` (`ID_Autor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
