package Mypackage;

public class MyJavaClass {
    public static void main(String[] args) {
//        byte LegalAge = 21;
////        used byte data type because min age is a number that will not reach 127
//        short AverageSalary = 8600;
////       i used short in this scenario because we have a value number that fits the criteria of short data type
//        int Distance = 238900;
////        i used int because we are dealing with a larger value;
//        float InterestRate = 0.01f;
////        the reason we used float here because we have decimal points and very small value
//        boolean IsYourGenderFemale = true;
//        char MyNameInitial = 'A';
////        represents single character which is name initial
//        System.out.println("Min legal age to purchase alcohol is " + LegalAge +
//                " average monthly salary of an automation Engineer in NY is " + AverageSalary +
//                " Distance between Moon & Earth in miles is " + Distance +
//                " The interest rate in Chase bank is " + InterestRate +
//                " is your gender female " + IsYourGenderFemale +
//                " my name initial is letter " + MyNameInitial +
//                " in which data type you should store item's price" + " we should store item's price in float or double depending on price range ");





        String myStatement = "I am a good programmer";
        String[] words = new String[5];
        words[0]= "I";
        words[1]= "am";
        words[2]= "a";
        words[3]= "good";
        words[4]= "programmer";
        int size = words.length;
        System.out.println("Total number of words in the myStatement: " + size);


        myStatement = "I am a good programmer";
        String replaceMyStatement = myStatement.replace ('r','f');
        System.out.println(replaceMyStatement);


        String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
        boolean JOHN = names[1].equalsIgnoreCase("JOHN");
        System.out.println(JOHN);

        String[] friends = {"Kate", "Victoria", "Sam", "Anastasia", "Julia"};
        int quantaty = friends.length;
        System.out.println(quantaty);
        String name = friends[2];
        System.out.println(name);
        boolean firstLetter = friends[1].startsWith("A");
        System.out.println(firstLetter);


    }

}
