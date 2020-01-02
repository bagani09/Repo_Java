package String_HW;


public class HomeWork {
    public static void main(String[] args) {
//        int age = 31;
//        boolean isChild = age <= 7;
//        boolean isSenior = age >= 65;
//        System.out.println(isChild);
//        System.out.println(isSenior);


//        Homework for 12/30/2019
//
//        double celsius = 30;
//        //        Celsius to Fahrenheit
//        //        T(°F) = T(°C) × 9/5 + 32
//        double fahrenheit = (celsius) * 9/5 + 32;
//        System.out.println("Temperature value after changing from Celsius to Fahrenheit:" + " " + fahrenheit);
//
////        Celsius to Kelvin
////        T(K) = T(°C) + 273.15
//        double kelvin = (celsius) + 273.15;
//        System.out.println("Temperature value after changing from Celsius to Kelvin:" + " " + kelvin);
//
////        Celsius to Rankine
////        T(°R) = (T(°C) + 273.15) × 9/5
//        double rankine = ((celsius) + 273.15) * 9/5;
//        System.out.println("Temperature value after changing from Celsius to Rankine:" + " " + rankine);
//
////        Fahrenheit to Celsius
////        T(°C) = (T(°F) - 32) × 5/9
//        double FtoC = ((fahrenheit) - 32) * 5/9;
//        System.out.println("Temperature value after changing from Fahrenheit to Celsius:" + " " + FtoC);
//
////        Fahrenheit to Kelvin
////        T(K) = (T(°F) + 459.67)× 5/9
//        double FtoK = ((fahrenheit) + 459.67) * 5/9;
//        System.out.println("Temperature value after changing from Fahrenheit to Kelvin:" + " " + FtoK);
//
////        Fahrenheit to Rankine
////        T(°R) = T(°F) + 459.67
//        double FtoR = (fahrenheit) + 459.67;
//        System.out.println("Temperature value after changing from Fahrenheit to Rankine:" + " " + FtoR);
//
////        Kelvin to Fahrenheit
////        T(°F) = T(K) × 9/5 - 459.67
//        double KtoF = (kelvin) * 9/5 - 459.67;
//        System.out.println("Temperature value after changing from Kelvin to Fahrenheit:" + " " + KtoF);
//
////        Kelvin to Celsius
////        T(°C) = T(K) - 273.15
//        double KtoC = (kelvin) - 273.15;
//        System.out.println("Temperature value after changing from Kelvin to Celsius:" + " " + KtoC);
//
////        Kelvin to Rankine
////        T(°R) = T(K) × 9/5
//        double KtoR = (kelvin) * 9/5;
//        System.out.println("Temperature value after changing from Kelvin to Rankine:" + " " + KtoR);
//
////        Rankine to Fahrenheit
////        T(°F) = T(°R) - 459.67
//        double RtoF = (rankine) - 459.67;
//        System.out.println("Temperature value after changing from Rankine to Fahrenheit:" + " " + RtoF);
//
////        Rankine to Celsius
////        T(°C) = (T(°R) - 491.67) × 5/9
//        double RtoC = ((rankine) - 491.67) * 5/9;
//        System.out.println("Temperature value after changing from Rankine to Celsius:" + " " + RtoC);
//
////        Rankine to Kelvin
////        T(K) = T(°R) × 5/9
//        double RtoK = (rankine) * 5/9;
//        System.out.println("Temperature value after changing from Rankine to kelvin:" + " " + RtoK);
//


//      Home work for 01/02/2020

        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;

//        Are both vegan? only offer up vegan dishes.
//        At least one vegan? make sure offer up some vegan option.
//        Else, offer anything on the menu

        if (isGuestOneVegan && isGuestTwoVegan) {
            System.out.println("Offer only vegan dishes");
        } else if (isGuestOneVegan || isGuestTwoVegan) {
            System.out.println("Offer some vegan dishes");
        } else {
            System.out.println("Offer anything on the menu");
        }

//        2. Driver Controller
//
//       * I want to be able to put car on P mode, D mode, N mode, R mode
//       * If i am on P mode and parking type is parallel then i can park between two cars
//       * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
//       * If i am on N mode i can put car in car wash station
//       * If i am on R mode I can only reverse the car and car will activate back camera
//       * If mode is incorrect then print me invalid mode type, please check your car mode

        char ParkingMode = 'P';
        ;
        char DrivingMode = 'D';
        char NeutralMode = 'N';
        char ReverseMode = 'R';
        String Ptype = "Parallel";


        if (ParkingMode == 'P' && Ptype == "Parallel")  {
            System.out.println("I can park between two cars");
        }
        if (DrivingMode == 'D') {
            System.out.println("I can put drive type to Snow type, Sport Type or Regular type");
        }
        if (NeutralMode == 'N') {
            System.out.println("i can put car in car wash station");
        }
        if (ReverseMode == 'R') {
            System.out.println("I can only reverse the car and car will activate back camera");
        } else {
            System.out.println("invalid mode type, please check your car mode");
        }


//        3. Store a number in an int variable.
//        if the number is divisible by 15
//        Display "Divisible by 15"
//        Otherwise
//        Display the remainder you get when divide number by 15


        int x = 27;
        int y = 15;
        int remainder = x % y;
        if (remainder == 0) {
            System.out.println("Divisible by 15");
        } else
            System.out.println("remainder is" + " " + remainder);


//
//        4. Store your name in a variable.
//        if your name length comes out greater than 8
//        Display your name after replacing all 'a' to 'A' from your name.
//        Otherwise
//        Display your name in uppercase.


        String name = "ani";
        int count = name.lastIndexOf("");
        String replace = name.replace('a', 'A');
        String uppercase = name.toUpperCase();

        if (count > 8) {
            System.out.println(replace);

        } else {
            System.out.println(uppercase);



//            5. Create an array of 5 int values. Calculate the average of those 5 values. [pls don't use for-loop]
//            If you average of stored numbers greater than 25
//            Display Array from index 0 to last
//            Otherwise
//            Display Array from index last to 0


            int [] values = new int[5];
            values [0] = 10;
            values [1] = 20;
            values [2] = 30;
            values [3] = 40;
            values [4] = 50;
            int sum = values [0] + values[1] + values[2] + values[3] + values[4];
            int average = sum/5;

            if (average > 25) {
                System.out.println("10, 20, 30, 40, 50");
            }else {
                System.out.println("50, 40, 30, 20, 10");


//           6. Create a supermarket item finder
//                Take input from user and based on the input, you should display user which aisle has the item
//                For example: user enter milk, you program should say aisle 8. If the item is not found,
//                display a message saying "Out of stock "Please create program for below requirement
//                Milk = Aisle Eight
//                Eggs = Aisle Eight
//                French Fries = Aisle seven
//                Candy = Aisle Three
//                Frozen Pizza = Aisle seven
//                Donuts = Aisle Eight
//                Diapers = Aisle One
//                Apple = Aisle two
//                Orange = Aisle two







            }
        }


    }


}
