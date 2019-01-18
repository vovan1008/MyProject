package internetStore;

public class Userlist {

    private User users[];

    public Userlist(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
