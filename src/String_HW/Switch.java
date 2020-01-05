package String_HW;

public class Switch {
    public static void main(String[] args) {


//
//        6. Create a supermarket item finder
//        Take input from user and based on the input, you should display user which aisle has the item
//        For example: user enter milk, you program should say aisle 8. If the item is not found,
//        display a message saying "Out of stock "Please create program for below requirement
        //        Milk = Aisle Eight
        //        Eggs = Aisle Eight
        //        French Fries = Aisle seven
        //        Candy = Aisle Three
        //        Frozen Pizza = Aisle seven
        //        Donuts = Aisle Eight
        //        Diapers = Aisle One
        //        Apple = Aisle two
        //        Orange = Aisle two

        String product = "milk";
        switch (product){
            case "diapers":
                System.out.println("Aisle one");
                break;
            case "apples":
            case "oranges":
                System.out.println("aisle two");
                break;
            case "candy":
                System.out.println("aisle three");
                break;
            case "french fries":
            case "frozen pizza":
                System.out.println("aisle seven");
                break;
            case "milk":
            case "eggs":
            case "donuts":
                System.out.println("aisle eight");
                break;
            default:
                System.out.println("out of stock");

        }
    }
}
