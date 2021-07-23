package javacore.exception.custom;

public class CustomExecptionTest {
    public static void main(String[] args){
        try {
            Login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    public static void Login()throws LoginInvalidoException{
        String  usuarioBD = "adm";
        String  senhaBD = "123";
        String loginDG = "adm";
        String senhaDG = "143";

        if(usuarioBD.equals(loginDG)&&senhaBD.equals(senhaDG)){
            System.out.println("Logado!");
        }
        else{
            throw new LoginInvalidoException();
        }
    }
}
