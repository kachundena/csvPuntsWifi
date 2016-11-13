/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kachundena.csvpuntswifi.controller;

import com.kachundena.csvpuntswifi.modelo.*;
import com.kachundena.csvpuntswifi.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 *
 * @author alex
 */
public class PUNTS_WIFI_Controller {
    
    public static PUNTS_WIFI importCSV(String szFileCSV, String szSeparator, String szCodePage) throws FileNotFoundException, IOException {
        PUNTS_WIFI retorno = new PUNTS_WIFI();
        URL inFile = new URL(szFileCSV);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inFile.openStream(),szCodePage))) {
            String strLine;
            String[] regLine;
            // hace una primera lectura para omitir la cabecera.
            strLine = br.readLine();
            int i = 0;
            // recorre todas las lineas del CSV (a partir de la 2ª linea)
            while ((strLine = br.readLine()) != null)   {
                // divide el string en una cadena de string a partir del separador indicado.
                regLine = strLine.split(szSeparator);
                // si la longitud el fichero es diferente a cero
                if (regLine.length > 0) {
                    // Crea el objeto y le asigna todas las propiedades.
                    PUNT_WIFI PuntWifi = new PUNT_WIFI();
                    PuntWifi.setLinea(i);
                    PuntWifi.setCODI_CAPA(regLine[0]);
                    PuntWifi.setCAPA_GENERICA(regLine[1]);
                    PuntWifi.setNOM_CAPA(regLine[2]); 
                    PuntWifi.setED50_COORD_X(Utilities.fn_StringToFloat(regLine[3]));
                    PuntWifi.setED50_COORD_Y(Utilities.fn_StringToFloat(regLine[4]));
                    PuntWifi.setETRS89_COORD_X(Utilities.fn_StringToFloat(regLine[5]));
                    PuntWifi.setETRS89_COORD_Y(Utilities.fn_StringToFloat(regLine[6]));
                    PuntWifi.setLONGITUD(Utilities.fn_StringToFloat(regLine[7]));
                    PuntWifi.setLATITUD(Utilities.fn_StringToFloat(regLine[8]));
                    PuntWifi.setEQUIPAMENT(regLine[9]);
                    PuntWifi.setDISTRICTE(Integer.parseInt(regLine[10]));
                    PuntWifi.setBARRI(Integer.parseInt(regLine[11]));
                    PuntWifi.setNOM_DISTRICTE(regLine[12]);
                    PuntWifi.setNOM_BARRI(regLine[13]);
                    PuntWifi.setADRECA(regLine[14]);
                    PuntWifi.setTELEFON(regLine[15]);
                    // añade el objeto a la lista
                    retorno.addPuntWifi(PuntWifi);
                } 
                i++;
            }
            br.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        return retorno;     
    }

    public static void exportCSV(PUNTS_WIFI Lista, String szFileCSV, String szSeparator, String szCodePage) throws FileNotFoundException, IOException {
        try (BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(szFileCSV), szCodePage))){
            String szHeader = "CODI_CAPA;CAPA_GENERICA;NOM_CAPA;ED50_COORD_X;ED50_COORD_Y;ETRS89_COORD_X;ETRS89_COORD_Y;LONGITUD;LATITUD;EQUIPAMENT;DISTRICTE;BARRI;NOM_DISTRICTE;NOM_BARRI;ADRECA;TELEFON\r\n";
            br.write(szHeader);
            for(int i=0;i < Lista.getNumItems();i++) {
                PUNT_WIFI PuntWifi = Lista.getPuntWifi(i);
                String szLine = PuntWifi.getCODI_CAPA() + szSeparator +
                        PuntWifi.getCAPA_GENERICA() + szSeparator + 
                        PuntWifi.getNOM_CAPA() + szSeparator + 
                        PuntWifi.getED50_COORD_X() + szSeparator + 
                        PuntWifi.getED50_COORD_Y() + szSeparator + 
                        PuntWifi.getETRS89_COORD_X() + szSeparator + 
                        PuntWifi.getETRS89_COORD_Y() + szSeparator + 
                        PuntWifi.getLONGITUD() + szSeparator +
                        PuntWifi.getLATITUD() + szSeparator + 
                        PuntWifi.getEQUIPAMENT() + szSeparator +
                        PuntWifi.getDISTRICTE() + szSeparator + 
                        PuntWifi.getBARRI() + szSeparator + 
                        PuntWifi.getNOM_DISTRICTE() + szSeparator +
                        PuntWifi.getNOM_BARRI() + szSeparator + 
                        PuntWifi.getADRECA() + szSeparator +
                        PuntWifi.getTELEFON() + "\r\n";
                br.write(szLine);                     
            }            
            br.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
