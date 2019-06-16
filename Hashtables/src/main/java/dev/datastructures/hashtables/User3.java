package dev.datastructures.hashtables;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

//Apache Commons Lang
//Alternatively, you can use the Apache Commons Lang EqualsBuilder and HashCodeBuilder function.
public class User3 {
    private String name;
    private int age;
    private String passport;

    //getters and setters, constructor

    public User3(String name, int age, String passport) {
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
        if (!(o instanceof User3)) {
            return false;
        }

        User3 user = (User3) o;

        return new EqualsBuilder()
                .append(age, user.age)
                .append(name, user.name)
                .append(passport, user.passport)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(age)
                .append(passport)
                .toHashCode();
    }
}
