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
public class AtletaSaltoAlto extends Atleta {

    private double alturaSalto = 0;

    public AtletaSaltoAlto() {
    }

    public AtletaSaltoAlto(String nombre, String pais, boolean ganoMedalla, String tipoMedalla, boolean recordOlimpico, double alturaSalto) {
        super(nombre, pais, ganoMedalla, tipoMedalla, recordOlimpico);

        this.alturaSalto = alturaSalto;

    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    @Override
    public String mostrarResumen() {
        return String.format("%-22s", "Atleta salto alto")
                + String.format("%-22s", this.nombre)
                + String.format("%-20s", this.pais);
    }

    @Override
    public String mostrarDetalle() {
        return "Tipo de Atleta = Atleta salto alto" + "\n"
             + "----------------------------------" + "\n"
             + "Nombre            = " + this.nombre + "\n"
             + "País              = " + this.pais + "\n"
             + "¿Ganó medalla?    = " + (this.ganoMedalla ? "Sí" : "No") + "\n"
             + "Tipo de medalla   = " + this.tipoMedalla + "\n"
             + "¿Record olímpico? = " + (this.recordOlimpico ? "Sí" : "No") + "\n"
             + "Altura salto      = " + this.alturaSalto + "\n";
    }

}
