import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //Student number is 016296
        double vanilla = 0.01;
        double chocolate = 0.62;
        double strawberry = 0.96;
//Asks user for ice cream flavour and assigns price to flavour
        System.out.println("Would you like (v)anlla, (c)hocolate or (s)trawberry?");
         String flavour = scanner.nextLine();

        double cost = 0.0;
        if (flavour.equals("v")) {
            cost = vanilla;
        } else if (flavour.equals("c")) {
            cost = chocolate;
        } else if (flavour.equals("s")) {
            cost = strawberry;
        } else {
            System.out.println("We don't have that flavour.");
            return;
        }
    //Asks user for scoop amount and works out price based on it 
        System.out.println("How many scoops would you like?");
        int scoops = scanner.nextInt();
// If scoops are above or below a certain ammount an error message displayed 
        if (scoops < 1) {
        System.out.println("We don't sell just a cone.");
        } else if (scoops > 3 ){
            System.out.println("That's too many scoops to fit on the cone.");
        } else {
            cost = cost * scoops;
            System.out.printf("That will be $%.2f%n", cost);
        }
    }
}
