public class HW1 {

    public static String str(int n) {
        String str = null;
        if (n < Integer.MAX_VALUE && n > Integer.MIN_VALUE) {

            if (n % 2 != 0) {

                str = "Odd";

            }
            if (n % 2 == 0) {

                str = "Even";


            }
        } else {

            str = "Undefined";
        }
        return str;
    }

    public static void main(String[] args) {

//        int a = 6;
//        int b = 11;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * 1.0 / b);
//        System.out.println(a * b);
//        System.out.println(a % b);
//
//         chetnoe ili net: % (delim) na 2 esli = 0 to chetnoe,, esli = 1 to nechetnoe.
//
//        System.out.println("chetnoe yes or not = " + a % 2);
//        System.out.println("nechetnoe yes or not = " + b % 2);


        String str = null;
        long n = 6778999998989L;
        if (n < Integer.MAX_VALUE && n > Integer.MIN_VALUE) {

            if (n % 2 != 0) {

                str = "Odd";

            }
            if (n % 2 == 0) {

                str = "Even";


            }
        } else {

            str = "Undefined";
        }
        System.out.println(str);

    }
}





















