import java.util.Scanner;

public class HW5_a {

    public static int n = 1;
    public static void task (){
        System.out.println("\u001B[36m" + "#################" + "Task " + n +"########################" + "\u001B[0m");
        n++;}

    public static int sum (int a, int b){

        return a + b;
    }
    public static int min (int a,int b){

       return  a - b;
    }
    public static double div (int a,int b){
        return a / b; }

    public static void mult (int a,int b){
        int c = a * b;
        System.out.println("multiplication " + a + " * " + b + " = " + c);}
    public static void pir (int a,int b){
        System.out.println();
    }
    public static int biuld (int a){
        for (a = 0; a < 10; a++);

            return a;}



    public static void main (String [] args) {

       int a = 5;                 // Необходимо написать 4 метода:сложение 2х чисел
        int b = 6;// вычитание 2х чисел умножение 2х чисел деление 2х чисел
         task();
        System.out.println(sum(a,b));
        System.out.println(min(a,b));
         task();
        System.out.println(sum(5,8));
         task();
        System.out.println(div(7,7));
         task();
         mult(60,2);


//        Задача №1 Вывести следующие строки с соответствующим форматированием (как пирамиды):
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

       task();
//       int [] array = {0 , 1 , 2 , 3 , 4,  5,  6 , 7,  8 , 9};{
//           int i = 0;
//           for (i = 0 ; i < array.length; i++ )
//            System.out.println(i);
//           i = --i;
//            System.out.println(i);



//       int number;
//       Scanner scan =new Scanner(System.in) ;
//       number = scan.nextInt();
//       scan.close();
//       int num = 1;
//       for (int st = 1; st <= number ;st++){
//
//           for (int i = 1; i <= st ; i++) {
//
//               System.out.format("% - 20d", num++);}
//           System.out.println();}


       for (int i = 9; i >= 0;i-- ){
           for ( int j = 0; j<= i;j++){
               System.out.print(j);
               System.out.print(" ");
           }
           System.out.println();


       }

        System.out.println("_________________________________________");
        for (int i = 9; i >= 0;i-- ) {
            for (int j = i; j < 9; j++) {

                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println("----------------------");
        for (int i = 9; i >= 0;i-- ) {
            for (int j = i; j < 9; j++) {

                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }

            for ( int j = 1; j<= i;j++){
                System.out.print(j);
                System.out.print(" ");}

            System.out.println();

        }






//        Задача №2
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0


//        Задача №3
//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//        8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//        6 5 4 3 2 1 0 1 2 3 4 5 6
//        5 4 3 2 1 0 1 2 3 4 5
//        4 3 2 1 0 1 2 3 4
//        3 2 1 0 1 2 3
//        2 1 0 1 2
//        1 0 1
//        0




        }
    }












