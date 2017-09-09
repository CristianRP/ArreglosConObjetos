/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.arreglosconobjetos.bean;

import java.util.Scanner;
import main.arreglosconobjetos.bean.Estudiante;

/**
 *
 * @author alumno
 */
public class GestorArreglo {
    private Estudiante nodo;
    private Estudiante[] arregloEstudiante;

    public Estudiante[] getArregloEstudiante() {
        return arregloEstudiante;
    }

    public GestorArreglo(int i) {
        arregloEstudiante = new Estudiante[i];
    }
    
    public void ingresoValores() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arregloEstudiante.length; i ++) {
            nodo = new Estudiante();
            System.out.println(buildMessage("el nombre", (i+1)));
            nodo.setNombre(s.next());
            System.out.println(buildMessage("la edad", (i+1)));
            nodo.setEdad(s.nextFloat());           
            System.out.println(buildMessage("la altura", (i+1)));
            nodo.setAltura(s.nextFloat());            
            System.out.println(buildMessage("el primer parcial", (i+1)));
            nodo.setPrimerParcial(s.nextFloat());          
            System.out.println(buildMessage("el segundo parcial", (i+1)));
            nodo.setSegundoParcial(s.nextFloat());           
            System.out.println(buildMessage("la zona", (i+1)));
            nodo.setZona(s.nextFloat());            
            System.out.println(buildMessage("la nota del examen final", (i+1)));
            nodo.setExamenFinal(s.nextFloat());
            arregloEstudiante[i] = nodo;
        }
    }
    
    private String buildMessage(String atributo, int indice) {
        return String.format("Ingrese %s del estudiante %d :", atributo, indice);
    }
     
    
    public void imprimirListadoEstudiantes() {
        for (Estudiante arregloEstudiante1 : arregloEstudiante) {
            System.out.println(String.format("Estudiante: %s, Nota: %.2f",
                    arregloEstudiante1.getNombre(), arregloEstudiante1.notaFinal()));
        }
    }
    
    public float promedioNotas() {
        float foo;
        foo = 0;
        for (Estudiante arregloEstudiante1 : arregloEstudiante) {
            foo += arregloEstudiante1.notaFinal();
        }
        foo /= arregloEstudiante.length;
        return foo;
    }
   
    public float promedioAlturas() {
        float foo;
        foo = 0;
        for (Estudiante arregloEstudiante1 : arregloEstudiante) {
            foo += arregloEstudiante1.getAltura();
        }
        foo /= arregloEstudiante.length;
        return foo;
    }
    
    public int numeroAprobados() {
        int foo;
        foo = 0;
        for (Estudiante arregloEstudiante1 : arregloEstudiante) {
            if (arregloEstudiante1.estado()) {
                foo++;
            }
        }
        return foo;
    }
    
    public boolean isEmpty() {
        return arregloEstudiante.length > 0;
    }
    
    public int numeroDesaprobados() {
        int foo;
        foo = arregloEstudiante.length - numeroAprobados();
        return foo;
    }
}