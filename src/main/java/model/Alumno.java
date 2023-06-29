/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Sebastian
 */
public class Alumno {
    //Atributos
    private int rut;
    private String nombre;
    //Listas de notas
    private LinkedList<Double> tareas = new LinkedList<>();
    private LinkedList<Double> trabajos = new LinkedList<>();
    private Double certamen = 0.0; //Es solo 1 certamen por eso no utilice lista
    private Double notaFinal = 0.0; //La seteamos en 0.0 hasta que se modifique
    
    //Lista de alumnos
    private static LinkedList<Alumno> alumnos;
    
    //Constructor
    public Alumno(){
    }

    public Alumno(int rut, String nombre, LinkedList<Double> trabajos, Double certamen) {
        this.rut = rut;
        this.nombre = nombre;
        this.trabajos = trabajos;
        this.certamen = certamen;
    }

    public Alumno(int rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }
   
    //Getters
    public String getNombre() {    
        return nombre;
    }
    
     public int getRut() {
        return rut;
    }

    public LinkedList<Double> getTareas() {
        return tareas;
    }

    public Double getCertamen() {
        return certamen;
    }

    public LinkedList<Double> getTrabajos() {
        return trabajos;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public static LinkedList<Alumno> getAlumnos() {
        return alumnos;
    }
    
    //Setters

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTareas(LinkedList<Double> tareas) {
        this.tareas = tareas;
    }

    public void setCertamen(Double certamen) {
        this.certamen = certamen;
    }

    public void setTrabajos(LinkedList<Double> trabajos) {
        this.trabajos = trabajos;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public static void setAlumnos(LinkedList<Alumno> alumnos) {
        Alumno.alumnos = alumnos;
    }
    
    //Metodos 
    public Double calcularNotaPromedioTrabajos(LinkedList<Double> notas){
        if (notas.isEmpty()){
            return 0.0;
        }
        else {
        //Notas
        Double E1 = notas.get(0);
        Double E2 = notas.get(1);
        Double E3 = notas.get(2);
        Double promedio = 0.0;
        //Calculamos promedio
        promedio = (E1 * 0.40) + (E2 * 0.35) + (E3 * 0.25);
        //Salida
        return promedio;
        }
    }
    
    public Double calcularNotaPromedioTareas(LinkedList<Double> notas){
        if (notas.isEmpty()){
            return 0.0;
        }
        else {
        //Ordenamos de menor a mayor
        Collections.sort(notas);
        //Descartamos la menor de todas
        notas.remove(0);
        //Calcular promedio
        Double promedio = 0.0;
        Double suma = 0.0; //Sumamos las notas restantes en la lista
        for ( Double nota : notas){
            suma += nota;
        }
        promedio = suma / notas.size(); //Dividimos por el total de notas
        //Salida
        return promedio;
        }
    }
    
    public Double calcularNotaFinal(){
        //Obtener promedios
        Double resultado = 0.0;
        Double Certamen = getCertamen();
        Double promedioTrabajos = calcularNotaPromedioTrabajos(trabajos);
        Double promedioTareas = calcularNotaPromedioTareas(tareas);
        //Calcular nota final
        resultado = (Certamen * 0.35) + (promedioTrabajos * 0.35) + (promedioTareas * 0.30);
        //Salida
        setNotaFinal(resultado); //Guardamos la nota final en el alumno
        return resultado;
        
    }
    
    public static Double promedioCurso(){
        Double promedioCurso = 0.0;
        Double sumaNotas = 0.0;
        for(Alumno alumno : Alumno.getAlumnos()){
            sumaNotas += alumno.getNotaFinal();
        }
        //Calcular promedio
        promedioCurso = sumaNotas / Alumno.getAlumnos().size();
        //Salida
        return promedioCurso;
    }
    
}
