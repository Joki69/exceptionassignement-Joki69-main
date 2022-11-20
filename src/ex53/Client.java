package exceptions.ex53;

import java.util.Locale;

public class Client {
    private String Nom;
    private String Cognoms;
    private String DNI;

    public Client(String nom, String cognoms, String DNI) throws BankAccountException {
        Nom = nom;
        Cognoms = cognoms;
        if(validarDNI(DNI.toLowerCase(Locale.ROOT)))
        this.DNI=DNI;
    }


    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCognoms() {
        return Cognoms;
    }

    public void setCognoms(String cognoms) {
        Cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) throws BankAccountException {
        if(validarDNI(DNI.toLowerCase(Locale.ROOT)))
            this.DNI=DNI;
    }

    public void transferencia(CompteEstalvi propietario, CompteEstalvi destinatario, int cantidad$) throws BankAccountException, ClientAccountException {
        if(propietario == null || destinatario == null){
            throw new BankAccountException(ExceptionMessage.ACCOUNT_NOT_FOUND);
        }
        else{
            if(cantidad$<0){
                throw new BankAccountException(ExceptionMessage.TRANSFER_ERROR);
            }
            else if(propietario.getSaldo() < cantidad$){
                throw new BankAccountException(ExceptionMessage.ACCOUNT_OVERDRAFT);
            }
            else{
                propietario.treure(cantidad$);
                destinatario.ingressar(cantidad$);
            }
        }

     }
    public boolean validarDNI(String dni) throws BankAccountException {

        if (dni.matches("\\d{8}[a-z]")){
            return true;
        }
        else{
            throw new BankAccountException(ExceptionMessage.WRONG_DNI);
        }

    }


    }
