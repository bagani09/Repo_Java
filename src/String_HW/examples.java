package String_HW;

public class examples {
    public static void main(String[] args) {


        String myString = "reverse";
        int stringlen = myString.length();
        String reversed = "";
//        charAt()
        reversed = reversed + myString.charAt(stringlen -1 - 0);
        reversed = reversed + myString.charAt(stringlen - 1 - 1);
        for ( int i = 0; i <= stringlen-1; i++) {
            reversed = reversed + myString.charAt(stringlen -1 - i);

        }
        System.out.println(reversed);
        int [] arr = {10, 20, 30, 40,};

    }
}
