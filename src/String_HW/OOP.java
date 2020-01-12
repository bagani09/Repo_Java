package String_HW;

public class OOP {
    public static void main(String[] args) {

        System.out.println(calculateGpa());


    }

    public static int calculateResult (int subOne, int subTwo){
        return subOne+subTwo;
    }
    public static int calculateGpa(){
        int gpa = (calculateResult(10,20) + calculateResult(30, 40)
                + calculateResult(40, 50)) /3;
        return gpa;
    }
//    Objects are instance of a class



}



