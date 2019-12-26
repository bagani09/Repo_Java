package String_HW;


public class HomeWork {
    public static void main(String[] args) {
//        int age = 31;
//        boolean isChild = age <= 7;
//        boolean isSenior = age >= 65;
//        System.out.println(isChild);
//        System.out.println(isSenior);


//        Homework for 12/30/2019

        double celsius = 30;
        //        Celsius to Fahrenheit
        //        T(°F) = T(°C) × 9/5 + 32
        double fahrenheit = (celsius) * 9/5 + 32;
        System.out.println(fahrenheit);

//        Celsius to Kelvin
//        T(K) = T(°C) + 273.15
        double kelvin = (celsius) + 273.15;
        System.out.println(kelvin);

//        Celsius to Rankine
//        T(°R) = (T(°C) + 273.15) × 9/5
        double rankine = ((celsius) + 273.15) * 9/5;
        System.out.println(rankine);

//        Fahrenheit to Celsius
//        T(°C) = (T(°F) - 32) × 5/9
        double FtoC = ((fahrenheit) - 32) * 5/9;
        System.out.println(FtoC);

//        Fahrenheit to Kelvin
//        T(K) = (T(°F) + 459.67)× 5/9
        double FtoK = ((fahrenheit) + 459.67) * 5/9;
        System.out.println(FtoK);

//        Fahrenheit to Rankine
//        T(°R) = T(°F) + 459.67
        double FtoR = (fahrenheit) + 459.67;
        System.out.println(FtoR);

//        Kelvin to Fahrenheit
//        T(°F) = T(K) × 9/5 - 459.67
        double KtoF = (kelvin) * 9/5 - 459.67;
        System.out.println(KtoF);

//        Kelvin to Celsius
//        T(°C) = T(K) - 273.15
        double KtoC = (kelvin) - 273.15;
        System.out.println(KtoC);

//        Kelvin to Rankine
//        T(°R) = T(K) × 9/5
        double KtoR = (kelvin) * 9/5;
        System.out.println(KtoR);

//        Rankine to Fahrenheit
//        T(°F) = T(°R) - 459.67
        double RtoF = (rankine) - 459.67;
        System.out.println(RtoF);

//        Rankine to Celsius
//        T(°C) = (T(°R) - 491.67) × 5/9
        double RtoC = ((rankine) - 491.67) * 5/9;
        System.out.println(RtoC);

//        Rankine to Kelvin
//        T(K) = T(°R) × 5/9
        double RtoK = (rankine) * 5/9;
        System.out.println(RtoK);





    }

}
