package model;

public class Etudiant extends Personne implements Affichage, Consultation {
	private String niveau;

	public Etudiant(int num, String nom, String prenom, Adresse[] adresses, String niveau) {
		super(num, nom, prenom, adresses);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [niveau=" + niveau + ", " + super.toString() + "]";
	}

	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		System.out.println(this.getNom() + this.getPrenom() + this.getNiveau());
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherNomMajuscule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherPrenomMajuscule() {
		// TODO Auto-generated method stub
		
	}

}
