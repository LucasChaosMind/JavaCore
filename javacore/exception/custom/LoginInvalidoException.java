package javacore.exception.custom;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException(){
        super("Usuario Ou Senha Invalidos");
    }
}
