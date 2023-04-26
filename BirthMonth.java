import java.util.Scanner;
class BirthMonth {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of your birth month:");
        Double birthMonth = myObj.nextDouble();
        if (birthMonth >= 13){
            System.out.println("You entered an incorrect month value: "+birthMonth);
        }
        else {
            System.out.println("Your birth month is: "+birthMonth);
        }
    }
}

}
