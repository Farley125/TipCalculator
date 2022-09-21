import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input the total cost (without tip): ");
        double totalCost = s.nextDouble();
        System.out.print("Please input the percentage tipped (whole number without percent sign): ");
        int percentTipped = s.nextInt();
        System.out.print("Please input the amount of people that the cost will be split amongst: ");
        int numOfPeople = s.nextInt();
    }
}
