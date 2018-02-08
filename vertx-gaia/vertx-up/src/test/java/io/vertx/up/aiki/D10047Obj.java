package io.vertx.up.aiki;

import java.io.Serializable;

public class D10047Obj implements Serializable {

    private String name;
    private String email;
    private Integer age;
    private boolean male;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public boolean isMale() {
        return this.male;
    }

    public void setMale(final boolean male) {
        this.male = male;
    }
}