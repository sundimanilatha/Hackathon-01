import java.util.Scanner;
public class totalWaterConsumption {
    static int calculateTotalConsumption(int morningusage, int eveningusage) {
        return morningusage + eveningusage;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter morning usage in liters:");
        int morningusage = sc.nextInt();
        System.out.println("Enter evening usage in liters:");
        int eveningusage = sc.nextInt();
        int totalconsumption = calculateTotalConsumption(morningusage, eveningusage);
        System.out.println("Total water consumption is: " + totalconsumption);
        sc.close();
    }
}
