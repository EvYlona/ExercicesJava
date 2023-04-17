package Store.DAO;

import Store.Entity.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDAOImpl implements ClientDAO{

    //Ajouter
    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    //Afficher
    @Override
    public Client showClient(String nom) {
        for (Client client : clients) {
            if (client.getNom().equals(nom)) {
                return client;
            }
        }
        return null;
    }

    //Mettre à jour
    @Override
    public void updateClient(Client client) {
        for (Client c : clients) {
            if (c.equals(client)) {
                c.setNom(client.getNom());
                c.setAdresse(client.getAdresse());
                break;
            }
        }
    }

    //Supprimer
    @Override
    public void deleteClient(Client client) {
        clients.remove(client);
    }

    //Création de la liste
    private List<Client> clients = new ArrayList<>();

    //Afficher
    @Override
    public List<Client> showAll() {
        return null;
    }
}
