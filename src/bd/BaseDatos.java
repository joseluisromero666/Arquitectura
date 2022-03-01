/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.ArrayList;
import java.util.List;
import modelo.Log;
import modelo.Persona;

/**
 *
 * @author Ingenieria
 */
public class BaseDatos {
    private static BaseDatos instancia;
    private List<Persona> listaPersonas;
    private List<Log> listaLogs;
    
    private BaseDatos() {
        listaPersonas = new ArrayList<Persona>();
        listaLogs = new ArrayList<Log>();
    }
    
    public static BaseDatos getInstancia() {
        if (instancia == null) {
            instancia = new BaseDatos();
        }
        return instancia;
    }
    
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
    public List<Log> getListaLogs() {
        return listaLogs;
    }
}
