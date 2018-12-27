package model;

public class User {
    private int id;
    private String surname;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
