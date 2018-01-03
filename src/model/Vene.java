package model;

public class Vene {
	String nimi, merkkimalli, pituus, leveys, hinta, tunnus="0";
	public Vene() {
		super();
	}
	public Vene (String tunnus, String nimi, String merkkimalli, String pituus, String leveys, String hinta) {
		super();
		this.tunnus=tunnus;
		this.nimi=nimi;
		this.merkkimalli=merkkimalli;
		this.pituus=pituus;
		this.leveys=leveys;
		this.hinta=hinta;
	}
	public Vene (String nimi, String merkkimalli, String pituus, String leveys, String hinta) {
		super();
		this.nimi=nimi;
		this.merkkimalli=merkkimalli;
		this.pituus=pituus;
		this.leveys=leveys;
		this.hinta=hinta;
	}
	
	public void setTunnus(String tunnus){
		this.tunnus=tunnus;
	}
	
	public String getTunnus(){
		return tunnus;
	}
	
	public void setNimi(String nimi){
		this.nimi=nimi;
	}
	
	public String getNimi() {
		return nimi;
	}
	public void setMerkkimalli(String merkkimalli) {
		this.merkkimalli=merkkimalli;
	}
	public String getMerkkimalli() {
		return merkkimalli;
	}
	public void setPituus(String pituus) {
		this.pituus=pituus;
	}
	public String getPituus() {
		return pituus;
	}
	public void setLeveys(String leveys) {
		this.leveys=leveys;
	}
	public String getLeveys() {
		return leveys;
	}
	public void setHinta(String hinta) {
		this.hinta = hinta;
	}
	public String getHinta() {
		return hinta;
	}
	@Override
	public String toString() {
		return "Vene [tunnus=" + tunnus + ", nimi=" + nimi
				+ ", malli=" + merkkimalli + ", pituus=" 
				+ pituus + ", leveys=" + leveys + ", hinta=" 
				+ hinta + "]";
	}	
}
