package exceptions.ex53;

public class Main {
    public static void main(String[] args) throws BankAccountException, ClientAccountException {
        Client client1 = new Client("Jonathan","Carralero","48215170V");
        Client client2 = new Client("Juan","Perez","12456789C");
       // Client client3 = new Client("Nombre","Falso","DniIncorrecto1");
        CompteEstalvi compte1 = new CompteEstalvi("CompteJonathan");
        CompteEstalvi compte2 = new CompteEstalvi("CompteJonathann2");

       // compte1.addUser(client1);
      // compte1.addUser(client2);
       // compte1.ingressar((200));
       // compte1.treure(250);
       // client1.transferencia(compte1,compte2,100);
       // client1.transferencia(compte1,compte2,250);
        //compte1.removeUser("44444444V");
    }
}
