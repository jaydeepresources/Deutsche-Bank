package exceptions;

public class TestExceptions {

    public static void main(String[] args) {

        String password="abcd675utyig@!$#2";

        try {
            if(password.length()<8)
                throw new PasswordException();
        } catch (PasswordException e) {
            e.printException();
        }

    }
}