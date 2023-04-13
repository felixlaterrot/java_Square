import entity.*;

public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque("Caise populaire");

        Client client1 = new Client(1, "Bernard", "Arnaud");
        Client client2 = new Client(2, "helme", "Nerve");
        Client client3 = new Client(3, "Helmout", "Hard");
        Client client4 = new Client(4, "Jean", "Paul");
        Client client5 = new Client(5, "Cris", "Fort");

        CompteBancaire compte1 = new CompteBancaire(banque, client1, 123, 200);
        CompteBancaire compte2 = new CompteBancaire(banque, client2, 125, 25);
        CompteBancaire compte3 = new CompteBancaire(banque, client3, 859, 1000);
        CompteBancaire compte4 = new CompteBancaire(banque, client4, 747, 231);
        CompteBancaire compte5 = new CompteBancaire(banque, client4, 173, 2000);


         banque.ajoutClient(compte1);
         banque.ajoutClient(compte2);
         banque.ajoutClient(compte3);
         banque.ajoutClient(compte4);
         banque.ajoutClient(compte5);

        System.out.println(banque.getNbCompte(client4.getIdClient()));
        System.out.println(banque.getNbCompte(client5.getIdClient()));

        System.out.println(compte2.getFondDisponible());
        CompteBancaire compte = banque.getCompteBancaireByCompte(compte2.getNumCompteBancaire());
        compte.retirerArgent(15);
        System.out.println(compte.getFondDisponible());
    }
}