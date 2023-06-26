/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tarea5;

import java.util.LinkedList;
import model.Alumno;
import view.agregarNotas;

/**
 *
 * @author sebas
 */
public class Tarea5 {

    public static void main(String[] args) {
        LinkedList<Alumno> alumnos = new LinkedList<Alumno>();
        Alumno alumno = new Alumno(198361216,"Sebastian");
        alumnos.add(alumno);
        Alumno.setAlumnos(alumnos);
        //Ventana
        agregarNotas ventana1 = new agregarNotas();
        ventana1.setVisible(true);
        ventana1.setLocationRelativeTo(null);
        
    }
}
