public class HW3b {

    public static void main (String [ ] args) {

        //   zadanie 1
        for( int i = 1; i <= 15; i = i +1 ) {
            System.out.println(i);}

        //zadanie2.3

        for ( int c = 1 ; c < 10000; c = c * 5)
            System.out.println(c);


        // zadanie 2.2
        int num = 5;  //vosvodimoe v stepen chislo
        int res = 1;  //result vosvedenia
        int pow = 1; // nachalnyi pokazatel stepeni
        while(true){
            res = res * num ;
            System.out.println(res);
            pow++;
            if (res >= 1000 )
                break;}

       // zadanie 3
        for( int e = 40; e < 60; e = e + 1 )
            if (e % 4 ==0)  {
            System.out.println(e);}

    }
}

/**Задача №1

        Необходимо вывести числа от 0 до 15.


        Задача №2

        Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.


        Задача №3

        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:


        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение)
*/

