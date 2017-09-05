package com.aref.model;

public class User {
    private final String name;
    private final int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder{
        private String name;
        private int age;

        public Builder withName (String name) {
            this.name = name;
            return this;
        }

        public Builder withAge (int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(name,age);
        }
    }
}
