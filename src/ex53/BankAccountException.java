package exceptions.ex53;

public class BankAccountException extends Exception {
    public BankAccountException(String transferError) {
        super(transferError);
    }
}
