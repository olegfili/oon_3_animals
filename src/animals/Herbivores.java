package animals;

public class Herbivores extends Mammals{
    private String typeOfFood;
    public Herbivores(String name, int age, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedOfMovement);
        setTypeOfFood(typeOfFood);
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && typeOfFood.isEmpty()){
            this.typeOfFood = "не известно";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public void go() {
        System.out.println("Пастись");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString () {
        return "Имя: " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() + ", скорость перемещения: " + getSpeedOfMovement() + " км/ч, тип пищи: " + getTypeOfFood();
    }


}
