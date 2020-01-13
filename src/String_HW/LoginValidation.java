package String_HW;

import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {

//        Simple password validation for login system
//        Instance of scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your user id");
//        Tell user to enter User Id and password
        System.out.println("Please enter your password");
//        takes input from console and and storing the value into actual User Id and Password variable
        String actualPassword = scan.nextLine();
        String actualUserId =scan.nextLine();
//        setting expected user Id and password which is associated with user account details in database
        String expectedPassword = "technosoft";
        String expectedUserId = "tech1205";
//        Creating for loop to give user max tries to enter valid user id and password and log the user to system
//        if correct credentials are entered

        for (int i = 0; i < 5; i++) {
//        Checking if actual user id and password are not equal to expected password
            if (!actualPassword.equals(expectedPassword) && !actualUserId.equals(expectedUserId)) {
//                subtract the count by iteration so user will have less tries( -1 every miss tries )
                int count = 5 - i;
//                console message to user to enter valid user id & password
                System.out.println("You have entered wrong user id or password");
                System.out.println("please enter the valid user id & password");
//                console message to let user know how many more tries he has left with
                System.out.println("you have " + count + " more tries");
//                letting user to update the actualUserId & actualPassword values with new input from console
                actualUserId = scan.nextLine();
                actualPassword = scan.nextLine();
//                if count equals to 5, then notifying user with custom message
                if (i == 4) {
                    System.out.println("Your account will be locked for 10 min");

                }

            }else {
//                 if any point in the loop user enters correct user id & password then system let user into home page
                System.out.println("welcome to home page");
                break;
            }

            }

    }
}
