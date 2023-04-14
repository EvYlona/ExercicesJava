package Store;

public class Main {
    public static void main (String [] args){
        // Création d'un panier et d'articles
        Panier panier = Panier.getInstance();
        Article livre = new Article("Livre", 10);
        Article stylo = new Article("stylo", 2);
        Article feuilles = new Article("feuilles", 5);
        Article lessive = new Article("lessive", 4);

        //Ajout des articles
        panier.addArticle(livre);
        panier.addArticle(stylo);
        panier.addArticle(feuilles);
        panier.addArticle(lessive);

        //Contenu du panier
        System.out.println("Panier : ");
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
