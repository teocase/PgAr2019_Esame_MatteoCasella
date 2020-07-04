

public class Carta {

	private String valore;
	private String colore;

	private String[] val={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String[] col={"blu","rosso","giallo","verde"};

	int n = (col.length * val.length);
    String[] mazzo = new String[n];

	public Carta() {
		  
	    for (int i = 0; i < val.length; i++) {
	        for (int j = 0; j < col.length; j++) {
	            mazzo[col.length*i + j] = val[i] + "  " + col[j];
	        }
	    }

		}
	
	 public void raddoppiaMazzo() {
		 
	 mazzo=java.util.Arrays.copyOf(mazzo, mazzo.length * 2);
		
		 
		 for(int i=40;i<mazzo.length;i++) {
			 mazzo[i]=mazzo[i-40];
		 }
	 }
	 
	
	
	
	public void shuffle() {
		  for (int i = 0; i < mazzo.length; i++) {
	            int r = i + (int) (Math.random() * (n-i));
	            String temp = mazzo[r];
	            mazzo[r] = mazzo[i];
	            mazzo[i] = temp;
	        }
	}
	
	public void stampaMazzo() {
	
    for (int i = 0; i < mazzo.length; i++) {
        System.out.println(mazzo[i]);
    }
	
	
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

	public String[] getMazzo() {
		return mazzo;
	}

	public void setMazzo(String[] mazzo) {
		this.mazzo = mazzo;
	}
	
	
	
	
	
	

}

