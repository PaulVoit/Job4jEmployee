package ru.job4j.store;

import java.util.Date;

public class Employee {

    private String name;
    private String surname;
    private Position position;
    private Date birthday;
    private String photoURL;


    public Employee(String name, String surname, Position position, Date birthday, String photoURL) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.birthday = birthday;
        this.photoURL = photoURL;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}
