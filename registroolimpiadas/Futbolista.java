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
public class Futbolista extends Atleta {

    private String puesto = "";
    private int cantidadGoles = 0;

    public Futbolista() {
    }

    public Futbolista(String nombre, String pais, boolean ganoMedalla, String tipoMedalla, boolean recordOlimpico, String puesto, int cantidadGoles) {
        super(nombre, pais, ganoMedalla, tipoMedalla, recordOlimpico);

        this.puesto = puesto;
        this.cantidadGoles = cantidadGoles;

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    @Override
    public String mostrarResumen() {
        return String.format("%-22s", "Futbolista")
                + String.format("%-22s", this.nombre)
                + String.format("%-20s", this.pais);
    }

    @Override
    public String mostrarDetalle() {
        return "Tipo de Atleta = Futbolista" + "\n"
             + "---------------------------" + "\n"
             + "Nombre            = " + this.nombre + "\n"
             + "País              = " + this.pais + "\n"
             + "¿Ganó medalla?    = " + (this.ganoMedalla ? "Sí" : "No") + "\n"
             + "Tipo de medalla   = " + this.tipoMedalla + "\n"
             + "¿Record olímpico? = " + (this.recordOlimpico ? "Sí" : "No") + "\n"
             + "Puesto            = " + this.puesto + "\n"
             + "Cantidad de goles = " + this.cantidadGoles + "\n";
    }

}
