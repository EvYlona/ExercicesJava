package Store.DAO;

import Store.Entity.Panier;

import java.util.List;

//On définit les méthodes basiques du crud ici
public interface PanierDAO {
    public void addPanier(Panier Panier);
    public void updatePanier(Panier Panier);
    public void deletePanier(Panier Panier);
    public Panier showPanier(String nom);
    public List<Panier> showAll();
}
