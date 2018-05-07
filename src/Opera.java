public class Opera {
    private String nome;
    private int pagina;
    private String autore;
    private String ISBN;
    private String dataPubblicazione;
    
    public Opera(String n, int p, String a, String ISBN, String date) {
    	setNome(n);
    	setPagina(p);
    	setAutore(a);
        this.setISBN(ISBN);
        setDataPubblicazione(date);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getDataPubblicazione() {
		return dataPubblicazione;
	}

	public void setDataPubblicazione(String dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}
    
}
