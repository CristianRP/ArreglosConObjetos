/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.arreglosconobjetos.bean;

/**
 *
 * @author alumno
 */
public class Estudiante {
    private String nombre;
    private float primerParcial;
    private float segundoParcial;
    private float zona;
    private float examenFinal;
    private float altura;
    private float edad;

    public Estudiante() {
        this.nombre = null;
        this.primerParcial = 0f;
        this.segundoParcial = 0f;
        this.zona = 0f;
        this.examenFinal = 0f;
        this.altura = 0f;
        this.edad = 0f;
    }

    public Estudiante(String nombre, float primerParcial, float segundoParcial,
            float zona, float examenFinal, float altura, float edad) {
        this.nombre = nombre;
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.zona = zona;
        this.examenFinal = examenFinal;
        this.altura = altura;
        this.edad = edad;
    }
    
    

    public float notaFinal() { 
        float foo;
        foo = primerParcial + segundoParcial + examenFinal;
        return foo;
    }
    
    public boolean estado() {
        return (notaFinal() >= 61);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(float primerParcial) {
        this.primerParcial = primerParcial;
    }

    public float getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(float segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public float getZona() {
        return zona;
    }

    public void setZona(float zona) {
        this.zona = zona;
    }

    public float getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(float examenFinal) {
        this.examenFinal = examenFinal;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }
    
}
