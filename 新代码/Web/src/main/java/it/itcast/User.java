package it.itcast;

public class User {
    private int id;
    private String passwrod;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", passwrod='" + passwrod + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
