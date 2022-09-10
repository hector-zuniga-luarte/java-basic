/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.s005v.registroolimpiadas.business;

import cl.duoc.pgy2121.s005v.registroolimpiadas.Atleta;

/**
 *
 * @author Administrador
 */
public interface RegistroOlimpiadasBusiness {

    public final String NOMBRE_SISTEMA = "REGISTRO OLIMPIADAS \"TOKYO 2020\"";
    
    public abstract String obtenerRecordOlimpico(Atleta atleta);
    
}
