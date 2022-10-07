public class Maximum <T> {
    T one,two,three;

    public Maximum(T one, T two, T three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    static <T extends Comparable<T>> void maximum(T one,T two,T three) {

    if (one.compareTo(two) >= 0 && one.compareTo(three) >= 0) {
            System.out.println(one+ " is the maximum ");
        } else if (two.compareTo(one) >= 0 && two.compareTo(three) >= 0) {
            System.out.println(two + " is the maximum ");
        } else {
            System.out.println(three + " is the maximum ");
        }
    }

    static <T extends Comparable<T>> void max(T one, T two, T three) {
        T max = one;
        if (two.compareTo(max) >=0) {
            max = two;
            System.out.println(two + " is the maximum term");
        } else if (three.compareTo(max)>=0) {
            max = three;
            System.out.println(three + " is the maximum term");
        }
    }
}
