package com.kachundena.csvpuntswifi.modelo;

public class PuntWifi {

	private int Linea;
        private String CodiCapa;
	private String CapaGenerica;
	private String NomCapa;
	private float ED50CoordX;
	private float ED50CoordY;
	private float ETRS89CoordX;
	private float ETRS89CoordY;
	private float Longitud;
	private float Latitud;
	private String Equipament;
	private int Districte;
	private int Barri;
	private String NomDistricte;
	private String NomBarri;
	private String Adreca;
	private String Telefon;

	/**
	 * 
	 * @param Linea
	 * @param CodiCapa
	 * @param CapaGenerica
	 * @param NomCapa
	 * @param ED50CoordX
	 * @param ED50CoordY
	 * @param ETRS89CoordX
	 * @param ETRS89CoordY
	 * @param Longitud
	 * @param Latitud
	 * @param Equipament
	 * @param Districte
	 * @param Barri
	 * @param NomDistricte
	 * @param NomBarri
	 * @param Adreca
	 * @param Telefono
	 */
	public PuntWifi(int Linea, String CodiCapa, String CapaGenerica, String NomCapa, float ED50CoordX, float ED50CoordY, float ETRS89CoordX, float ETRS89CoordY, float Longitud, float Latitud, String Equipament, int Districte, int Barri, String NomDistricte, String NomBarri, String Adreca, String Telefon) {
            this.Linea = Linea;
            this.CodiCapa = CodiCapa;
            this.CapaGenerica = CapaGenerica;
            this.NomCapa = NomCapa;
            this.ED50CoordX = ED50CoordX;
            this.ED50CoordY = ED50CoordY;
            this.ETRS89CoordX = ETRS89CoordX;
            this.ETRS89CoordY = ETRS89CoordY;
            this.Longitud = Longitud;
            this.Latitud = Latitud;
            this.Equipament = Equipament;
            this.Districte = Districte;
            this.Barri = Barri;
            this.NomDistricte = NomDistricte;
            this.NomBarri = NomBarri;
            this.Adreca = Adreca;
            this.Telefon = Telefon;
		throw new UnsupportedOperationException();
	}

        public PuntWifi() {
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
        
	public String getCodiCapa() {
            return this.CodiCapa;
	}

	/**
	 * 
	 * @param CodiCapa
	 */
	public void setCodiCapa(String CodiCapa) {
            this.CodiCapa = CodiCapa;
	}

	public String getCapaGenerica() {
            return this.CapaGenerica;
	}

	/**
	 * 
	 * @param CapaGenerica
	 */
	public void setCapaGenerica(String CapaGenerica) {
            this.CapaGenerica = CapaGenerica;
	}

	public String getNomCapa() {
            return this.NomCapa;
	}

	/**
	 * 
	 * @param NomCapa
	 */
	public void setNomCapa(String NomCapa) {
            this.NomCapa = NomCapa;
	}

	public float getED50CoordX() {
            return this.ED50CoordX;
	}

	/**
	 * 
	 * @param ED50CoordX
	 */
	public void setED50CoordX(float ED50CoordX) {
            this.ED50CoordX = ED50CoordX;
	}

	public float getED50CoordY() {
            return this.ED50CoordY;
	}

	/**
	 * 
	 * @param ED50CoordY
	 */
	public void setED50CoordY(float ED50CoordY) {
            this.ED50CoordY = ED50CoordY;
	}

	public float getETRS89CoordX() {
            return this.ETRS89CoordX;
	}

	/**
	 * 
	 * @param ETRS89CoordX
	 */
	public void setETRS89CoordX(float ETRS89CoordX) {
            this.ETRS89CoordX = ETRS89CoordX;
	}

	public float getETRS89CoordY() {
            return this.ETRS89CoordY;
	}

	/**
	 * 
	 * @param ETRS89CoordY
	 */
	public void setETRS89CoordY(float ETRS89CoordY) {
            this.ETRS89CoordY = ETRS89CoordY;
	}

	public float getLongitud() {
            return this.Longitud;
	}

	/**
	 * 
	 * @param Longitud
	 */
	public void setLongitud(float Longitud) {
            this.Longitud = Longitud;
	}

	public float getLatitud() {
            return this.Latitud;
	}

	/**
	 * 
	 * @param Latitud
	 */
	public void setLatitud(float Latitud) {
            this.Latitud = Latitud;
	}

	public String getEquipament() {
            return this.Equipament;
	}

	/**
	 * 
	 * @param Equipament
	 */
	public void setEquipament(String Equipament) {
            this.Equipament = Equipament;
	}

	public int getDistricte() {
            return this.Districte;
	}

	/**
	 * 
	 * @param Districte
	 */
	public void setDistricte(int Districte) {
            this.Districte = Districte;
	}

	public int getBarri() {
            return this.Barri;
	}

	/**
	 * 
	 * @param Barri
	 */
	public void setBarri(int Barri) {
            this.Barri = Barri;
	}

	public String getNomDistricte() {
            return this.NomDistricte;
	}

	/**
	 * 
	 * @param NomDistricte
	 */
	public void setNomDistricte(String NomDistricte) {
            this.NomDistricte = NomDistricte;
	}

	public String getNomBarri() {
            return this.NomBarri;
	}

	/**
	 * 
	 * @param NomBarri
	 */
	public void setNomBarri(String NomBarri) {
            this.NomBarri = NomBarri;
	}

	public String getAdreca() {
            return this.Adreca;
	}

	/**
	 * 
	 * @param Adreca
	 */
	public void setAdreca(String Adreca) {
            this.Adreca = Adreca;
	}

	public String getTelefon() {
            return this.Telefon;
	}

	/**
	 * 
	 * @param Telefon
	 */
	public void setTelefon(String Telefon) {
            this.Telefon = Telefon;
	}

}