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
public class Persona {
    private String nombreCompleto;
    private int documento;
    private Date fechaNacimiento;
    private boolean estado;

    public Persona(String nombreCompleto, int documento, Date fechaNacimiento, boolean estado) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getDocumento() {
        return documento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return this.nombreCompleto + " / " + this.documento + " / " + this.fechaNacimiento + " / " + this.estado;
    }
}