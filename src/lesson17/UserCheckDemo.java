package lesson17;

public class UserCheckDemo {
    public static void main(String[] args) {

        System.out.println(verify("login", "password1", "password1"));
        System.out.println(verify("loginloginloginloginlogin", "password1", "password1"));
        System.out.println(verify("login", "password1paspasasp", "password1"));
    }

    public static boolean verify(String login, String password, String confPassword){

        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login length > 20");
            }
            if(password.length()>20 || !password.equals(confPassword)){
                throw new WrongPasswordException("Wrong password");
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
        }
    }

