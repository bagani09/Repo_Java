package String_HW;

public class OOPHW {
//    *1
    public static  String reverseString () {
        String word = "Sample";
        int wordlen = word.length();
        String reversed = "";
        for (int i = 0; i <= wordlen - 1; i++) {
            reversed = reversed + word.charAt(wordlen - 1 - i);

        }
        return reversed;
    }
//      *2
    public static int [] nums () {
        int [] nums = {25, 15, 3, 2, 40};
        int length = nums.length;
        int[] nums2 = new int[length];
        for (int i = 0; i <= length-1; i++) {
            nums2[i] = nums[length - 1 - i];
        }
        return nums2;
    }

//    *3
        public static int sum (){
        int [] arrs = {20, 10, 40, 44};
        int sum = 0;
        for (int arr : arrs){
            sum += arr;

        }
        return sum;

    }

//        *5
        public static double arrayAverage () {
        double [] numbers = {20, 10, 40, 44};
        double average = 0;
        for (double number : numbers) {
            average += number/4;

            }
            return average;

        }

        

        public static void main(String[] args) {

        System.out.println(reverseString());

        System.out.println(nums());

        System.out.println(sum());

        System.out.println(arrayAverage());


    }
}
