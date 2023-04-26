import java.util.Scanner;
public class TheatreKiosk {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        Double age = myObj.nextDouble();
        if (age >=21){
            System.out.println("A wrist band has been dispensed.");
    }
}
}
