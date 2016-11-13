package com.kachundena.csvpuntswifi.modelo;

public class PUNT_WIFI {

	private int Linea;
        private String CODI_CAPA;
	private String CAPA_GENERICA;
	private String NOM_CAPA;
	private float ED50_COORD_X;
	private float ED50_COORD_Y;
	private float ETRS89_COORD_X;
	private float ETRS89_COORD_Y;
	private float LONGITUD;
	private float LATITUD;
	private String EQUIPAMENT;
	private int DISTRICTE;
	private int BARRI;
	private String NOM_DISTRICTE;
	private String NOM_BARRI;
	private String ADRECA;
	private String TELEFON;

	/**
	 * 
	 * @param Linea
	 * @param CODI_CAPA
	 * @param CAPA_GENERICA
	 * @param NOM_CAPA
	 * @param ED50_COORD_X
	 * @param ED50_COORD_Y
	 * @param ETRS89_COORD_X
	 * @param ETRS89_COORD_Y
	 * @param LONGITUD
	 * @param LATITUD
	 * @param EQUIPAMENT
	 * @param DISTRICTE
	 * @param BARRI
	 * @param NOM_DISTRICTE
	 * @param NOM_BARRI
	 * @param ADRECA
	 * @param TELEFON
	 */
	public PUNT_WIFI(int Linea, String CODI_CAPA, String CAPA_GENERICA, String NOM_CAPA, float ED50_COORD_X, float ED50_COORD_Y, float ETRS89_COORD_X, float ETRS89_COORD_Y, float LONGITUD, float LATITUD, String EQUIPAMENT, int DISTRICTE, int BARRI, String NOM_DISTRICTE, String NOM_BARRI, String ADRECA, String TELEFON) {
            this.Linea = Linea;
            this.CODI_CAPA = CODI_CAPA;
            this.CAPA_GENERICA = CAPA_GENERICA;
            this.NOM_CAPA = NOM_CAPA;
            this.ED50_COORD_X = ED50_COORD_X;
            this.ED50_COORD_Y = ED50_COORD_Y;
            this.ETRS89_COORD_X = ETRS89_COORD_X;
            this.ETRS89_COORD_Y = ETRS89_COORD_Y;
            this.LONGITUD = LONGITUD;
            this.LATITUD = LATITUD;
            this.EQUIPAMENT = EQUIPAMENT;
            this.DISTRICTE = DISTRICTE;
            this.BARRI = BARRI;
            this.NOM_DISTRICTE = NOM_DISTRICTE;
            this.NOM_BARRI = NOM_BARRI;
            this.ADRECA = ADRECA;
            this.TELEFON = TELEFON;
		throw new UnsupportedOperationException();
	}

        public PUNT_WIFI() {
	}
        
	public int getLinea() {
            return this.Linea;
	}

	/**
	 * 
	 * @param CODI_CAPA
	 */
	public void setLinea(int Linea) {
            this.Linea = Linea;
        }
        
	public String getCODI_CAPA() {
            return this.CODI_CAPA;
	}

	/**
	 * 
	 * @param CODI_CAPA
	 */
	public void setCODI_CAPA(String CODI_CAPA) {
            this.CODI_CAPA = CODI_CAPA;
	}

	public String getCAPA_GENERICA() {
            return this.CAPA_GENERICA;
	}

	/**
	 * 
	 * @param CAPA_GENERICA
	 */
	public void setCAPA_GENERICA(String CAPA_GENERICA) {
            this.CAPA_GENERICA = CAPA_GENERICA;
	}

	public String getNOM_CAPA() {
            return this.NOM_CAPA;
	}

	/**
	 * 
	 * @param NOM_CAPA
	 */
	public void setNOM_CAPA(String NOM_CAPA) {
            this.NOM_CAPA = NOM_CAPA;
	}

	public float getED50_COORD_X() {
            return this.ED50_COORD_X;
	}

	/**
	 * 
	 * @param ED50_COORD_X
	 */
	public void setED50_COORD_X(float ED50_COORD_X) {
            this.ED50_COORD_X = ED50_COORD_X;
	}

	public float getED50_COORD_Y() {
            return this.ED50_COORD_Y;
	}

	/**
	 * 
	 * @param ED50_COORD_Y
	 */
	public void setED50_COORD_Y(float ED50_COORD_Y) {
            this.ED50_COORD_Y = ED50_COORD_Y;
	}

	public float getETRS89_COORD_X() {
            return this.ETRS89_COORD_X;
	}

	/**
	 * 
	 * @param ETRS89_COORD_X
	 */
	public void setETRS89_COORD_X(float ETRS89_COORD_X) {
            this.ETRS89_COORD_X = ETRS89_COORD_X;
	}

	public float getETRS89_COORD_Y() {
            return this.ETRS89_COORD_Y;
	}

	/**
	 * 
	 * @param ETRS89_COORD_Y
	 */
	public void setETRS89_COORD_Y(float ETRS89_COORD_Y) {
            this.ETRS89_COORD_Y = ETRS89_COORD_Y;
	}

	public float getLONGITUD() {
            return this.LONGITUD;
	}

	/**
	 * 
	 * @param LONGITUD
	 */
	public void setLONGITUD(float LONGITUD) {
            this.LONGITUD = LONGITUD;
	}

	public float getLATITUD() {
            return this.LATITUD;
	}

	/**
	 * 
	 * @param LATITUD
	 */
	public void setLATITUD(float LATITUD) {
            this.LATITUD = LATITUD;
	}

	public String getEQUIPAMENT() {
            return this.EQUIPAMENT;
	}

	/**
	 * 
	 * @param EQUIPAMENT
	 */
	public void setEQUIPAMENT(String EQUIPAMENT) {
            this.EQUIPAMENT = EQUIPAMENT;
	}

	public int getDISTRICTE() {
            return this.DISTRICTE;
	}

	/**
	 * 
	 * @param DISTRICTE
	 */
	public void setDISTRICTE(int DISTRICTE) {
            this.DISTRICTE = DISTRICTE;
	}

	public int getBARRI() {
            return this.BARRI;
	}

	/**
	 * 
	 * @param BARRI
	 */
	public void setBARRI(int BARRI) {
            this.BARRI = BARRI;
	}

	public String getNOM_DISTRICTE() {
            return this.NOM_DISTRICTE;
	}

	/**
	 * 
	 * @param NOM_DISTRICTE
	 */
	public void setNOM_DISTRICTE(String NOM_DISTRICTE) {
            this.NOM_DISTRICTE = NOM_DISTRICTE;
	}

	public String getNOM_BARRI() {
            return this.NOM_BARRI;
	}

	/**
	 * 
	 * @param NOM_BARRI
	 */
	public void setNOM_BARRI(String NOM_BARRI) {
            this.NOM_BARRI = NOM_BARRI;
	}

	public String getADRECA() {
            return this.ADRECA;
	}

	/**
	 * 
	 * @param ADRECA
	 */
	public void setADRECA(String ADRECA) {
            this.ADRECA = ADRECA;
	}

	public String getTELEFON() {
            return this.TELEFON;
	}

	/**
	 * 
	 * @param TELEFON
	 */
	public void setTELEFON(String TELEFON) {
            this.TELEFON = TELEFON;
	}

}