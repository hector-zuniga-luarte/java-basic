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
public class Nadador extends Atleta {

    private String pruebaNatacion = "";
    private String tiempo = "";

    public Nadador() {
    }

    public Nadador(String nombre, String pais, boolean ganoMedalla, String tipoMedalla, boolean recordOlimpico, String pruebaNatacion, String tiempo) {
        super(nombre, pais, ganoMedalla, tipoMedalla, recordOlimpico);

        this.pruebaNatacion = pruebaNatacion;
        this.tiempo = tiempo;

    }

    public String getPruebaNatacion() {
        return pruebaNatacion;
    }

    public void setPruebaNatacion(String pruebaNatacion) {
        this.pruebaNatacion = pruebaNatacion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String mostrarResumen() {
        return String.format("%-22s", "Nadador")
                + String.format("%-22s", this.nombre)
                + String.format("%-20s", this.pais);
    }

    @Override
    public String mostrarDetalle() {
        return "Tipo de Atleta = Nadador" + "\n"
             + "------------------------" + "\n"
             + "Nombre            = " + this.nombre + "\n"
             + "País              = " + this.pais + "\n"
             + "¿Ganó medalla?    = " + (this.ganoMedalla ? "Sí" : "No") + "\n"
             + "Tipo de medalla   = " + this.tipoMedalla + "\n"
             + "¿Record olímpico? = " + (this.recordOlimpico ? "Sí" : "No") + "\n"
             + "Prueba natación   = " + this.pruebaNatacion + "\n"
             + "Tiempo            = " + this.tiempo + "\n";
    }

}
