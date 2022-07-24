        import java.util.Scanner;

        public class BoardPercentageCalculator {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 500;
        System.out.println("CBSE Board Marks Calculator");
        System.out.println("Enter English Marks");
        float eng = sc.nextInt();
        System.out.println("Enter Hindi Marks");
        float hin  = sc.nextInt();
        System.out.println("Enter Mathematics Marks");
        float math = sc.nextInt();
        System.out.println("Enter Science Marks");
        float sci = sc.nextInt();
        System.out.println("Enter Social Marks");
        float soc = sc.nextInt();
        float sum = eng + hin + math + sci + soc;
        float Percentage = (sum/total)*100;
        System.out.println("Total Percentage obtained is: ");
        System.out.println(Percentage);
    }
}
