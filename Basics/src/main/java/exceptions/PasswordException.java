package exceptions;

public class PasswordException extends Exception{

    public void printException(){
        System.out.println("Error: Password doesn't meet required specifications.");
    }
}
