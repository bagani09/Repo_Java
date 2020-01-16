package String_HW;

public class Mammal {

    int hands = 2;
    int legs = 2;
    String hair = "black";
    int wings  = 0;

    public static int setToWalk (int value) {
        int walk = 0;
        if (value > 0){
        System.out.println("is walking");
    }
        else {
        System.out.println("not able to walk");

        } return value;



//    public static void sleep () {
//        System.out.println(" Able to sleep");

    }


//    public static void drink () {
//        System.out.println("Able to drink");




//    }

//    public static void eat () {
//        System.out.println("able to eat");


//    }

//    public static void ShowAllAtributes () {

//    }

    public static void main(String[] args) {

        Mammal human = new Mammal();
        Mammal octopus = new Mammal();
        Mammal dog = new Mammal();

        System.out.println(human.hair);
        octopus.hands = 8;
        octopus.legs = 0;
        octopus.hair = "white";
        dog.hair = "brown";
        System.out.println(dog.hands);
        System.out.println(human.hands);
        human.setToWalk(5);

    }
}



