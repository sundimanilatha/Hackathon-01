import java.util.Scanner;
public class household {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter family members: " );
        int familyMembers = sc.nextInt();
        System.out.println("Enter water consumed in liters:");
        double waterConsumed = sc.nextDouble();
        System.out.println("Enter House Number:");
        int houseNumber = sc.nextInt();
        System.out.println("Enter Water usage status:");
        char waterUageStatus = sc.next().charAt(0);
        sc.close();
    }
}
