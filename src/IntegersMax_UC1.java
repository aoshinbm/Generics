import java.util.Scanner;

public class IntegersMax_UC1 <T> {
    T num1;
    T num2;
    T num3;
    private IntegersMax_UC1(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    static <T extends Comparable<T>> void maxNumber(T num1, T num2, T num3) {

        if (num1.compareTo(num2) >= 0 && num1.compareTo(num3) >= 0) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2.compareTo(num1) >= 0 && num2.compareTo(num3) >= 0) {
            System.out.println(num2 + " is the maximum number");
        } else {
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
