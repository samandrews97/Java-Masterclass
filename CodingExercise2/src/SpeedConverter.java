public class SpeedConverter {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometresPerHour) {

        long milesPerHour = 0;

        if (kilometresPerHour < 0) {
            milesPerHour = -1;
        } else {
            milesPerHour = Math.round(kilometresPerHour / 1.609);
        }

        return milesPerHour;

    }

    public static void printConversion(double kilometresPerHour) {

        long milesPerHour = Math.round(kilometresPerHour / 1.609);

        if (kilometresPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometresPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }

}
