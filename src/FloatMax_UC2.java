import java.util.Scanner;

public class FloatMax_UC2 <T> {
    T num1, num2, num3;

    public FloatMax_UC2(T num1, T num2, T num3) {
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
        System.out.println("Maximum of 3 Float number ");
        System.out.println("Enter 1st number:");
        float n1=sc.nextFloat();
        System.out.println("Enter 2nd number:");
        float n2=sc.nextFloat();
        System.out.println("Enter 3rd number:");
        float n3=sc.nextFloat();

        //find max
        maxNumber(n1,n2,n3);

    }
}