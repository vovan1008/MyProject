package internetStore;

import java.util.Objects;

public class User {
    private String login, password;
    Basket userBasket = new Basket();

    public User(String login, String password, Basket userBasket) {
        this.login = login;
        this.password = password;
        this.userBasket = userBasket;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(userBasket, user.userBasket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, userBasket);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userBasket=" + userBasket +
                '}';
    }

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        Basket basket4 = new Basket();
        User user1 = new User("IvanPetrov", "petrov123",basket1);
        User user2 = new User("AndreyKazakov", "kharkov2018",basket2);
        User user3 = new User("KonstantinAcademeg", "landrover2016",basket3);
        User user4 = new User("AlanEnileev", "bmwonelove",basket4);

    }

}
