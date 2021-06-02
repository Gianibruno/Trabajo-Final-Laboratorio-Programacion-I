-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-06-2021 a las 00:06:13
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
-- Base de datos: `bibliotecagrupo1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autores`
--

CREATE TABLE `autores` (
  `id_autor` int(11) NOT NULL COMMENT 'ID',
  `dni` varchar(20) NOT NULL COMMENT 'DNI',
  `nombre` varchar(50) NOT NULL COMMENT 'NOMBRE Y APELLIDO',
  `nacionalidad` varchar(30) NOT NULL COMMENT 'NACIONALIDAD',
  `fechaNacimiento` date NOT NULL COMMENT 'FECHA DE NACIMIENTO',
  `estado` tinyint(1) NOT NULL DEFAULT 1 COMMENT 'Estado del Autor'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de autores';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejemplares`
--

CREATE TABLE `ejemplares` (
  `id_ejemplar` int(11) NOT NULL COMMENT 'Clave primaria',
  `id_libro` int(11) NOT NULL COMMENT 'Relacion con libro',
  `estado` tinyint(1) NOT NULL DEFAULT 3 COMMENT 'Prestado, retraso, reparación, disponible en biblioteca'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de ejemplares';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `info`
--

CREATE TABLE `info` (
  `nombre` varchar(50) DEFAULT NULL COMMENT 'Nombre de la Biblioteca',
  `direccion` varchar(150) DEFAULT NULL COMMENT 'Domicilio fisico',
  `telefono` varchar(15) DEFAULT NULL COMMENT 'Telefono de contacto',
  `contacto` varchar(120) DEFAULT NULL,
  `director` varchar(50) DEFAULT NULL,
  `director_contacto` varchar(120) DEFAULT NULL,
  `ejemplares` int(11) DEFAULT NULL,
  `libros` int(11) DEFAULT NULL,
  `usuarios` int(11) DEFAULT NULL,
  `autores` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla para informacion de la Biblioteca, no necesaria';

--
-- Volcado de datos para la tabla `info`
--

INSERT INTO `info` (`nombre`, `direccion`, `telefono`, `contacto`, `director`, `director_contacto`, `ejemplares`, `libros`, `usuarios`, `autores`) VALUES
('Antonio Esteban Agüero', '...', '266', '...', '...', '...', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lectores`
--

CREATE TABLE `lectores` (
  `id_lector` int(11) NOT NULL COMMENT 'ID',
  `dni` varchar(20) NOT NULL COMMENT 'DNI',
  `nombre` varchar(50) NOT NULL COMMENT 'NOMBRE Y APELLIDO',
  `telefono` varchar(20) NOT NULL COMMENT 'TELEFONO',
  `direccion` varchar(50) NOT NULL COMMENT 'DOMICILIO',
  `fechaNacimiento` date NOT NULL COMMENT 'FECHA DE NACIMIENTO',
  `estado` tinyint(1) NOT NULL DEFAULT 1 COMMENT 'ESTADO'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de lectores';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id_libro` int(11) NOT NULL COMMENT 'Clave primaria',
  `id_autor` int(11) NOT NULL COMMENT 'Relacion con Autor',
  `isbn` bigint(13) NOT NULL COMMENT 'Código de ISBN',
  `nombre` varchar(50) NOT NULL COMMENT 'Nombre del libro',
  `tipo` varchar(20) NOT NULL COMMENT 'Ingeniería, literatura, informática, etc',
  `editorial` varchar(50) NOT NULL COMMENT 'Nombre de la editorial',
  `año` year(4) NOT NULL COMMENT 'Año de publicación',
  `estado` tinyint(1) NOT NULL DEFAULT 1 COMMENT 'ESTADO'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de libros';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multa`
--

CREATE TABLE `multa` (
  `id_multa` int(11) NOT NULL COMMENT 'ID',
  `id_prestamo` int(11) NOT NULL COMMENT 'relacion con prestamo',
  `fecha_inicio` date NOT NULL COMMENT 'FECHA DE INICIO DE LA MULTA',
  `fecha_fin` date NOT NULL COMMENT 'FECHA DE FIN DE MULTA'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de multa';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id_prestamo` int(11) NOT NULL COMMENT 'ID',
  `id_ejemplar` int(11) NOT NULL COMMENT 'Relacion con ejemplar',
  `id_lector` int(11) NOT NULL COMMENT 'Relacion con lector',
  `fecha_prestamo` date NOT NULL COMMENT 'FECHA DEL PRESTAMO',
  `fecha_devolucion` date DEFAULT NULL COMMENT 'FECHA DE DEVOLUCION'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de prestamos';

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autores`
--
ALTER TABLE `autores`
  ADD PRIMARY KEY (`id_autor`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  ADD PRIMARY KEY (`id_ejemplar`),
  ADD KEY `ejemplar del libro` (`id_libro`);

--
-- Indices de la tabla `lectores`
--
ALTER TABLE `lectores`
  ADD PRIMARY KEY (`id_lector`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id_libro`),
  ADD UNIQUE KEY `isbn` (`isbn`),
  ADD KEY `Autor del Libro` (`id_autor`);

--
-- Indices de la tabla `multa`
--
ALTER TABLE `multa`
  ADD PRIMARY KEY (`id_multa`),
  ADD KEY `multa del prestamo` (`id_prestamo`);

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`id_prestamo`),
  ADD KEY `prestamo del ejemplar` (`id_ejemplar`),
  ADD KEY `prestamo al lector` (`id_lector`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autores`
--
ALTER TABLE `autores`
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID';

--
-- AUTO_INCREMENT de la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  MODIFY `id_ejemplar` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria', AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `lectores`
--
ALTER TABLE `lectores`
  MODIFY `id_lector` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID';

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria', AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `multa`
--
ALTER TABLE `multa`
  MODIFY `id_multa` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID';

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  ADD CONSTRAINT `ejemplar del libro` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`);

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `Autor del Libro` FOREIGN KEY (`id_autor`) REFERENCES `autores` (`id_autor`);

--
-- Filtros para la tabla `multa`
--
ALTER TABLE `multa`
  ADD CONSTRAINT `multa del prestamo` FOREIGN KEY (`id_prestamo`) REFERENCES `prestamos` (`id_prestamo`);

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `prestamo al lector` FOREIGN KEY (`id_lector`) REFERENCES `lectores` (`id_lector`),
  ADD CONSTRAINT `prestamo del ejemplar` FOREIGN KEY (`id_ejemplar`) REFERENCES `ejemplares` (`id_ejemplar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
