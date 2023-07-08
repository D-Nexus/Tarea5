/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tarea5;

import java.util.LinkedList;
import model.Alumno;
import view.agregarNotas;

/**
 *
 * @author D-Nexus
 */
public class Tarea5 {

    public static void main(String[] args) {
        LinkedList<Alumno> alumnos = new LinkedList<>();
        Alumno alumno = new Alumno(198361216,"Sebastian");
        Alumno alumno2 = new Alumno(123456789, "Maria");
        Alumno alumno3 = new Alumno(222222222,"Jose");
        Alumno alumno4 = new Alumno(333333333,"Carlos");
        Alumno alumno5 = new Alumno(444444444,"Pedro");
        //Seteamos manualmente notas finales al resto de alumnos
        alumno2.setNotaFinal(100D);
        alumno3.setNotaFinal(100D);
        alumno4.setNotaFinal(100D);
        alumno5.setNotaFinal(100D);
        //Añadimos a la lista de alumnos simulando un curso
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        //Guardamos la lista en la clase
        Alumno.setAlumnos(alumnos);
        //Ventana
        agregarNotas ventana1 = new agregarNotas();
        ventana1.setVisible(true);
        ventana1.setLocationRelativeTo(null);
        
    }
}
