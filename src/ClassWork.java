import apple.laf.JRSUIConstants;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
//        String myStatement = "I am a good programmer";
//        System.out.println(myStatement.length());
//        System.out.println(myStatement.toLowerCase());
//        System.out.println(myStatement.contains("mohammad"));
//        System.out.println(myStatement.charAt(5));
//        System.out.println(myStatement.equals("technosoft"));
//        System.out.println(myStatement.isEmpty());
//        System.out.println(myStatement.startsWith("welcome"));
//        System.out.println(myStatement.endsWith("good bye "));


//        int temp = 115;
//        if (temp <= 32){
//            System.out.println("It is freezing outside");
//        } else if (temp >= 100){
//            System.out.println("It is hot outside");
//        } else {
//            System.out.println("Go for it, Its pretty outside");

//
//        String month = "Dec";
//        switch (month){
//            case "Dec":
//            case "Jan":
//            case "Feb":
//                System.out.println("winter");
//                break;
//            case "Mar":
//            case "Apr":
//            case "May":
//                System.out.println("spring");
//                break;
//            case "June":
//            case "Jul":
//            case "Aug":
//                System.out.println("summer");
//                break;
//            case "Sep":
//            case "Oct":
//            case "Nov":
//                System.out.println("fall");


//        count down from 100 to 0
//
//        int count = 100;
//        while (count >= 0) {
//            System.out.println("count: " + count);
//            count--;


//            count up to 100 from 0 and print only the even numbers
//
//                int count = 0;
//            while (count <= 100) {
//                if (count %2 == 0) {
//                    System.out.println(count);
//                }
//                count++;

//            }
//
//            do {
//                System.out.println("count is: " + count);
//                count++;
//            } while (count < 5);

//          write a logic that uses a for loop to display numbers in descending order
//          in the step of 5 starting from 100

//
//        for (int i = 100; i >= 0; i = i-5 ) {
//            System.out.println(i);

        // write a logic that reverse string
//        String name = "Mohammad";
//        String reversedString = "";
//        char [] strArr = name.toCharArray();
//        for (int i = strArr.length - 1; i >= 0; i --) {
//            reversedString = reversedString +strArr[i];
//
//
//        }
//        System.out.println(reversedString);

//        String word = "racecar";
//        String reverseWord = "";
//        char [] strArr = word.toCharArray();
//        for (int i = strArr.length - 1; i >= 0; i --) {
//            reverseWord = reverseWord + strArr[i];
//
//        }
//        System.out.println(reverseWord.equals(reverseWord));

//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Is the door open? If yes write true, otherwise write false");
//        boolean isThedoorOpen = scan.hasNextBoolean();
//        System.out.println(isThedoorOpen);
//
//        String [] words = {"happy", "peace", "quiet", "learn"};
//        for (int i = 0; i <= words.length - 1;i++ ) {
//            System.out.println(words[i]);
//        }

        String [] words = {"grow", "wealth", "success", "help"};
//        if (words [i].length() > 4)
        for (int i = 0; i <= words.length-1; i++){
            if (words[i].length()> 4)
            System.out.println(words[i]);

        }
    }
}



