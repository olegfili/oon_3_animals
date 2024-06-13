package animals;

import java.time.LocalDate;

public class Animals {
    private String name;
    private int year;
    public Animals(String name, int age) {
       setName(name);
        if (age >= 0) {
            this.year = LocalDate.now().getYear() - age;
        } else {
            this.year = LocalDate.now().getYear() - Math.abs(age);
        }
    }
    public int getAge() {
        return LocalDate.now().getYear() - year;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "имя не задано";
        }
    }
    public void eat () {
        System.out.println("Кушает");
    }
    public void sleep () {
        System.out.println("Спит");
    }
    public void move () {
        System.out.println("Перемещаеться");
    }

    public String toString () {
        return "Имя: " + getName() + ", возраст: " + getAge();
    }

}
