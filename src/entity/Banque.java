package entity;

import java.util.ArrayList;
import java.util.List;

public class Banque {
    public ArrayList<CompteBancaire> comptes = new ArrayList<CompteBancaire>();
    private String nomBanque;

    public Banque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public CompteBancaire findClientById(int idClient){
        for (CompteBancaire compte: comptes) {
            if(compte.getClient().getIdClient() == idClient){
                return compte;
            }
        }
        return null;
    }

    public CompteBancaire getCompteBancaireByCompte(int numCompteBancaire){
        for (CompteBancaire compte: comptes){
            if(compte.getNumCompteBancaire() == numCompteBancaire){
                return compte;
            }
        }
        return null;
    }

    public String getNbCompte(int idClient){
        int nbCompte = 0;
        for (CompteBancaire compte: comptes){
            if(compte.getClient().getIdClient() == idClient){
                nbCompte += 1;
            }
        }
        return "Vous avez :" + nbCompte + " compte(s) chez nous";
    }

    public void ajoutClient(CompteBancaire compte){
        comptes.add(compte);
    }
}
