import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //This is where the program will collect user input.
        System.out.print("Please input the total cost (without tip): ");
        double totalCost = s.nextDouble();
        System.out.print("Please input the percentage tipped (whole number without percent sign): ");
        int percentTipped = s.nextInt();
        System.out.print("Please input the amount of people that the cost will be split amongst: ");
        int numOfPeople = s.nextInt();
            //This is where calculations are done for the amount of tip, amount of the tip paid per person, the bill including tip, and the amount of that bill paid per person.
            double totalTipped = Math.ceil(totalCost * percentTipped) / 100;
            double tipPerPerson = Math.ceil(totalTipped / numOfPeople * 100) / 100;
            double finalBill = Math.ceil((totalTipped + totalCost) * 100) / 100;
            double soloBillFinal = Math.ceil(finalBill / numOfPeople * 100) / 100;
                //This is where the data is printed and outputted for the user to see.
                System.out.println();
                System.out.print("The total tip amount is: $");
                System.out.format("%.2f%n", totalTipped);
                System.out.print("The amount of tip paid per person is: $");
                System.out.format("%.2f%n", tipPerPerson);
                System.out.print("The total bill (including tip) is: $");
                System.out.format("%.2f%n", finalBill);
                System.out.print("Bill evenly split among patrons is: $");
                System.out.format("%.2f%n", soloBillFinal);
    }
}
