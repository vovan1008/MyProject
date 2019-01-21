package lesson13.auth;

public class UserStatic {
    private static String login, password;


    public static class Query {
        public void printToLog() {
            System.out.printf("User with login: %s and password: %s" +
                            " send a request.%n"
                    , login, password);
        }
    }


    public static void initialise(String login, String password) {
        UserStatic.login = login;
        UserStatic.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        UserStatic.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        UserStatic.password = password;
    }

    public static void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public String toString() {return "UserStatic{}";
    }

    public static void main(String[] args) {
        initialise("log123","pass123");
        createQuery();
        initialise("vasya111","drowssap");
        createQuery();

        UserStatic.Query query1 = new UserStatic.Query();
        query1.printToLog();

        Query query2 = new Query();
        query2.printToLog();

    }
}
