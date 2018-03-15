public class Tiger {
    String name;
    String favoriteFood;

    public Tiger(String name){
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food == favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep(this.name);
        }
    }

    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }
}
