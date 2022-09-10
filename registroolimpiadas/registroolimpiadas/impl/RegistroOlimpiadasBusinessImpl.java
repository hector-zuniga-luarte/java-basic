/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.s005v.registroolimpiadas.registroolimpiadas.impl;

import cl.duoc.pgy2121.s005v.registroolimpiadas.Atleta;
import cl.duoc.pgy2121.s005v.registroolimpiadas.AtletaHalterofilia;
import cl.duoc.pgy2121.s005v.registroolimpiadas.AtletaSaltoAlto;
import cl.duoc.pgy2121.s005v.registroolimpiadas.Nadador;
import cl.duoc.pgy2121.s005v.registroolimpiadas.business.RegistroOlimpiadasBusiness;

/**
 *
 * @author Administrador
 */
public class RegistroOlimpiadasBusinessImpl implements RegistroOlimpiadasBusiness {

    @Override
    public String obtenerRecordOlimpico(Atleta atleta) {

        String textorecordOlimpico = "";
        String nombreClase = "";

        /* Determinamos la clase del atleta para deterinar si aplica record olímpico para su disciplina */
        nombreClase = atleta.getClass().getCanonicalName();

        /* Caso 1 de atletas con record olímpico: Atletas de Halterofilia */
        if (nombreClase.contains("AtletaHalterofilia")) {

            AtletaHalterofilia atletaHalterofilia;
            atletaHalterofilia = (AtletaHalterofilia) atleta;

            if (atleta.isRecordOlimpico()) {
                textorecordOlimpico = "Record olímpico halterofilia: " + atletaHalterofilia.getTipoPrueba() + " " + atletaHalterofilia.getPeso() + " Kg.";
            } else {
                textorecordOlimpico = "El atleta no obtuvo record olímpico en halterofilia";
            }
        }

        /* Caso 2 de atletas con record olímpico: Atletas de salto alto */
        if (nombreClase.contains("AtletaSaltoAlto")) {

            AtletaSaltoAlto atletaSaltoAlto;
            atletaSaltoAlto = (AtletaSaltoAlto) atleta;

            if (atleta.isRecordOlimpico()) {
                textorecordOlimpico = "Record olímpico salto alto: " + atletaSaltoAlto.getAlturaSalto() + " m.";
            } else {
                textorecordOlimpico = "El atleta no obtuvo record olímpico en salto alto";
            }
        }

        /* Caso 3 de atletas con record olímpico: Nadador */
        if (nombreClase.contains("Nadador")) {

            Nadador nadador;
            nadador = (Nadador) atleta;

            if (atleta.isRecordOlimpico()) {
                textorecordOlimpico = "Record olímpico natación: " + nadador.getPruebaNatacion() + " Tiempo: " + nadador.getTiempo();
            } else {
                textorecordOlimpico = "El atleta no obtuvo record olímpico en natación";
            }
        }

        /* El resto de las disciplinas no tienen record olímpico. Se contruye una salida de acuerdo a dicha disciplina */
        if (nombreClase.contains("Futbolista")) textorecordOlimpico = "La disciplina fútbol no tiene record olímpico";

        if (nombreClase.contains("Tenista")) textorecordOlimpico = "La disciplina tenis no tiene record olímpico";

        return textorecordOlimpico;

    }

}
