/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.BaseDatos;
import java.util.List;
import modelo.Log;

/**
 *
 * @author Ingenieria
 */
public class LogicaLog {
    public boolean crearLog(Log log) {
        BaseDatos bd = BaseDatos.getInstancia();
        List<Log> listaPersonas = bd.getListaLogs();
        return listaPersonas.add(log);
    }
}
