/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.LogicaLog;
import controlador.LogicaPersona;
import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class RegistroVacunacion {

    Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("*** BIENVENIDO AL SISTEMA DE REGISTRO DE VACUNACIÓN *** ");
        System.out.println("Por favor seleccione una opción: ");
        System.out.println("1. Incluir Persona");
        System.out.println("2. Actualizar Estado");
        System.out.println("3. Excluir Persona");
        System.out.println("4. Consultar Listado");
        System.out.println("5. Imprimir Logs");
        int opcion = sc.nextInt();
        
        LogicaPersona logicaPersona = new LogicaPersona();
        LogicaLog logicaLog = new LogicaLog();
        
        switch (opcion) {
            case 1:
                System.out.println("*** INCLUIR PERSONA ***");
                System.out.print("Nombre completo: ");
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
        }
    }

}
