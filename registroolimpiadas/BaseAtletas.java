/*
 * Clase que almacena la base de datos de atletas para implementar el problema
 */
package cl.duoc.pgy2121.s005v.registroolimpiadas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class BaseAtletas {

    private List<Atleta> listaAtletas;

    public BaseAtletas() {
        /* Constructor genera los datos para el problema */

        Atleta atleta;

        this.listaAtletas = new ArrayList<>();

        /* Generamos futbolistas */
        atleta = new Futbolista("Guillermo Ochoa", "Mexico", true, "Bronce", false, "Arquero", 0);
        this.listaAtletas.add(atleta);
        atleta = new Futbolista("Tae-Wook Jeong", "Corea del Sur", false, "Ninguna", false, "Defensa central", 0);
        this.listaAtletas.add(atleta);
        atleta = new Futbolista("Malcom", "Brasil", true, "Oro", false, "Delantero", 2);
        this.listaAtletas.add(atleta);
        atleta = new Futbolista("Jon Moncayola", "Espana", true, "Plata", false, "Mediocampista", 1);
        this.listaAtletas.add(atleta);

        /* Generamos atletas de salto alto */
        atleta = new AtletaSaltoAlto("Nicola McDermott", "Australia", true, "Plata", true, 2.02);
        this.listaAtletas.add(atleta);
        atleta = new AtletaSaltoAlto("Mariya Lasitskene", "Rusia", true, "Oro", true, 2.06);
        this.listaAtletas.add(atleta);
        atleta = new AtletaSaltoAlto("Yaroslava Mahuchikh", "Ucrania", false, "Ninguna", false, 1.93);
        this.listaAtletas.add(atleta);
        atleta = new AtletaSaltoAlto("Gabriele Cunningham", "USA", true, "Bronce", false, 1.92);
        this.listaAtletas.add(atleta);

        /* Generamos atletas de harterofilia */
        atleta = new AtletaHalterofilia("Lasha Talakhadze", "Georgia", true, "Bronce", true, "Arranque", 488);
        this.listaAtletas.add(atleta);
        atleta = new AtletaHalterofilia("Caine Morgan Wilkes", "USA", false, "Ninguna", false, "Envión", 398);
        this.listaAtletas.add(atleta);
        atleta = new AtletaHalterofilia("Marcos Ruiz Velasco", "Espana", false, "Ninguna", false, "Arranque", 380);
        this.listaAtletas.add(atleta);
        atleta = new AtletaHalterofilia("Péter Nagy", "Hungría", true, "Oro", false, "Arranque", 501);
        this.listaAtletas.add(atleta);
        atleta = new AtletaHalterofilia("Fabin Li", "China", true, "Plata", false, "Arranque", 493);
        this.listaAtletas.add(atleta);

        /* Generamos nadadores */
        atleta = new Nadador("Eduardo Cisternas", "Chile", false, "Ninguna", false, "400 m. libres", "3:54.10");
        this.listaAtletas.add(atleta);
        atleta = new Nadador("Tomoru Honda", "Japon", false, "Ninguna", false, "200 m. mariposa", "1:53.73");
        this.listaAtletas.add(atleta);
        atleta = new Nadador("Florian Wellbrock", "Alemania", true, "Oro", true, "1500 m. libres", "13:18.69");
        this.listaAtletas.add(atleta);
        atleta = new Nadador("Henning Muhlleitner", "Alemania", true, "Plata", true, "1500 m. libres", "13:19.03");
        this.listaAtletas.add(atleta);
        atleta = new Nadador("Kieran Smith", "USA", true, "Bronce", true, "1500 m. libres", "13:22.03");
        this.listaAtletas.add(atleta);

        /* Generamos tenistas */
        atleta = new Tenista("Alexander Zverev", "Alemania", true, "Oro", false, 8, "Derecho", "A dos manos");
        this.listaAtletas.add(atleta);
        atleta = new Tenista("Karen Kachanov", "Rusia", true, "Plata", false, 23, "Derecho", "A dos manos");
        this.listaAtletas.add(atleta);
        atleta = new Tenista("Pablo Carreño-Busta", "Espana", true, "Bronce", false, 16, "Derecho", "A dos manos");
        this.listaAtletas.add(atleta);
        atleta = new Tenista("Lorenzo Musetti", "Italia", false, "Ninguna", false, 44, "Derecho", "A una mano");
        this.listaAtletas.add(atleta);

    }

    public void mostrarResumen() {

        System.out.println(String.format("%-22s", "Disciplina")
                + String.format("%-20s", "Nombre")
                + String.format("%-20s", "País"));
        System.out.println(new String(new char[64]).replace("\0", "-"));

        for (Atleta at : listaAtletas) {
            System.out.println(at.mostrarResumen());
        }

    }

    public void mostrarDetalle() {

        int i = 1;

        for (Atleta at : listaAtletas) {
            System.out.println("Atleta N°" + i++);
            System.out.println(at.mostrarDetalle());
        }

    }

    public boolean existeAtleta(String nombreAtleta) {

        for (Atleta at : listaAtletas) {
            if (at.getNombre().equals(nombreAtleta)) {
                return true;
            }
        }

        return false;
    }

    public Atleta atletaEncontrado(String nombreAtleta) {

        for (Atleta at : listaAtletas) {
            if (at.getNombre().equals(nombreAtleta)) {
                return at;
            }
        }

        return null;

    }

    public String calculaTotalMedallas(String nombrePais) {

        int totalMedallas = 0;
        String mensajeSalida = "";

        for (Atleta at : listaAtletas) {
            if (nombrePais.toLowerCase().equals(at.getPais().toLowerCase())) {
                if (at.isGanoMedalla()) {
                    totalMedallas = totalMedallas + 1;
                }
            }
        }

        /* Construimos mensaje de salida */
        if (totalMedallas == 0) {
            mensajeSalida = "El país " + nombrePais + " no obtuvo medallas";
        } else if (totalMedallas == 1) {
            mensajeSalida = "El país " + nombrePais + " obtuvo 1 medalla";
        } else {
            mensajeSalida = "El país " + nombrePais + " obtuvo " + totalMedallas + " medallas";
        }

        return mensajeSalida;

    }

    public String obtenerMedalla(String tipoMedalla, String disciplina) {

        String mensajeSalida = "No hay medallas de tipo " + tipoMedalla + " para la disciplina escogida";
        String nombreClase = "";
        String nombreClaseDisciplina = "";
        String nombreDisciplina = "";

        disciplina = disciplina.trim().toLowerCase();

        /* Determinamos el nombre de la clase de acuerdo a lo ingresado */
        switch (disciplina) {
            case "1":
                nombreClaseDisciplina = "AtletaHalterofilia";
                nombreDisciplina = "Halterofilia";
                break;
            case "2":
                nombreClaseDisciplina = "AtletaSaltoAlto";
                nombreDisciplina = "Salto alto";
                break;
            case "3":
                nombreClaseDisciplina = "Futbolista";
                nombreDisciplina = "Fútbol";
                break;
            case "4":
                nombreClaseDisciplina = "Nadador";
                nombreDisciplina = "Natación";
                break;
            case "5":
                nombreClaseDisciplina = "Tenista";
                nombreDisciplina = "Tenis";
                break;
            default:
                return mensajeSalida;
        }

        for (Atleta at : listaAtletas) {

            nombreClase = at.getClass().getCanonicalName();

            if (nombreClase.contains(nombreClaseDisciplina)) {

                if (at.isGanoMedalla()) {
                    if (at.getTipoMedalla().equals(tipoMedalla)) {
                        mensajeSalida = String.format("%-22s", "Medalla de " + tipoMedalla)
                                + String.format("%-22s", at.getNombre())
                                + String.format("%-20s", at.getPais());

                    }
                }
            }

        }

        return mensajeSalida;

    }

    public void imprimirPodio(String disciplina) {

        String nombreDisciplina = "";
        
        /* Determinamos el nombre de la disciplina para su despliegue en pantalla */
        switch (disciplina) {
            case "1":
                nombreDisciplina = "Halterofilia";
                break;
            case "2":
                nombreDisciplina = "Salto alto";
                break;
            case "3":
                nombreDisciplina = "Fútbol";
                break;
            case "4":
                nombreDisciplina = "Natación";
                break;
            case "5":
                nombreDisciplina = "Tenis";
                break;
        }

        System.out.println("\nPodio de " + nombreDisciplina);
        System.out.println(new String(new char[64]).replace("\0", "-"));
        System.out.println(this.obtenerMedalla("Oro", disciplina));
        System.out.println(this.obtenerMedalla("Plata", disciplina));
        System.out.println(this.obtenerMedalla("Bronce", disciplina));

    }

}
    