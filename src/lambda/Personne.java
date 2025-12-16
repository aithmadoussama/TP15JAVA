package lambda;

public class Personne {

	private String nom;
	private int age;
	private String ville;

	public Personne(String nom, int age, String ville) {
		this.nom = nom;
		this.age = age;
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + ", ville=" + ville + "]";
	}

}

