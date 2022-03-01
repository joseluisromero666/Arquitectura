/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Ingenieria
 */
public class Log {
    private String accion;
    private Date fechaAccion;
    private String horaAccion;
    private int Documento;

    public Log(String accion, Date fechaAccion, String horaAccion, int Documento) {
        this.accion = accion;
        this.fechaAccion = fechaAccion;
        this.horaAccion = horaAccion;
        this.Documento = Documento;
    }
    
    @Override
    public String toString() {
        return this.accion + " / " + this.fechaAccion + " / " + this.horaAccion + " / " + this.Documento;
    }
}
