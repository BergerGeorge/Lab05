import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please indicate which political party you associate with:\n1. Democrat 2. Republican 3. Independent 4. Other ");
    Double userInput = myObj.nextDouble();
    if (userInput == 1) {
        System.out.println("You get a democratic donkey.");
    } else
    if (userInput == 2) {
        System.out.println("You get a Republican elephant.");
    }
    else {
        if (userInput == 3) {
            System.out.println("You get an Independent person.");
        }
        else {
            if (userInput == 4) {
                System.out.println("You selected other.");
            }
        }
    }
}
}

