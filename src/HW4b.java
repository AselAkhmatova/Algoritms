public class HW4b {

    public static int num = 1;
    public static void num (){

        System.out.println("Task " + num);
            num++;
        }
    public static void line(){

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    public static void numline (){

        line();
        num();

    }


    public static void main(String[] args) {

//        Дана строка:String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.Для указанной строки ответ будет “ооооо” (или в столбик)
        numline();
        String s = "Перестанoвoчный алгoритм быстрoгo действия";

        for (int i = 0; i < s.length(); i++){
              if (s.charAt(i) == 'o' ) {
                  System.out.println("все буквы “о” из этой строки = " + s.charAt(i));}
       } ;


        //        Дана строка:String s = “Перевыборы выбранного президента”;  ?????????
//        необходимо подсчитать количество букв “е” в строке.Для указанной строки ответ будет 4.
        numline();
        String s1 =" “Перевыборы выбранного президента”";
        int count = 0;
        for(  int i1 = 0; i1 < s1.length(); i1++){
            if (s1.charAt(i1) == 'е' ){
                count = count + s1.charAt(i1);
             //   count++;
            }
        }System.out.println("количество букв “е” в строке = " + count );

        //        Дана строка:String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.
//
        numline();
        String s2 = "“Посмотрите как Рите нравится ритм”";
        String p = "рит";
     //    Integer.valueOf(s2);

       for (int i2 = 0;i2 < s2.length(); i2++ ){
           if (s2.charAt(i2) == 'р'){
               System.out.println(s2.charAt(i2));

           }
       }
















    }





}
