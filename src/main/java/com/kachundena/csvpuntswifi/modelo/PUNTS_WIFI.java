package com.kachundena.csvpuntswifi.modelo;


import java.util.ArrayList;
import java.util.List;




public class PUNTS_WIFI {

	private List<PUNT_WIFI> PuntsWifi;

	public PUNTS_WIFI() {
            PuntsWifi = new ArrayList<PUNT_WIFI>();
	}

	/**
	 * 
	 * @param PuntWifi
	 */
	public void addPuntWifi(PUNT_WIFI PuntWifi) {
            PuntsWifi.add(PuntWifi);
	}

	/**
	 * 
	 * @param Linea
	 * @param PuntWifi
	 */
	public void editPuntWifi(int Linea, PUNT_WIFI PuntWifi) {
            PuntsWifi.set(Linea, PuntWifi);
	}

        /**
	 * 
	 * @param Linea
	 */
        public void deletePuntWifi(int Linea) {
            PuntsWifi.remove(Linea);
        }
        

        /**
	 * 
	 * @param Linea
	 */
	public PUNT_WIFI getPuntWifi(int Linea) {
            return PuntsWifi.get(Linea);
	}

	public int getNumItems() {
            return PuntsWifi.size();
	}

 	public List<PUNT_WIFI> getAllPuntsWifi() {
            return PuntsWifi;
	}
       
        
        
	/**
	 * 
	 * @param DISTRICTE
	 */
	public List<PUNT_WIFI> getPuntsWifiDistricte(int DISTRICTE) {
            int i = 0;
            while (i< PuntsWifi.size()) {
                if (PuntsWifi.get(i).getDISTRICTE() != DISTRICTE) {
                    PuntsWifi.remove(i); 
                }  
                else {
                    i += 1;
                }
            }
            return PuntsWifi;
	}

	/**
	 * 
	 * @param BARRI
	 */
	public List<PUNT_WIFI> getPuntsWifiBarri(int BARRI) {
            int i = 0;
            while (i< PuntsWifi.size()) {
                if (PuntsWifi.get(i).getBARRI() != BARRI) {
                    PuntsWifi.remove(i); 
                }  
                else {
                    i += 1;
                }
            }
            return PuntsWifi;
	}

	/**
	 * 
	 * @param LONGITUD
	 * @param LATITUD
	 */
	public List<PUNT_WIFI> getNearPuntsWifi(float LONGITUD, float LATITUD) {
		// TODO - implement PUNTS_WIFI.getNearPuntsWifi
		throw new UnsupportedOperationException();
	}

}