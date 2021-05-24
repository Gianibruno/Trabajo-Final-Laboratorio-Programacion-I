-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-05-2021 a las 02:13:05
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
-- Estructura de tabla para la tabla `ejemplares`
--

CREATE TABLE `ejemplares` (
  `id_ejemplar` int(11) NOT NULL COMMENT 'Clave primaria',
  `estado` set('Prestado','Retrasado','Reparación','Disponible') NOT NULL COMMENT 'Prestado, retraso, reparación, disponible en biblioteca',
  `id_libro` int(11) NOT NULL,
  `id_lector` int(11) NOT NULL,
  `fechaPrestamo` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ejemplares`
--

INSERT INTO `ejemplares` (`id_ejemplar`, `estado`, `id_libro`, `id_lector`, `fechaPrestamo`) VALUES
(1, 'Prestado', 1, 3, '2021-05-22');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `info`
--

INSERT INTO `info` (`nombre`, `direccion`, `telefono`, `contacto`, `director`, `director_contacto`, `ejemplares`, `libros`, `usuarios`, `autores`) VALUES
('Antonio Esteban Agüero', '...', '266', '...', '...', '...', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id_libro` int(11) NOT NULL COMMENT 'Clave primaria',
  `id_autor` int(11) NOT NULL COMMENT 'Autor del libro',
  `isbn` varchar(15) NOT NULL COMMENT 'Código de ISBN',
  `nombre` varchar(50) NOT NULL COMMENT 'Nombre del libro',
  `tipo` varchar(120) NOT NULL COMMENT 'Ingeniería, literatura, informática, etc',
  `editorial` varchar(50) NOT NULL COMMENT 'Nombre de la editorial',
  `año` year(4) NOT NULL COMMENT 'Año de publicación'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de libros';

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id_libro`, `id_autor`, `isbn`, `nombre`, `tipo`, `editorial`, `año`) VALUES
(1, 2, '25AAA', 'El libro de las pruebas parte 1', 'Prueba, General, Otros', 'Las pruebas 2021', 2021);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL COMMENT 'Clave primaria',
  `dni` int(15) NOT NULL COMMENT 'DNI',
  `nombre` varchar(50) NOT NULL COMMENT 'Nombre de la persona',
  `nacionalidad` varchar(50) NOT NULL COMMENT 'Nacionalidad',
  `nacimiento` date NOT NULL COMMENT 'Fecha de nacimiento',
  `direccion` varchar(150) DEFAULT NULL COMMENT 'Domicilio',
  `contacto` varchar(120) DEFAULT NULL COMMENT 'Info de contacto',
  `totalprestados` int(11) DEFAULT 0 COMMENT 'Cantidad de prestamos devueltos',
  `multa` tinyint(1) DEFAULT 0 COMMENT 'Si posee multa no prestar ejemplares',
  `finmulta` date DEFAULT NULL COMMENT 'Fecha de fin de multa',
  `acceso` varchar(13) DEFAULT 'lector' COMMENT 'Administrador, autor, lector',
  `pass` varchar(10) DEFAULT NULL COMMENT 'Contraseña de acceso',
  `comentarios` varchar(250) DEFAULT NULL COMMENT 'Comentarios'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla de Personas con acceso a la Biblioteca';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `dni`, `nombre`, `nacionalidad`, `nacimiento`, `direccion`, `contacto`, `totalprestados`, `multa`, `finmulta`, `acceso`, `pass`, `comentarios`) VALUES
(1, 1, 'Administrador', 'Argentina', '2021-05-23', NULL, NULL, 0, 0, NULL, 'admin', NULL, NULL),
(2, 2, 'Autor de Prueba', 'Argentina', '1951-01-01', NULL, NULL, 0, 0, NULL, 'autor', NULL, NULL),
(3, 3, 'Lector de prueba', 'Argentina', '2000-05-08', NULL, NULL, 0, 0, NULL, 'lector', NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  ADD PRIMARY KEY (`id_ejemplar`),
  ADD KEY `Ejemplar del libro` (`id_libro`),
  ADD KEY `Ejemplar prestado a lector` (`id_lector`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id_libro`),
  ADD UNIQUE KEY `id_autor` (`id_autor`),
  ADD UNIQUE KEY `isbn` (`isbn`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  MODIFY `id_ejemplar` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria', AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria', AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria', AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  ADD CONSTRAINT `Ejemplar del libro` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`),
  ADD CONSTRAINT `Ejemplar prestado a lector` FOREIGN KEY (`id_lector`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `Autor del Libro` FOREIGN KEY (`id_autor`) REFERENCES `usuarios` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
