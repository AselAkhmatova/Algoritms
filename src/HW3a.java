public class HW3a {

    public static void main (String [ ] args) {

   //   ZADANIE1
        int a1 = 1;
        int b1 = 2;

        if ( a1 == b1 ) {
            System.out.println("a1 == b1");}

            else if ( a1 < b1 ) {
            System.out.println( " a1 < b1");}

            else if ( a1 > b1 ) {
            System.out.println("a1 > b1");
        }

         //   ZADANIE 2 even - chetnoe = 0 ;  odd - nechetnoe = 1
          int a = 2;
          int b = 2;
          int c =  a + b;
          int i = c % 2;
          if (i == 0 ) {
              System.out.println( " maybe a and b are even");
          }else if  ( i == 1 ) {
              System.out.println( "some variable is odd");
          }


          // zadanie 3
          int k = 50;
          int m = k  / 2 ;

          if ( k > 10 ) {
              System.out.println(" k > 10");
          } if ( k < 100 ) {
               System.out.println("k <100");
                }
          if ( m > 20) {
               System.out.println("resalt delenia na 2 > 20");
          } if ( k >= 5 && k <= 40 ) {
               System.out.println("znachenie mejdy  5 & 40"); }
          else if ( k < 5 || k > 40 ) {
            System.out.println("znachenie k < 5 ili  k > 40 ");
        }
    }
}
