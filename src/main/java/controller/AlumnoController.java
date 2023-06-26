/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.LinkedList;
import model.Alumno;
/**
 *
 * @author Sebastian
 */
public class AlumnoController {
    
    //Enviamos las notas a la lista tareas
    public void agregarNotasTareas(int rut, Double nota1,Double nota2, Double nota3, Double nota4, Double nota5){
        LinkedList<Double> notasTareas = new LinkedList<>();
        notasTareas.add(nota1);
        notasTareas.add(nota2);
        notasTareas.add(nota3);
        notasTareas.add(nota4);
        notasTareas.add(nota5);
        for(Alumno alumno : Alumno.getAlumnos()){
            if(alumno.getRut() == rut){
                alumno.setTareas(notasTareas);
            }
        }
    }
    //Enviamos las notas a la lista trabajos
    public void agregarNotasTrabajo(int rut, Double nota1, Double nota2, Double nota3){
        LinkedList<Double> notasTrabajos = new LinkedList<>();
        notasTrabajos.add(nota1);
        notasTrabajos.add(nota2);
        notasTrabajos.add(nota3);
        for(Alumno alumno : Alumno.getAlumnos()){
            if(alumno.getRut() == rut){
                alumno.setTrabajos(notasTrabajos);
            }
        }
    }
    //Agrega la nota del certamen
    public void agregarNotaCertamen(int rut, Double nota1){
        for(Alumno alumno : Alumno.getAlumnos()){
            if(alumno.getRut() == rut){
                alumno.setCertamen(nota1);
            }
        }
    }
    
    public Double obtenerNotaFinal(int rut){
        //Buscamos al alumno
        for(Alumno alumno : Alumno.getAlumnos()){
            if(alumno.getRut() == rut){
                return alumno.calcularNotaFinal();
            }
        }
        //Si no existe
        return 0.0;
    }
    
}
