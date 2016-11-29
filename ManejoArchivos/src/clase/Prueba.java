/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

//import escrituraArchivos.ArchivoTexto;

/**
 *
 * @author SALAS
 */
public class Prueba {
    public static void main(String[] args) {
        Archivocalificacion aplicacion = new Archivocalificacion();

      aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
    }
}
