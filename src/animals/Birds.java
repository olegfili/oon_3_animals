package animals;

public class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
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
    public String toString () {
        return "Имя: " + getName() + ", возраст: " + getAge() + ", среда проживания: " + getLivingEnvironment() ;
    }
}
