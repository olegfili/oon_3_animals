package animals;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "не известно";
        }
    }
    public void method () {
        System.out.println("Охотиться");
    }
    public String toString () {
        return "Имя: " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment();
    }

}
