/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kachundena.csvpuntswifi.webservice;

import com.kachundena.csvpuntswifi.modelo.*;
import com.kachundena.csvpuntswifi.util.*;
import static com.kachundena.csvpuntswifi.controller.PuntsWifiController.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.io.IOException;
import javax.ws.rs.DELETE;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;

/**
 * REST Web Service
 *
 * @author alex
 */
@Path("/ws")
@Api(value = "/ws", description = "Operaciones con CSV PUNTS_WIFI")
@Produces(MediaType.APPLICATION_JSON)
public class wsPuntWifi {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of wsPuntWifi
     */
    public wsPuntWifi() {
    }

    /**
     * Retrieves representation of an instance of com.kachundena.csvpuntswifi.webservice.wsPuntWifi
     * @return an instance of java.lang.String
     */

    
    @GET
    @Path("/lista")
    @ApiOperation(
            value = "Todos los puntos wifi",
            notes = "Devuelve todos los puntos wifi"
    )
    @Produces(MediaType.APPLICATION_JSON)
    public List<PuntWifi> getListaPuntsWifi() throws IOException {
        List<PuntWifi> retorno = new ArrayList<PuntWifi>();
        try {
            // Importar valores de CSV a lista
            PuntsWifi Lista = importCSV(Constantes.FILENAME_CSV_URL,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            // Retornar todos los valores de la lista
            retorno = Lista.getAllPuntsWifi();
        }
        catch (Exception e) {
            System.console().printf(e.toString());
        }
        return retorno;
    }    
    
    @GET
    @Path("/puntwifi/{linea}")
    @ApiOperation(
            value = "retornar punto wifi",
            notes = "Devuelve un punto wifi concreto de una linea"
    )
    @Produces(MediaType.APPLICATION_JSON)
    public PuntWifi getPuntWifi(
            @ApiParam(value = "Linea Punto WIFI", allowableValues = "range[1," + Integer.MAX_VALUE + "]", required = true)
            @PathParam("linea") int linea) {
        PuntWifi retorno = new PuntWifi();
        try {
            // Importar valores de CSV a lista
            PuntsWifi Lista = importCSV(Constantes.FILENAME_CSV_URL,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            // retornar la linea seleccionada
            retorno = Lista.getPuntWifi(linea);           
        }
        catch (Exception e) {
            System.console().printf(e.toString());
        }
        return retorno;
  
    }

    @GET
    @Path("/distrito/{distrito}")
    @ApiOperation(
            value = "retornar lista puntos wifi de un distrito",
            notes = "Devuelve los puntos wifis que hay en un distrito"
    )
    @Produces(MediaType.APPLICATION_JSON)
    public List<PuntWifi> getPuntsWifiDistricte(
            @ApiParam(value = "Código de distrito", allowableValues = "range[1," + Integer.MAX_VALUE + "]", required = true)
            @PathParam("distrito") int DISTRICTE) {
        List<PuntWifi> retorno = new ArrayList<PuntWifi>();
        try {
            // Importar valores de CSV a lista
            PuntsWifi Lista = importCSV(Constantes.FILENAME_CSV_URL,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            // Retornar todos los valores de la lista
            retorno = Lista.getPuntsWifiDistricte(DISTRICTE);
        }
        catch (Exception e) {
            System.console().printf(e.toString());
        }
        return retorno;
  
    }

    @GET
    @Path("/barrio/{barrio}")
    @ApiOperation(
            value = "retornar lista puntos wifi de un barrio",
            notes = "Devuelve los puntos wifis que hay en un barrio"
    )
    @Produces(MediaType.APPLICATION_JSON)
    public List<PuntWifi> getPuntsWifiBarri(
            @ApiParam(value = "Código de barrio", allowableValues = "range[1," + Integer.MAX_VALUE + "]", required = true)
            @PathParam("barrio") int BARRI) {
        List<PuntWifi> retorno = new ArrayList<PuntWifi>();
        try {
            // Importar valores de CSV a lista
            PuntsWifi Lista = importCSV(Constantes.FILENAME_CSV_URL,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            // Retornar todos los valores de la lista
            retorno = Lista.getPuntsWifiBarri(BARRI);
        }
        catch (Exception e) {
            System.console().printf(e.toString());
        }
        return retorno;
  
    }
    
    
    
    @POST
    @Path("/add")
    @ApiOperation(
            value = "añadir punto wifi",
            notes = "Añade un punto de Wifi al final de fichero"
    )
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean addPuntWifi(PuntWifi PuntWifi, 
                            @HeaderParam("authorization") String keyString) {
        try {
            if(!Utilities.isCorrectKey(keyString)) {
                return false;
            }
            // Importar valores de CSV a lista
            PuntsWifi Lista = importCSV(Constantes.FILENAME_CSV_URL,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            // Añadir el nuevo punto WIFI a la lista. Al final de esta.
            Lista.addPuntWifi(PuntWifi);
            // Exportar la lista al CSV
            exportCSV(Lista,Constantes.FILENAME_CSV,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            return true;
        }
        catch (Exception e) {
            System.console().printf(e.toString());
            return false;
        }
       
    }

    @PUT
    @Path("/update")
    @ApiOperation(
            value = "actualiza un punto wifi",
            notes = "Actualiza un punto Wifi concreto"
    )
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updatePuntWifi(PuntWifi PuntWifi, 
                            @HeaderParam("authorization") String keyString) {
        int i = 0;
        i = 1;
        
        try {
            if(!Utilities.isCorrectKey(keyString)) {
                return false;
            }
            // Importar valores de CSV a lista
            PuntsWifi Lista = importCSV(Constantes.FILENAME_CSV_URL,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            // Editar el punto WIFI de la linea. Para ello cogemos la linea del punto WIFI del parámetro
            Lista.editPuntWifi(PuntWifi.getLinea(), PuntWifi);
            // Exportar la lista al CSV
            exportCSV(Lista,Constantes.FILENAME_CSV,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            return true;
        }
        catch (Exception e) {
            System.console().printf(e.toString());
            return false;
        }
        
    }

    @DELETE
    @Path("/delete/{linea}")
    @ApiOperation(
            value = "borrar un punto wifi",
            notes = "Borra un punto wifi de la linea especificada"
    )
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deletePuntWifi(
            @ApiParam(value = "Linea Punto WIFI", allowableValues = "range[1," + Integer.MAX_VALUE + "]", required = true)
            @PathParam("linea") int Linea, 
            @HeaderParam("authorization") String keyString) {
        try {
            if(!Utilities.isCorrectKey(keyString)) {
                return false;
            }
            // Importar valores de CSV a lista
            PuntsWifi Lista = importCSV(Constantes.FILENAME_CSV_URL,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            // Borrar la entrada de la lista a partir de la linea indicada en el parámetro
            Lista.deletePuntWifi(Linea);
            // Exportar al CSV el resto de la lista
            exportCSV(Lista,Constantes.FILENAME_CSV,Constantes.SEPARATOR_COL,Constantes.CODEPAGE);
            return true;
        }
        catch (Exception e) {
            System.console().printf(e.toString());
            return false;
        }

    }
    
}
