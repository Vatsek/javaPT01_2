package org.example;

public class Main {
    public static void main(String[] args) {
        Person pasha = new Person("Паша");
        Person anna = new Person("Анна", true);
        Wardrobe wardrobe = new Wardrobe();

        wardrobe.openBox(pasha);
        wardrobe.openBoxLock(pasha);
        anna.passKey(pasha);
        wardrobe.openBox(pasha);
        wardrobe.openBoxLock(pasha);
        wardrobe.openBox(pasha);
        wardrobe.openBox(pasha);
        wardrobe.closeBoxLock(pasha);
        wardrobe.closeBox(pasha);
        wardrobe.closeBoxLock(pasha);
        wardrobe.openLeftDoor(anna);
        wardrobe.openLeftDoor(anna);
        wardrobe.closeLeftDoor(anna);
        wardrobe.openBoxLock(anna);





    }
}