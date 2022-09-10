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
public class AtletaHalterofilia extends Atleta {

    private String tipoPrueba = "";
    /* Arranque o Envión */
    private int peso = 0;

    public AtletaHalterofilia() {
    }

    public AtletaHalterofilia(String nombre, String pais, boolean ganoMedalla, String tipoMedalla, boolean recordOlimpico, String tipoPrueba, int peso) {
        super(nombre, pais, ganoMedalla, tipoMedalla, recordOlimpico);

        this.tipoPrueba = tipoPrueba;
        this.peso = peso;

    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String mostrarResumen() {
        return String.format("%-22s", "Atleta Halterofilia")
                + String.format("%-22s", this.nombre)
                + String.format("%-20s", this.pais);
    }

    @Override
    public String mostrarDetalle() {
        return "Tipo de Atleta = Atleta Halterofilia" + "\n"
             + "------------------------------------" + "\n"
             + "Nombre            = " + this.nombre + "\n"
             + "País              = " + this.pais + "\n"
             + "¿Ganó medalla?    = " + (this.ganoMedalla ? "Sí" : "No") + "\n"
             + "Tipo de medalla   = " + this.tipoMedalla + "\n"
             + "¿Record olímpico? = " + (this.recordOlimpico ? "Sí" : "No") + "\n"
             + "Tipo prueba       = " + this.tipoPrueba + "\n"
             + "Peso              = " + this.peso + "\n";
    }

}
