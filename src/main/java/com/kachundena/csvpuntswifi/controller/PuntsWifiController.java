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
public class PuntsWifiController {
    
    public static PuntsWifi importCSV(String szFileCSV, String szSeparator, String szCodePage) throws FileNotFoundException, IOException {
        PuntsWifi retorno = new PuntsWifi();
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
                    PuntWifi PuntWifi = new PuntWifi();
                    PuntWifi.setLinea(i);
                    PuntWifi.setCodiCapa(regLine[0]);
                    PuntWifi.setCapaGenerica(regLine[1]);
                    PuntWifi.setNomCapa(regLine[2]); 
                    PuntWifi.setED50CoordX(Utilities.fn_StringToFloat(regLine[3]));
                    PuntWifi.setED50CoordY(Utilities.fn_StringToFloat(regLine[4]));
                    PuntWifi.setETRS89CoordX(Utilities.fn_StringToFloat(regLine[5]));
                    PuntWifi.setETRS89CoordY(Utilities.fn_StringToFloat(regLine[6]));
                    PuntWifi.setLongitud(Utilities.fn_StringToFloat(regLine[7]));
                    PuntWifi.setLatitud(Utilities.fn_StringToFloat(regLine[8]));
                    PuntWifi.setEquipament(regLine[9]);
                    PuntWifi.setDistricte(Integer.parseInt(regLine[10]));
                    PuntWifi.setBarri(Integer.parseInt(regLine[11]));
                    PuntWifi.setNomDistricte(regLine[12]);
                    PuntWifi.setNomBarri(regLine[13]);
                    PuntWifi.setAdreca(regLine[14]);
                    PuntWifi.setTelefon(regLine[15]);
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

    public static void exportCSV(PuntsWifi Lista, String szFileCSV, String szSeparator, String szCodePage) throws FileNotFoundException, IOException {
        try (BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(szFileCSV), szCodePage))){
            String szHeader = "CODI_CAPA;CAPA_GENERICA;NOM_CAPA;ED50_COORD_X;ED50_COORD_Y;ETRS89_COORD_X;ETRS89_COORD_Y;LONGITUD;LATITUD;EQUIPAMENT;DISTRICTE;BARRI;NOM_DISTRICTE;NOM_BARRI;ADRECA;TELEFON\r\n";
            br.write(szHeader);
            for(int i=0;i < Lista.getNumItems();i++) {
                PuntWifi PuntWifi = Lista.getPuntWifi(i);
                String szLine = PuntWifi.getCodiCapa() + szSeparator +
                        PuntWifi.getCapaGenerica() + szSeparator + 
                        PuntWifi.getNomCapa() + szSeparator + 
                        PuntWifi.getED50CoordX() + szSeparator + 
                        PuntWifi.getED50CoordY() + szSeparator + 
                        PuntWifi.getETRS89CoordX() + szSeparator + 
                        PuntWifi.getETRS89CoordY() + szSeparator + 
                        PuntWifi.getLongitud() + szSeparator +
                        PuntWifi.getLatitud() + szSeparator + 
                        PuntWifi.getEquipament() + szSeparator +
                        PuntWifi.getDistricte() + szSeparator + 
                        PuntWifi.getBarri() + szSeparator + 
                        PuntWifi.getNomDistricte() + szSeparator +
                        PuntWifi.getNomBarri() + szSeparator + 
                        PuntWifi.getAdreca() + szSeparator +
                        PuntWifi.getTelefon() + "\r\n";
                br.write(szLine);                     
            }            
            br.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
