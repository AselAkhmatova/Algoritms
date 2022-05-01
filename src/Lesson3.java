public class Lesson3 {

    public static void main(String[] args) {

 /*         if ( )   {

          }  else {

          }
      }
     !=   ne ravno
      == operator sravnenia
*/

 //       int i = 5;
// nelsa pisat bes scobki

   // && - and  || - or

  /*      true and true = false
         false and true = false
         true and false =   false
         false and false = false


  /*      true or true = true
         false or true = true
         true or false =   true
         false or false = false




   */
/*
     if   else
     if (i == 1) {
          System.out.println("= 1");
            } else if (i > 1) {
            System.out.println("> 1");
            } else  {
                if (i < 1) {
                    System.out.println("< 1");
                }
            }

    /*       && = and
       int a = 6;

       if ( a > 1  &&  a < 5 ) {
            System.out.println("2, 3, 4");}
       else if ( a < 1) {
           System.out.println("<1");}
       else {
           System.out.println(">5");
       }
*/

   /*     int a = 3;
        int b = 12;

        if ( (a >= 5  ||  a <= 1 ) && b !=11) {
            System.out.println("...1 5 ....");}
        else if ( a == 2) {
            System.out.println("2");}
        else if ( a == 3) {
            System.out.println("3");}
        else if ( a == 4) {
            System.out.println("4");}
*/
        //    |  eto binarnoe vicheslenie  <<  eto sdvig

/*
        int a = 5;  //101
        int b = 10;  //011
        System.out.println( a >> b);
*/
 // sicl

//       for( int i = 0; i < 5; i = i + 1 ) {
//           System.out.println(i);



  //     for (;;){                  esli tak napishem budet besconechno
 //          System.out.println("hi");
   //    }


  // lesson wille,
  //  int i = 2;
//    do
  //  h{
   //     System.out.println(i);
  //      i = i + 1;
  //  }while (i < 5);

//        int[] arr1 = {1, 2, 3, 4};
//        int[][] arr2 = {{1, 10, 100, 1000},
//                {2, 20, 200, 2000},
//                {3, 30, 300, 3000},
//                {4, 40, 400, 4000},
//                {5, 50, 500, 5000}};
//
//        System.out.println(Arrays.toString(arr2[2]));
//        System.out.println(arr2[2][2]);
//        int sum = 0;
//        int total = 0;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(Arrays.toString(arr2[i]));
//            sum = 0;
//            for (int j = 0; j < arr2[i].length; j++) {
//                sum = sum + arr2[i][j];
//                total = total + arr2[i][j];
//
//                if (min > arr2[i][j]) {
//                    min = arr2[i][j];
//                }
//
//                if (max < arr2[i][j]) {
//                    max = arr2[i][j];
//                }
//            }
//            System.out.println("  sum: " + sum); // + "  min=" + min + "  max=" + max);
//        }
//        System.out.println("min=" + min + "  max=" + max + "  total=" + total);
//    }
          for (int i = 0; i < 5;i++){

              if (i == 3){
                  continue;
              }
              System.out.println(i);
          }


   }
}
//
//
//
//


