package exceptions.ex53;

import java.util.ArrayList;
import java.util.List;

public class CompteEstalvi {
    private String numCompte;
    private double saldo;
    //Llista d'usuaris co-propietaris del compte
    private List<Client> llista_usuaris;

    public CompteEstalvi(String numCompte) {
        this.numCompte = numCompte;
        llista_usuaris = new ArrayList<>();
        saldo = 0;
    }

    /**
        Afegeix un usuari d'aquest compte
        @param client
        @return quantitat d'usuaris que té el compte

     **/
    public int addUser(Client client) {
        llista_usuaris.add(client);
        return llista_usuaris.size();
    }

    /**
     Elimina un usuari d'aquest compte
     @param dni
     @return quantitat d'usuaris que té el compte
     @throws BankAccountException
     **/
    public int removeUser(String dni) throws BankAccountException {
        if(llista_usuaris.size() > 1){
            if(llista_usuaris.removeIf(dniCoincide -> dni.equals(dniCoincide.getDNI()))){
               return llista_usuaris.size();
           }
           else{
                throw new BankAccountException(ExceptionMessage.WRONG_DNI);
           }
       }
        else if (llista_usuaris.size() ==1){
            throw new BankAccountException(ExceptionMessage.ACCOUNT_Ultim_USER);
        }
       else {
            throw new BankAccountException(ExceptionMessage.ACCOUNT_ZERO_USER);

       }
    }

    /**
     * Afegeix m diners al saldo
     * @param amount
     */
    public void ingressar(double amount) {
        saldo+=amount;
    }

    /**
     * Treu m diners del compte si n'hi han suficient
     * @param amount
     * @throws BankAccountException
     */
    public void treure(double amount) throws BankAccountException{
        if(saldo - amount >=0){
            saldo -=amount;
        }
        else{
            throw new BankAccountException(ExceptionMessage.ACCOUNT_OVERDRAFT);
        }
    }

    public String getNumCompte() {
        return numCompte;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Client> getLlista_usuaris() {
        return llista_usuaris;
    }
}
