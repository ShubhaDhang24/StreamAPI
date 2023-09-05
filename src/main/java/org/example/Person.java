package org.example;

import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    Gender gender;
    Boolean status;
    LocalDate birthDate;

    public Person(String firstName, String lastName, Gender gender, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public Boolean getStatus() {
        return status;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                '}';
    }
}
