package Store.DAO;

import Store.Entity.Client;

import java.util.List;

public interface ClientDAO {
    public void addClient(Client client);
    public void updateClient(Client client);
    public void deleteClient(Client client);
    public Client showClient(String nom);
    public List<Client> showAll();
}
