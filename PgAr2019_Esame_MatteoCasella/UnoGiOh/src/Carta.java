

public class Carta {
	
	private String valore;
	private String colore;
	
	private String[] val={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String[] col={"blu","rosso","giallo","verde"};
	
		
	public Carta(String val,String col) {
			
		  this.valore=val;
		  this.colore=col;
		       
		}


	public String getValore() {
		return valore;
	}


	public void setValore(String valore) {
		this.valore = valore;
	}


	public String getColore() {
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}


	public String[] getVal() {
		return val;
	}


	public void setVal(String[] val) {
		this.val = val;
	}


	public String[] getCol() {
		return col;
	}


	public void setCol(String[] col) {
		this.col = col;
	}

	
	
	
	
}

