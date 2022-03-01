/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.BaseDatos;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author Ingenieria
 */
public class LogicaPersona {

    BaseDatos bd = BaseDatos.getInstancia();

    public boolean crearPersona(Persona persona) {
        List<Persona> listaPersonas = bd.getListaPersonas();
        return listaPersonas.add(persona);
    }

    public boolean actualizarEstadoPersona(int documento, boolean nuevoEstado) {
        List<Persona> listaPersonas = bd.getListaPersonas();
        for (Persona perLista : listaPersonas) {
            if (perLista.getDocumento() == documento) {
                perLista.setEstado(nuevoEstado);
                return true;
            }
        }
        return false;
    }

    public boolean excluirPersona(int documento) {
        List<Persona> listaPersonas = bd.getListaPersonas();
        for (Persona perLista : listaPersonas) {
            if (perLista.getDocumento() == documento) {
                return listaPersonas.remove(perLista);
            }
        }
        return false;
    }
}
