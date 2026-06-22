public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Sam");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This is car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        // Step 1
        double firstDouble = 20.00d;
        //Step 2
        double secondDouble = 80.00d;
        // Step 3
        double sumMulDoubles = ((firstDouble + secondDouble) * 100.00d);
        System.out.println("SumMulDoubles = " + sumMulDoubles);
        // Step 4
        double remainderDouble = sumMulDoubles % 40.00d;
        System.out.println("RemainderDouble = " + remainderDouble);
        // Step 5
        boolean zeroCheck = (remainderDouble == 0.00d) ? true : false;
        // Step 6
        System.out.println("Remaineder is zero: " + zeroCheck);
        // Step 7
        if (zeroCheck == false) {
            System.out.println("Got some remainder");
        }

    }

}
