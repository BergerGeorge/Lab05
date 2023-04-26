import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the cost of your item:");
        Double itemPrice = myObj.nextDouble();
        ;
        if (itemPrice <= 99)
        {
            double shippingCost = (0.02 * itemPrice);
            double totalCost = (shippingCost + itemPrice);
            System.out.println("Your shipping cost is " + shippingCost + " and your total cost is "+totalCost);
        }
        else
        {
            System.out.println("Your shipping cost is free, and your total cost is "+ itemPrice);
        }
    }
}