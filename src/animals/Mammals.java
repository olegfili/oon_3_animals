package animals;

public class Mammals extends Animals{
    private String livingEnvironment;
    private int speedOfMovement;

    public Mammals(String name, int age, String livingEnvironment, int speedOfMovement) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setSpeedOfMovement(speedOfMovement);
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "не известно";
        }
    }
    public int getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(int speedOfMovement) {
        if (speedOfMovement <= 0 ) {
            this.speedOfMovement = 1;
        } else {
            this.speedOfMovement = speedOfMovement;
        }
    }
    public void go () {
        System.out.println("Гуляет");
    }
    public String toString () {
        return "Имя: " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() + ", скорость перемещения: " + getSpeedOfMovement() + " км/ч ";
    }
}
