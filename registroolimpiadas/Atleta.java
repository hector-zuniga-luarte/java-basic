/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.s005v.registroolimpiadas;

/**
 *
 * @author Administrador
 */
public abstract class Atleta {

    protected String nombre = "";
    protected String pais = "";
    protected boolean ganoMedalla = false;
    protected String tipoMedalla = "";
    /* Oro, Plata, Bronce, Ninguna */
    protected boolean recordOlimpico = false;

    public Atleta() {
    }

    public Atleta(String nombre, String pais, boolean ganoMedalla, String tipoMedalla, boolean recordOlimpico) {

        this.nombre = nombre;
        this.pais = pais;
        this.ganoMedalla = ganoMedalla;
        this.tipoMedalla = tipoMedalla;
        this.recordOlimpico = recordOlimpico;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isGanoMedalla() {
        return ganoMedalla;
    }

    public void setGanoMedalla(boolean ganoMedalla) {
        this.ganoMedalla = ganoMedalla;
    }

    public String getTipoMedalla() {
        return tipoMedalla;
    }

    public void setTipoMedalla(String tipoMedalla) {
        this.tipoMedalla = tipoMedalla;
    }

    public boolean isRecordOlimpico() {
        return recordOlimpico;
    }

    public void setRecordOlimpico(boolean recordOlimpico) {
        this.recordOlimpico = recordOlimpico;
    }

    public abstract String mostrarResumen();

    public abstract String mostrarDetalle();

}
