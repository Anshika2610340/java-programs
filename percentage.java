import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the marks of the subjects:");
         int physics = sc.nextInt();
         int chemistry = sc.nextInt();
         int maths = sc.nextInt();
         int cs = sc.nextInt();
         int english = sc.nextInt();
         float percentage = ((physics + chemistry + maths + cs + english) / 500.0f) * 100;
         System.out.println("percentage =" + percentage);
         sc.close();

    }
}
