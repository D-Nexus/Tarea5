/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Alumno;
/**
 *
 * @author Sebastian
 */
public class AlumnoController {
    
    //Agrega una nota en la lista tareas
    public void agregarNotasTarea(int rut, Double nota){
        for(Alumno alumno : Alumno.getAlumnos()){
            if(alumno.getRut() == rut){
                alumno.agregarNotaTarea(nota);
            }
        }
    }
    //Agrega una nota en la lista trabajos
    public void agregarNotasTrabajo(int rut, Double nota){
        for(Alumno alumno : Alumno.getAlumnos()){
            if(alumno.getRut() == rut){
                alumno.agregarNotaTrabajo(nota);
            }
        }
    }
    //Agrega la nota del certamen
    public void agregarNotaCertamen(int rut, Double nota){
        for(Alumno alumno : Alumno.getAlumnos()){
            if(alumno.getRut() == rut){
                alumno.setCertamen(nota);
            }
        }
    }

    
}
