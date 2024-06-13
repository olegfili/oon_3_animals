package animals;

public class Predators extends Mammals {
    private String typeOfFood;
    public Predators(String name, int age, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        setTypeOfFood(typeOfFood);
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty()){
            this.typeOfFood = "не известно";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public void eat() {
        System.out.println("Охотиться");
    }

    public String toString () {
        return "Имя: " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() + ", скорость перемещения: " + getSpeedOfMovement() + " км/ч, тип пищи: " + getTypeOfFood();
    }
}
