import animals.*;

public class Main {
    public static void main(String[] args) {
        Amphibians frog = new Amphibians("Лягушка", -1, "Вода");
        System.out.println(frog);
        frog.method();
        Amphibians grass = new Amphibians("Уж пресноводный", 2, "");
        System.out.println(grass);
        grass.method();

        Animals gazelle = new Animals("газель", 3);
        System.out.println(gazelle);
        gazelle.eat();
        gazelle.sleep();
        gazelle.move();
        Mammals giraffe = new Mammals("жираф",5,"саванны Африки", 60 );
        System.out.println(giraffe);
        giraffe.go();

        Herbivores horse = new Herbivores("лошадь",8,"степь",71,null);
        System.out.println(horse);
        horse.go();

        Predators heyna = new Predators("гиена",1,"Африка и Азия", 64, "падаль");
        System.out.println(heyna);
        heyna.eat();
        Predators tiger = new Predators("тигр",3,"кедрово-широколиственные леса", 70,"мясо");
        System.out.println(tiger);
        tiger.eat();
        Predators bear = new Predators("медведь", 5,"лес",67,"мясо");
        System.out.println(bear);
        bear.eat();

        Flightless peacock = new Flightless("павлин",1,"Пакистан","наземный");
        System.out.println(peacock);
        peacock.method();
        Flightless penguin = new Flightless("пенгвин", 3,"открытое море","наземный");
        System.out.println(penguin);
        penguin.method();
        Flightless dodo = new Flightless("додо",5,null,null);
        System.out.println(dodo);
        dodo.method();

        Flying seagull = new Flying("чайка", 1,"вода", null);
        System.out.println(seagull);
        seagull.method();
        Flying albatross = new Flying("альбатросс", 0, null,null);
        System.out.println(albatross);
        albatross.method();
        Flying falcon = new Flying("сокол",0,"горы и леса",null);
        System.out.println(falcon);
        falcon.method();

    }
}