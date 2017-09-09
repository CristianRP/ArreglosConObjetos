/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.arreglosconobjetos.manejador;

import java.util.Scanner;
import main.arreglosconobjetos.bean.GestorArreglo;

/**
 *
 * @author alumno
 */
public class ManejadorArreglo {
    private GestorArreglo gestor;
    
    public ManejadorArreglo(GestorArreglo gestor) {
        this.gestor = gestor;
    }
    
    public ManejadorArreglo() {
        this.gestor = new GestorArreglo(3);
    }
    
    public void menu() {
        Scanner s = new Scanner(System.in);
        int op;
        do {
            puts("***== Notas ==***");
            puts("1.) Ingreso de notas");
            puts("2.) Imprimir notas");
            puts("3.) Obtener promedio de notas");
            puts("4.) Obtener promedio de alturas");
            puts("5.) Obtener numero de aprobados");
            puts("6.) Obtener numero de desaprobados");
            puts("0.) Salir");
            op = s.nextInt();
            if (op == 1) {
                gestor.ingresoValores();
            } else if (op == 2) {
                if (!gestor.isEmpty()) {
                    gestor.imprimirListadoEstudiantes();
                } else {
                    puts("Primero ingresa datos!!");
                }
            } else if (op == 3) {
                if (!gestor.isEmpty()) {
                    gestor.promedioNotas();
                } else {
                    puts("Primero ingresa datos!!");
                }               
            } else if (op == 4) {
                if (!gestor.isEmpty()) {
                    gestor.promedioAlturas();
                } else {
                    puts("Primero ingresa datos!!");
                }                
            } else if (op == 5) {
                if (!gestor.isEmpty()) {
                    gestor.numeroAprobados();
                } else {
                    puts("Primero ingresa datos!!");
                }
            } else if (op == 6) {
                if (!gestor.isEmpty()) {
                    gestor.numeroDesaprobados();
                } else {
                    puts("Primero ingresa datos!!");
                }
            } 
        } while (op != 0);    
    }
    
    private void puts(String message) {
        System.out.println(message);
    }
    
}
