package com.kachundena.csvpuntswifi.modelo;


import java.util.ArrayList;
import java.util.List;




public class PuntsWifi {

	private List<PuntWifi> PuntsWifi;

	public PuntsWifi() {
            PuntsWifi = new ArrayList<PuntWifi>();
	}

	/**
	 * 
	 * @param PuntWifi
	 */
	public void addPuntWifi(PuntWifi PuntWifi) {
            PuntsWifi.add(PuntWifi);
	}

	/**
	 * 
	 * @param Linea
	 * @param PuntWifi
	 */
	public void editPuntWifi(int Linea, PuntWifi PuntWifi) {
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
	public PuntWifi getPuntWifi(int Linea) {
            return PuntsWifi.get(Linea);
	}

	public int getNumItems() {
            return PuntsWifi.size();
	}

 	public List<PuntWifi> getAllPuntsWifi() {
            return PuntsWifi;
	}
       
        
        
	/**
	 * 
	 * @param Districte
	 */
	public List<PuntWifi> getPuntsWifiDistricte(int Districte) {
            int i = 0;
            while (i< PuntsWifi.size()) {
                if (PuntsWifi.get(i).getDistricte() != Districte) {
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
	 * @param Barri
	 */
	public List<PuntWifi> getPuntsWifiBarri(int Barri) {
            int i = 0;
            while (i< PuntsWifi.size()) {
                if (PuntsWifi.get(i).getBarri() != Barri) {
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
	 * @param Longitud
	 * @param Latitud
	 */
	public List<PuntWifi> getNearPuntsWifi(float Longitud, float Latitud) {
		// TODO - implement PUNTS_WIFI.getNearPuntsWifi
		throw new UnsupportedOperationException();
	}

}