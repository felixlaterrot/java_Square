package entity;

public class CompteBancaire {
    private Banque banque;
    private Client client;
    private int numCompteBancaire;
    private int fondDisponible;

    public Client getClient() {
        return client;
    }

    public CompteBancaire(Banque banque, Client client, int numCompteBancaire, int fondDisponible) {
        this.banque = banque;
        this.client = client;
        this.numCompteBancaire = numCompteBancaire;
        this.fondDisponible = fondDisponible;
    }

    public int getNumCompteBancaire() {
        return numCompteBancaire;
    }

    public int getFondDisponible() {
        return fondDisponible;
    }

    public void retirerArgent(int fond){
        if(this.fondDisponible > fond){
            fondDisponible -= fond;
            System.out.println("Argent envoyé");
        } else {
            System.out.println("Fond non disponible");
        }
    }
}
