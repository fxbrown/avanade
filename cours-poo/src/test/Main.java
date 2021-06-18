package test;

import model.Personne;
import model.Adresse;
import model.Enseignant;
import model.Etudiant;

public class Main {

	public static void main(String[] args) {

		// Personne personne = new Personne();
		// personne.setNom("wick");
		// personne.setPrenom("john");
		// personne.setNum(-100);
		// Personne personne2 = new Personne(200, "dalton", "jack");
		// System.out.println(personne2);

		Adresse adresse = new Adresse();
		adresse.setRue("118 rue Caulaincourt");
		adresse.setCodePostal("75018");
		adresse.setVille("Paris");
		Adresse adresse2 = new Adresse("porte maillot", "75005", "Paris");
		Adresse[] adresses = new Adresse[] { adresse, adresse2 };

		// Personne personne3 = new Personne (300, "dalton", "jack", new Adresse("porte
		// maillot","75005","paris"));
		// System.out.println(personne3);
		// Personne personne4 = new Personne(300, "dalton", "jack", adresses);
		// Pour un tableau avec plusieurs adresses il faut ceci new Adresse[]{adresse}
		// System.out.println(personne4);
		// EXO: Afficher les codes postaux de l'objet de la personne 4 en utilisant la
		// boucle for
		// for (int i = 0; i < adresses.length; i++) {
		// System.out.println(adresses[i].getCodePostal());
		// }
		Etudiant etudiant = new Etudiant(400, "cervera", "sophie", adresses, "master");
		System.out.println(etudiant);
		Enseignant enseignant = new Enseignant(500, "haddad", "karim", adresses, 1700);
		// System.out.println(enseignant);
		// System.out.println(enseignant instanceof Personne);
		// System.out.println(personne instanceof Enseignant);
		// Personne[] personnes = new Personne[] { etudiant, personne, enseignant };
		// for(Personne p: personnes) {
		// /*
		// * EXERCICE D'APLLICATION
		// * afficher le numéro s'il s'agit d'un personne
		// * afficher le salaire s'il s'agit d'un enseignant
		// * afficher le niveau s'il s'agit d'un étudiant
		// */
		// if (p instanceof Enseignant) {
		// System.out.println(((Enseignant) p).getSalaire());
		// } else if (p instanceof Etudiant) {
		// System.out.println(((Etudiant) p).getNiveau());
		// } else {
		// System.out.println(p.getNum());
		// }

		etudiant.afficherDetails();
		enseignant.afficherDetails();

	}
}
