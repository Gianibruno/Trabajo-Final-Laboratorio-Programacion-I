/*
 * Entidad Biblioteca
 */
package Entidades;

/**
 * Entidad Biblioteca
 * Contiene informacion y configuraciones de la biblioteca
 */
public class Biblioteca {
    public static final class CONF{
        public static final int
                MAXPRESTAMOSPORLECTOR = 3,
                MAXDIASPRESTADOS = 30,
                MULTAPORDIA = 2;
        public static final String
                AUTORESTADOS[] = {"Inactivo", "Activo"},
                LECTORESTADOS[] = {"Inactivo", "Activo"},
                LIBROESTADOS[] = {"Inactivo", "Activo"};
    }
}
