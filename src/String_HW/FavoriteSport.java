package String_HW;

import java.util.Scanner;
//        # Take user input for Fans name
//        and based on name, print his/her favorite sports name
//        * Football
//        Deepak
//        * Soccer
//        Ani, Rana
//        * Cricket
//        Ferdous, Delwar, Ahsan
//        * Basketball
//        Palina, Mark Mareeha, Rovshan
//        * Not a Fan of Sports
//        Sumon, Himani

public class FavoriteSport {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a name to find this persons favorite sport");
        String names = scan.nextLine();
        switch (names){
            case "Deepak":
                System.out.println("Fan of Football");
                break;
            case "Ani":
            case "Rana":
                System.out.println("Fan of Soccer");
                break;
            case "Ferdous":
            case "Delwar":
            case "Ahsan":
                System.out.println("Fan of Cricket ");
                break;
            case "Palina":
            case "Mark":
            case "Mareeha":
            case "Rovshan":
                System.out.println("Fan of basketball");
                break;
            default:
            case "Sumon":
            case "Himani":
                System.out.println("Not a fan of sport");


        }
    }


}
