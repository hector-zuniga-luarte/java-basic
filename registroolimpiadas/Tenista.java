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
public class Tenista extends Atleta {

    private int rankingATP = 0;
    private String manoHabil = "";
    private String tipoReves = "";

    public Tenista() {
    }

    public Tenista(String nombre, String pais, boolean ganoMedalla, String tipoMedalla, boolean recordOlimpico, int rankingATP, String manoHabil, String tipoReves) {
        super(nombre, pais, ganoMedalla, tipoMedalla, recordOlimpico);

        this.rankingATP = rankingATP;
        this.manoHabil = manoHabil;
        this.tipoReves = tipoReves;

    }

    public int getRankingATP() {
        return rankingATP;
    }

    public void setRankingATP(int rankingATP) {
        this.rankingATP = rankingATP;
    }

    public String getManoHabil() {
        return manoHabil;
    }

    public void setManoHabil(String manoHabil) {
        this.manoHabil = manoHabil;
    }

    public String getTipoReves() {
        return tipoReves;
    }

    public void setTipoReves(String tipoReves) {
        this.tipoReves = tipoReves;
    }

    @Override
    public String mostrarResumen() {
        return String.format("%-22s", "Tenista")
                + String.format("%-22s", this.nombre)
                + String.format("%-20s", this.pais);
    }

    @Override
    public String mostrarDetalle() {
        return "Tipo de Atleta = Tenista" + "\n"
             + "------------------------" + "\n"
             + "Nombre            = " + this.nombre + "\n"
             + "País              = " + this.pais + "\n"
             + "¿Ganó medalla?    = " + (this.ganoMedalla ? "Sí" : "No") + "\n"
             + "Tipo de medalla   = " + this.tipoMedalla + "\n"
             + "¿Record olímpico? = " + (this.recordOlimpico ? "Sí" : "No") + "\n"
             + "Ranking ATP       = " + this.rankingATP + "\n"
             + "Mano hábil        = " + this.manoHabil + "\n"
             + "Tipo de revés     = " + this.tipoReves + "\n";
    }

}
