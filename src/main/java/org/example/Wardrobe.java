package org.example;

public class Wardrobe {

    private Boolean leftDoor = false;
    private Boolean rightDoor = false;
    private Boolean box = false;
    private Boolean boxLock = false;

    public void openLeftDoor(Person p){
        if (leftDoor == true) {
            System.out.println("Левая дверь итак открыта");
        }
        else {
            leftDoor = true;
            System.out.println(p.getName() + " открыл левую дверь");
        }
    }
    public void closeLeftDoor(Person p){
        if (leftDoor == false) {
            System.out.println("Левая дверь итак закрыта");
        }
        else {
            leftDoor = false;
            System.out.println(p.getName() + " закрыл левую дверь");
        }
    }
    public void openRightDoor(Person p){
        if (rightDoor == true) {
            System.out.println("Правая дверь итак открыта");
        }
        else {
            rightDoor = true;
            System.out.println(p.getName() + " открыл правую дверь");
        }
    }
    public void closeRightDoor(Person p){
        if (rightDoor == false) {
            System.out.println("Правая дверь итак закрыта");
        }
        else {
            rightDoor = false;
            System.out.println(p.getName() + " закрыл правую дверь");
        }
    }
    public void openBox(Person p) {
        if (box == true){
            System.out.println("Ящик итак открыт");
        }
        else {
            if (boxLock == true){
                box = true;
                System.out.println(p.getName() + " открыл ящик");
            }
            else {
                System.out.println("Что бы открыть ящик, сначала нужно открыть замок");
            }
        }
    }
    public void closeBox(Person p) {
        if (box == false){
            System.out.println("Ящик итак закрыт");
        }
        else {
            box = false;
            System.out.println(p.getName() + " закрыл ящик");
        }
    }
    public void openBoxLock(Person p) {
        if (boxLock == true) {
            System.out.println("Замок итак открыт");
        }
        else {
            if (p.getAvailabilityKey() == true){
                boxLock = true;
                System.out.println(p.getName() + " открыл замок на ящике");
            }
            else {
                System.out.println("Что бы открыть замок нужен ключ");
            }
        }
    }
    public void closeBoxLock(Person p) {
        if (boxLock == false) {
            System.out.println("Замок итак закрыт");
        }
        else {
            if (p.getAvailabilityKey() == true){
                if (box == true){
                    System.out.println("Что бы закрыть замок, нужно сначала закрыть ящик");
                }
                else {
                    boxLock = false;
                    System.out.println(p.getName() + " закрыл замок на ящике");
                }

            }
            else {
                System.out.println("Что бы закрыть замок нужен ключ");
            }
        }
    }
}
