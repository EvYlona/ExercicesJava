public class AdresseMemoire {
    private static AdresseMemoire instance;

    private AdresseMemoire() {}

    public static synchronized AdresseMemoire getInstance() {
        if (instance == null) {
            instance = new AdresseMemoire();
        }
        return instance;
    }

    public void afficherAdresseMemoire() {
        System.out.println("Voici l'adresse mémoire: " + System.identityHashCode(this));
    }

    public static void main(String[] args) {
        AdresseMemoire adresseMemoire = AdresseMemoire.getInstance();
        adresseMemoire.afficherAdresseMemoire();
    }
}
