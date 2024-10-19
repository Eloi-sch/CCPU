package Main;

public class CCPU {
	private String coulee;
	private int diametre;
	private String matiere;
	private Fournisseur fournisseur;
	private String numeroRUFF;
	private boolean ccpu = false;

	@Override
	public String toString() {
		return "CCPU [coulee=" + coulee + ", diametre=" + diametre + ", matiere=" + matiere
				+ ", fournisseur=" + fournisseur + ", numeroRUFF=" + numeroRUFF + ", ccpu=" + ccpu + "]";
	}

	public String getCoulee() {
		return coulee;
	}

	public void setCoulee(String coulee) {
		this.coulee = coulee;
	}

	public int getDiametre() {
		return diametre;
	}

	public void setDiametre(int diametre) {
		this.diametre = diametre;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getNumeroRUFF() {
		return numeroRUFF;
	}

	public void setNumeroRUFF(String numeroRUFF) {
		this.numeroRUFF = numeroRUFF;
	}

	public boolean isCcpu() {
		return ccpu;
	}

	public void setCcpu(boolean ccpu) {
		this.ccpu = ccpu;
	}

	public CCPU(String coulee, int diametre, String matiere) {
		super();
		this.coulee = coulee;
		this.diametre = diametre;
		this.matiere = matiere;
	}

}
