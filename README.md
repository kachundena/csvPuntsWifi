csvPuntsWifi
===========

Proyecto de servicios REST de archivo opendata de puntos WIFI de la ciudad de Barcelona

Parámetros de llamadas a fichero

* FILENAME_CSV_URL: dirección pública URI de fichero CSV
* FILENAME_CSV: dirección privada de fichero CSV
* SEPARATOR_COL; separador entre campos del CSV
* CODEPAGE: código de página utilizado en el fichero

Seguridad

* KEY: Clave de seguridad para servicios REST tipo POST, PUT y DELETE

Servicios 
---------

getPuntsWifiBarri: devuelve todos los puntos wifi del barrio
* Parámetro entrada: barrio  int32  
* Parámetro salida: Lista de PuntWifi

getPuntsWifiDistricte
* Parámetro entrada: districte  int32  
* Parámetro salida: Lista de PuntWifi

getListaPuntsWifi
* Parámetro salida: Lista de PuntWifi

* getPuntWifi
* Parámetro entrada: linea  int32  
* Parámetro salida: PuntWifi


addPuntWifi
* Parámetro entrada: PuntWifi
* Parámetro header: Autorización

updatePuntWifi
* Parámetro entrada: PuntWifi
* Parámetro header: Autorización

deletePuntWifi
* Parámetro entrada: Linea int32 
* Parámetro header: Autorización

Clase PuntWifi

PUNT_WIFI
 {
linea:	integer (int32)
latitud: number (float)
equipament: string
districte: integer (int32)
barri:	 integer (int32)
nom_DISTRICTE: string
nom_BARRI: string
adreca:	 string
telefon: string
codi_CAPA: string
capa_GENERICA:	 string
nom_CAPA: string
ed50_COORD_X:	 number (float)
ed50_COORD_Y:	 number (float)
etrs89_COORD_X:	 number (float)
etrs89_COORD_Y:	 number (float)
longitud:	 number (float)
}