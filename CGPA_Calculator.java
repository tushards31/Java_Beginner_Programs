import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub1 marks");
        float sub1 = sc.nextFloat();
        System.out.println("Enter sub2 marks");
        float sub2 = sc.nextFloat();
        System.out.println("Enter sub3 marks");
        float sub3 = sc.nextFloat();
        float total = sub1 + sub2 + sub3;
        System.out.println("Your CGPA is: ");
        float CGPA = total/30;
        System.out.println(CGPA);
    }
}
