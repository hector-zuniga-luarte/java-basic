/*
 *  Asignatura  :   PGY2121 - Desarrollo de software de escritorio
 *  Profesor    :   Ramiro Urbina
 *  Actividad   :   Prueba 02
 *  Alumno      :   Héctor Zúñiga Luarte
 *  Fecha       :   28.10.2021
 *
 */
package cl.duoc.pgy2121.s005v.registroolimpiadas;

import cl.duoc.pgy2121.s005v.registroolimpiadas.registroolimpiadas.impl.RegistroOlimpiadasBusinessImpl;
import java.util.Scanner;

/**
 *
 * @author hec.zuniga@duocuc.cl
 */
public class RegistroOlimpiadas {

    public static void main(String[] args) {

        /* Variables del programa */
        String opcion = "";
        String aux = "";
        String nombreAtleta = "";
        boolean existeAtleta = false;
        String nombrePais = "";
        String disciplina = "";

        /* Objeto Scanner */
        Scanner entrada;
        entrada = new Scanner(System.in);

        /* Instanciamos la clase que provee una base de atletas para el problema (los datos se cargan en el constructor) */
        Atleta atleta = null;
        BaseAtletas baseAtletas;
        baseAtletas = new BaseAtletas();

        /* Implementamos la interfaz */
        RegistroOlimpiadasBusinessImpl registroOlimpiadasBusiness;
        registroOlimpiadasBusiness = new RegistroOlimpiadasBusinessImpl();

        /* Se implementa el menú */
        while (true) {

            System.out.println("\n" + registroOlimpiadasBusiness.NOMBRE_SISTEMA);
            System.out.println("MENÚ ADMINISTRACIÓN");
            System.out.println("   0)  SALIR");
            System.out.println("   --------------------------------------");
            System.out.println("   1)  Registro de atletas");
            System.out.println("   2)  Detalle de registro de atletas");
            System.out.println("   --------------------------------------");
            System.out.println("   3)  Obtener valor de record olímpico");
            System.out.println("   4)  Calcular medallas de un país");
            System.out.println("   5)  Determinar podio de una disciplina");
            System.out.println("\n");

            System.out.println("Ingrese su opción: ");
            opcion = entrada.nextLine().trim();

            switch (opcion) {
                case "0":
                    System.out.println("--------------------------------");
                    System.out.println("GRACIAS POR USAR NUESTRO SISTEMA " + registroOlimpiadasBusiness.NOMBRE_SISTEMA);
                    System.out.println("--------------------------------");
                    System.exit(0);
                case "1":
                    System.out.println("OPCIÓN 1: REGISTRO DE ATLETAS\n");

                    baseAtletas.mostrarResumen();

                    break;
                case "2":
                    System.out.println("OPCIÓN 2: DETALLE DE REGISTRO DE ATLETAS\n");

                    baseAtletas.mostrarDetalle();

                    break;
                case "3":
                    System.out.println("OPCIÓN 3: OBTENER VALOR DE UN RECORD OLÍMPICO\n");

                    /* Ingreso y validación de un atleta que esté en la base de atletas */
                    System.out.println("Ingrese el nombre del atleta a consultar: ");
                    nombreAtleta = entrada.nextLine().trim();

                    /* Buscamos el atleta. Si lo encontramos, lo recuperamos */
                    existeAtleta = baseAtletas.existeAtleta(nombreAtleta);
                    if (!existeAtleta) {
                        System.out.println("ERROR: El atleta " + nombreAtleta + " no está en la base de datos disponible. Verifique el nombre y reintente.");
                        break;
                    }

                    /* Ya sabemos que el atleta existe. Los almacenamos en la variable atleta */
                    if (existeAtleta) {
                        atleta = baseAtletas.atletaEncontrado(nombreAtleta);
                    }

                    /* Imprimimos el record olímpico de acuerdo a la funcionalidad de la interfaz */
                    System.out.println(registroOlimpiadasBusiness.obtenerRecordOlimpico(atleta));

                    break;
                case "4":
                    System.out.println("OPCIÓN 4: CALCULAR MEDALLAS DE UN PAIS\n");

                    /* Ingreso de un país */
                    System.out.println("Ingrese el nombre del país (No ingrese ñ's ni letras con acentos): ");
                    nombrePais = entrada.nextLine().trim();

                    System.out.println(baseAtletas.calculaTotalMedallas(nombrePais));

                    break;
                case "5":
                    System.out.println("OPCIÓN 5: DETERMINAR PODIO DE UNA DISCIPLINA\n");

                    /* Ingreso de una disciplina */
                    System.out.println("Ingrese la disciplina de acuerdo a la siguiente tabla: ");
                    System.out.println("1. Halterofilia");
                    System.out.println("2. Salto alto");
                    System.out.println("3. Fútbol");
                    System.out.println("4. Natación");
                    System.out.println("5. Tenis");
                    
                    disciplina = entrada.nextLine().trim();

                    baseAtletas.imprimirPodio(disciplina);

                    break;
                default:
                    System.out.println("MENSAJE");
                    System.out.println("\"" + opcion + "\" es una opción incorrecta. Vuelva a seleccionar una opción de las disponibles en el menú");

                    break;

            }

        }
    }

}
