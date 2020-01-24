package String_HW;


import java.util.Arrays;

public class midTerm {

    public static int [] findPositiveSmallestInt(int [] givenArr){

            Arrays.sort(givenArr);
            int i = 1;
            for (int x = 0; x < givenArr.length; x++) {
                if (givenArr[x] == i) {
                    i++;
                }
            }
            return i ;
//            I dont know why is giving me an error (((
        }


    public static void main(String[] args) {

    }
}











