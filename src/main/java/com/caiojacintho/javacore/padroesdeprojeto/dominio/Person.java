package com.caiojacintho.javacore.padroesdeprojeto.dominio;

public class Person {
    private String FirstName;
    private String LastName;
    private String username;
    private String email;

    private Person(String firstName, String lastName, String username, String email) {
        FirstName = firstName;
        LastName = lastName;
        this.username = username;
        this.email = email;
    }

    public static final class PersonBuilder {
        private String FirstName;
        private String LastName;
        private String username;
        private String email;

        public PersonBuilder() {
        }


        public PersonBuilder FirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }

        public PersonBuilder LastName(String LastName) {
            this.LastName = LastName;
            return this;
        }

        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(FirstName, LastName, username, email);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}

