import java.util.*;

public class Runner {
    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.eat("something else");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tigger);
        tigger.populationCount();
        animals.add(pooh);
        pooh.populationCount();
        animals.add(rarity);
        rarity.populationCount();
        animals.add(gemma);
        gemma.populationCount();
        animals.add(stinger);
        stinger.populationCount();

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "bagels");
    }
}
