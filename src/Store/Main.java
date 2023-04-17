package Store;

import Store.DAO.ClientDAO;
import Store.DAO.ClientDAOImpl;
import Store.Entity.Article;
import Store.Entity.Panier;
import Store.Entity.Client;

public class Main {
    public static void main (String [] args){

        //Création d'un nouveau client
        ClientDAO clientDAO = new ClientDAOImpl();
        Client client1 = new Client("John", "3 rue du Peuple");
        clientDAO.addClient(client1);


        // Création d'un panier et d'articles
        Panier panier = Panier.getInstance();
        Article livre = new Article("Livre", 10);
        Article stylo = new Article("stylo", 2);
        Article feuilles = new Article("feuilles", 5);
        Article lessive = new Article("lessive", 4);
        panier.setClient(client1);

        //Ajout des articles
        panier.addArticle(livre);
        panier.addArticle(stylo);
        panier.addArticle(feuilles);
        panier.addArticle(lessive);

        //Contenu du panier
        System.out.println("Panier " + panier.getClient().getNom() + " : ");
        for(Article article : panier.getArticles()) {
            System.out.println(article.getNom() + " - " + article.getPrix() + "€");
        }

        panier.deleteArticle(livre);

        System.out.println("\nPanier mis à jour : ");
        for(Article article : panier.getArticles()) {
            System.out.println(article.getNom() + " - " + article.getPrix() + "€");
        }

    }
}
