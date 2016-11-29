/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion2;

/**
 *
 * @author SALAS
 */
public class Pruebacrear {
    public static void main(String[] args) {
         Archivo aplicacion = new Archivo();

      aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
    }
}
