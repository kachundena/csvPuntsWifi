/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kachundena.csvpuntswifi.util;

/**
 *
 * @author alex
 */
public class Utilities {
    public static float fn_StringToFloat(String valor) {
        float retorno;
        valor = valor.replace(",", ".");
        retorno = Float.parseFloat(valor);
        return retorno;
    }
    public static String fn_FloatToString(float valor) {
        String retorno;
        retorno = String.valueOf(valor);
        retorno = retorno.replace(".",",");
        return retorno;
    }
}