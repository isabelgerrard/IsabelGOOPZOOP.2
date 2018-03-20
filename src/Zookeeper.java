import java.util.*;

public class Zookeeper {
    String name;

    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food){
        System.out.println(name + " is feeding " + food + " to " + animals.size() + " animals of total " + Animal.population + " animals");
        for(int i = 0; i < animals.size(); i ++){
            animals.get(i).eat(food);
        }
    }
}




