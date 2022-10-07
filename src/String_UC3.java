import java.util.Scanner;

public class String_UC3 <T> {
    T str1, str2, str3;

    public String_UC3(T str1, T str2, T str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    static <T extends Comparable<T>> void maxString(T str1, T str2, T str3) {

        if (str1.compareTo(str2) >= 0 && str1.compareTo(str3) >= 0) {
            System.out.println(str1 + " is the maximum ");
        } else if (str2.compareTo(str1) >= 0 && str2.compareTo(str3) >= 0) {
            System.out.println(str2 + " is the maximum ");
        } else {
            System.out.println(str3 + " is the maximum ");
        }
    }


    public static void main(String[] args) {
/*        Scanner sc=new Scanner(System.in);
        System.out.println("Maximum of 3 Float number ");
        System.out.println("Enter 1st string:");
        String str1=sc.next();
        System.out.println("Enter 2nd string:");
        String str2=sc.next();
        System.out.println("Enter 3rd string:");
        String str3=sc.next();


 */
        //find max
        maxString("apple","banana","peach");

    }
}
