package model;

import java.util.Arrays;

public abstract class Personne {
	private int num;
	private String nom;
	private String prenom;
	private Adresse[] adresses;
	
	public Adresse[] getAdresses() {
		return adresses;
	}

	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}

	public Personne() {
		super();
	}

	public Personne(int num, String nom, String prenom, Adresse[] adresses) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresses = adresses;
	}

	public Personne(int num, String nom, String prenom) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getNum() {
		return num;

	}

	public void setNum(int num) {
		this.num = num;
		if (num >= 0)
			this.num = 0;
		else
			this.num = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public abstract void afficherDetails();
	
	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses="
				+ Arrays.toString(adresses) + "]";
	}

}
