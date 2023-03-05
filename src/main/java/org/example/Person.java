package org.example;

public class Person {

    private String name;
    private Boolean key;

    public Person(String name) {
        this.name = name;
        key = false;
    }
    public Person(String name, Boolean key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public Boolean getAvailabilityKey() {
        return key;
    }
    public void setAvailabilityKey(Boolean availabilityKey) {
        this.key = availabilityKey;
    }
    public void passKey (Person p) {
        if (this.key == true) {
            this.key = false;
            p.setAvailabilityKey(true);
            System.out.println(this.name + " передал(а) ключ " + p.getName());
        }
        else {
            System.out.println("нет ключа, который можно передать");
        }
    }
}
