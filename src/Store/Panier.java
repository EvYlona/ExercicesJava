package Store;

import java.util.ArrayList;
import java.util.List;

//Design Pattern Singleton
public class Panier {
    //Attributs
    private static Panier instance = null;
    private List<Article> articles = new ArrayList<Article>();
    private Client client;

    // Constructeur privé
    private Panier() {}

    // Méthode pour récupérer l'instance
    public static Panier getInstance() {
        if (instance == null) {
            instance = new Panier();
        }
        return instance;
    }

    public static void setInstance(Panier instance) {
        Panier.instance = instance;
    }

    //Ajouter un article
    public void addArticle(Article article) {
        articles.add(article);
    }

    //Supprimer un article
    public void deleteArticle(Article article) {
        articles.remove(article);
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
