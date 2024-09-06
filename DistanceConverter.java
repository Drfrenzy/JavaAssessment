public class DistanceConverter {
    public static void main(String[] args) {
        MilesToKilometers(25);
        KilometersToMiles(40.2335);
    }

    public static double MilesToKilometers(double miles) {
        double kilometers = miles * 1.60934;
        System.out.println("Kilometers: " + kilometers);
        return kilometers;
    }

    public static double KilometersToMiles(double kilometers) {
        double miles = kilometers * 0.621371;
        System.out.println("Miles: " + miles);
        return miles;
    }
}
