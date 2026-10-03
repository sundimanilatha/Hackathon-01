import java.util.Scanner;
public class waterConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumption in liters:");
        double consumption = sc.nextDouble();
        if (consumption <= 500) {
            System.out.println("The bill is Rs.100");
        } else 
            if (consumption >= 500) {
                System.out.println("The bill is Rs.200");
            }
        sc.close();
    }
    
}
