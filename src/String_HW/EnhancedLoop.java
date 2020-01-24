package String_HW;


public class EnhancedLoop {

    public static String reverseString (String name) {
//        String name = "Casper";
        int len = name.length();
        String reverse = "";
        for (int i = 1; i <= len; i++) {
            reverse = reverse + name.charAt(len - i);
        }

        return reverse;
    }




    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};


        for (String month : months) {
            System.out.println(month);
            boolean isDecember = month.equalsIgnoreCase("december");
            if (isDecember) {
                System.out.println("December present in this list");
                break;


            }

        }

        System.out.println(reverseString("casper"));





    }
}
