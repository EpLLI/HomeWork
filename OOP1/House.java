/**class for the transmission of information
 * 
 * @author 
 *
 */
public class House {
	private int nomKv;//apartment number
	private int se;//area
	private int nomEt;//number of floors
	private int kolKom;//number of rooms
	private int kom;
	public House(int nomKv, int se, int nomEt,int kolKom) {
		setNomKv(nomKv);
		setSe(se);
		setNomEt(nomEt);
		setKolKom(kolKom);}
	
	
	
	public void setNomKv(int nomKv) {
		this.nomKv = nomKv;
	}
	

	public int getNomKv() {
		return nomKv;
	}

	public void setSe(int se) {
		this.se = se;
	}

	public int getSe() {
		return se;
	}

	public void setNomEt(int nomEt) {
		this.nomEt = nomEt;
	}

	public int getNomEt() {
		return nomEt;
	}

	public void setKolKom(int kolKom) {
		this.kolKom = kolKom;
	}

	public int getKolKom() {
		return kolKom;
	}
	public void setKom(int kom) {
		this.kolKom = kom;
	}

	public int getKom() {
		return kom;
	}
}
