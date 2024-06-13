package animals;

public class Flightless extends Birds{
    private String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }
    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isEmpty()){
            this.typeOfMovement = "не известно";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    public void method () {
        System.out.println("Гулять");
    }
    public String toString () {
        return "Имя: " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() + ", тип передвижения: " + getTypeOfMovement();
    }
}
