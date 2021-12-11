/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anelsgamer.axel.numeros_a_letras;

/**
 *
 * @author Hamoncho
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("ingresa el número: ");
        String numero = teclado.next();

        int unidad = 0;
        int decena = 0;
        int centena = 0;
        int unidad_millar = 0;
        int decena_millar = 0;
        int centena_millar = 0;
        int unidad_millon = 0;
        int decena_millon = 0;
        int centena_millon = 0;
        int unidad_millar_millon = 0;

        for (int i = numero.length(); i > 0; i--) {
            if (i == numero.length()) {
                unidad = Integer.parseInt(numero.substring(numero.length() - 1, numero.length()));

            }
            if (i == numero.length() - 1) {
                decena = Integer.parseInt(numero.substring(numero.length() - 2, numero.length() - 1));

            }
            if (i == numero.length() - 2) {
                centena = Integer.parseInt(numero.substring(numero.length() - 3, numero.length() - 2));

            }
            if (i == numero.length() - 3) {
                unidad_millar = Integer.parseInt(numero.substring(numero.length() - 4, numero.length() - 3));

            }
            if (i == numero.length() - 4) {
                decena_millar = Integer.parseInt(numero.substring(numero.length() - 5, numero.length() - 4));

            }
            if (i == numero.length() - 5) {
                centena_millar = Integer.parseInt(numero.substring(numero.length() - 6, numero.length() - 5));

            }
            if (i == numero.length() - 6) {
                unidad_millon = Integer.parseInt(numero.substring(numero.length() - 7, numero.length() - 6));

            }
            if (i == numero.length() - 7) {
                decena_millon = Integer.parseInt(numero.substring(numero.length() - 8, numero.length() - 7));

            }
            if (i == numero.length() - 8) {
                centena_millon = Integer.parseInt(numero.substring(numero.length() - 9, numero.length() - 8));

            }
            if (i == numero.length() - 9) {
                unidad_millar_millon = Integer.parseInt(numero.substring(numero.length() - 10, numero.length() - 9));

            }

        }

        boolean acento_en_tres = false;
        boolean acento_en_seis = false;
        boolean mayor_nueve = false;
        String resultado = "";

        if (unidad_millar_millon > 0) {
            resultado += Valores.regresar_unidad_millar(unidad_millar_millon, acento_en_seis, false);

            acento_en_seis = false;

            mayor_nueve = true;

        }
        if (centena_millon > 0) {
            resultado += Valores.regresar_centena(centena_millon, unidad_millon, decena_millon);

            mayor_nueve = true;

        }
        if (decena_millon > 0) {
            resultado += Valores.regresar_decena(decena_millon, unidad_millon);

            if (unidad_millon < 6 && decena_millon == 1) {
                unidad_millon = 0;

            }
            if (decena_millon == 2) {
                acento_en_tres = true;

            }
            if (decena_millon <= 2) {
                acento_en_seis = true;

            }
            if (decena == 2) {
                acento_en_tres = true;

            }

            mayor_nueve = true;

        }
        if (unidad_millon > 0) {
            String aux = Valores.regresar_valor_del_uno_al_nueve(unidad_millon, acento_en_seis, acento_en_tres);

            if (aux.equals("uno")) {
                resultado += "un";

            } else {
                resultado += aux;

            }

            acento_en_tres = false;
            acento_en_seis = false;

            mayor_nueve = true;

        }

        if (unidad_millon > 0 || decena_millon > 0 || centena_millon > 0 || unidad_millar_millon > 0) {
            if (unidad_millon == 1 && decena_millon == 0 && centena_millon == 0 && unidad_millar_millon > 0) {
                resultado += " millón";

            } else {
                resultado += " millones";

            }

        }

        if (centena_millon > 0 || decena_millon > 0 || unidad_millon > 0) {
            if (unidad > 0 || decena > 0 || centena > 0 || unidad_millar > 0 || decena_millon > 0 || centena_millar > 0) {
                resultado += " ";

            }

        }

        if (centena_millar > 0) {
            resultado += Valores.regresar_centena(centena_millar, unidad_millar, decena_millar);

            mayor_nueve = true;
        }
        if (decena_millar > 0) {
            resultado += Valores.regresar_decena(decena_millar, unidad_millar);

            if (unidad_millar < 6 && decena_millar == 1) {
                resultado += " mil";
                unidad_millar = 0;

            }
            if (decena_millar == 2) {
                acento_en_tres = true;

            }
            if (decena_millar <= 2) {
                acento_en_seis = true;

            }

            mayor_nueve = true;

        }
        if (unidad_millar > 0) {
            resultado += Valores.regresar_unidad_millar(unidad_millar, acento_en_seis, acento_en_tres);

            acento_en_tres = false;
            acento_en_seis = false;

            mayor_nueve = true;

        }

        if (unidad_millar > 0 || decena_millar > 0 || centena_millar > 0) {
            if (unidad > 0 || decena > 0 || centena > 0) {
                resultado += " ";

            }

        }

        if (centena > 0) {
            resultado += Valores.regresar_centena(centena, unidad, decena);

            mayor_nueve = true;

        }
        if (decena > 0) {
            resultado += Valores.regresar_decena(decena, unidad);

            if (unidad < 6 && decena == 1) {
                unidad = 0;

            }
            if (decena == 2) {
                acento_en_tres = true;

            }
            if (decena <= 2) {
                acento_en_seis = true;

            }

            mayor_nueve = true;

        }
        if (unidad > 0) {
            resultado += Valores.regresar_valor_del_uno_al_nueve(unidad, acento_en_seis, acento_en_tres);

        }
        if (!mayor_nueve && unidad == 0) {
            resultado = "cero";

        }

        System.out.println(resultado);

    }

}
