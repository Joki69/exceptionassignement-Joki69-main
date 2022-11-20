package exceptions.ex53;

public class ClientAccountException extends Exception{
    public ClientAccountException(String wrongDNI){
        super(wrongDNI);

    }
}
