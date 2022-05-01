import java.util.Arrays;

public class HW4a {

    public static void line () {

        System.out.println( "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");}

           public static int num = 0;
    public static void task() {

        System.out.println("Task " + num );
        num++;
        }


    static public void main (String [ ] args) {

//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum0 = 0;
        for (int i = 0; i < array.length; i = i + 1)
        {sum0 = sum0 + array[i]; }

        task();
        System.out.println("Cуммa всех значений массива = " + sum0);
        line ();


//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < array1.length; x++) {
            if (array1 [x] > max)
                max = array[x];}

        task();
        System.out.println("максимальное значение массива = "  + max);
        line();

//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE; ;
        for (int i1 = 0; i1 < array2.length; i1++) {
            {if ( array2 [i1] < min ) {
                    min = array1[i1];
                }}}

            task();
            System.out.println("минимальное значение массива = " + min);
            line();


//        Задача №4
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum1 = 0;
        for (int i2 = 0; i2 < array3.length; i2 = i2 + 1)
        {sum1 = sum1 + array3[i2]; }

        task();
        System.out.println("среднее арифметическое всех значений массива = " + (sum1 / array3.length));
        line();

//        Задача №5
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum4 = 0;
        for (int i4 = 0; i4 < array4[i4].length; i4 = i4 + 1)
               {for (int j = 0; j < array4[j].length; j = j + 1){
            sum4 = sum4 +array4[i4][j]; }}

        task();
        System.out.println( "сумму элементов массива = " + sum4);
        line();

//        Дан массив:int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max1 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < array5[i5].length; i5++)
            for ( int j1 = 0; j1 < array5[j1].length; j1++ ){
            if (array5 [i5][j1] > max1)
                max1 = array5[i5][j1];}

        task();
        System.out.println("максимальное значение массива = " + max1);
        line();

//        Дан массив:int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;
        for (int i6 = 0; i6 < array6.length ; i6 = i6 + 1){
            count = count + array6[i6].length ;}

        task();
        System.out.println("количество элементов в массиве = " + count);
        line();

















    }





}
