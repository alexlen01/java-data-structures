package dev.datastructures.hashtables;

import java.util.Objects;

//JDK 7
//For JDK 7 and above, you can use the new Objects class to generate the equals and hash code values.
public class User2 {
    private String name;
    private int age;
    private String passport;

    //getters and setters, constructor

    public User2(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }
        User2 user = (User2) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }

}