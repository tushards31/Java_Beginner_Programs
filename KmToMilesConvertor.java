import java.util.Scanner;

public class KmToMilesConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value in  Kilometers");
        float km = sc.nextFloat();
        System.out.println("Value in miles is " + km * 0.621371);
    }
}
