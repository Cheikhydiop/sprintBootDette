package web;

public class CreditMetier {
	
	private double montant;
	private double taux;
	private int duree;
	private double mensualite;
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getMensualite() {
		return mensualite;
	}
	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}
	
	public CreditMetier() {
		super();
		
	}
	public CreditMetier(double montant,double taux,int duree,double mensuaite) {
		this.montant=montant;
		this.taux=taux;
		this.duree=duree;
		this.mensualite=mensualite;
		
	}

}
