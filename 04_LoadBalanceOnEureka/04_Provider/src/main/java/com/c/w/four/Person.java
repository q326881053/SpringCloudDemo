package com.c.w.four;

public class Person {

    private Integer personId;
    private String personName;
    private Integer personAge;
    private String message;

    public Person(Integer personId, String personName, Integer personAge) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
    }

    public Integer getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
