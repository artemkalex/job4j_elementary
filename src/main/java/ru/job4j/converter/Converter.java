package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static boolean testMethod(float expected, float out) {
        return expected == out;
    }

    public static void main(String[] args) {
        boolean passed = Converter.testMethod(2, Converter.rubleToEuro(140));
        System.out.println("140 rubles are 2 EUR. Test result : " + passed);
        passed = Converter.testMethod(2, Converter.rubleToDollar(120));
        System.out.println("120 rubles are 2 USD. Test result : " + passed);
    }
}
