import java.util.Scanner;

public class TestCases <T> {
    T num1, num2, num3;

    public TestCases(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    static <T extends Comparable<T>> void maxNumber(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
            System.out.println(num2 + " is the maximum number");
        } else if (num3.compareTo(max)>0) {
            max = num3;
            System.out.println(num3 + " is the maximum number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("3 Integers the maximum");
        System.out.println("Enter 1st number:");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int n3=sc.nextInt();

        //find max
        maxNumber(n1,n2,n3);

    }
}