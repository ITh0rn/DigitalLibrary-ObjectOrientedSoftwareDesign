
public class Pagina{
	private int numero;
    private int ID_Opera;
    private int ID_Pagina;
    private String stato;
    private boolean pubb;

    public Pagina(int n, int IDo, int IDp, String s, boolean p) {
    	setNumero(n);
    	setID_Opera(IDo);
    	setID_Pagina(IDp);
    	setStato(s);
    	setPubb(p);
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getID_Opera() {
		return ID_Opera;
	}

	public void setID_Opera(int iD_Opera) {
		ID_Opera = iD_Opera;
	}

	public int getID_Pagina() {
		return ID_Pagina;
	}

	public void setID_Pagina(int iD_Pagina) {
		ID_Pagina = iD_Pagina;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public boolean isPubb() {
		return pubb;
	}

	public void setPubb(boolean pubb) {
		this.pubb = pubb;
	}
    
    
}
