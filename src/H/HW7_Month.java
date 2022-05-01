package H;

public class HW7_Month {

 /**   Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    Создать класс MonthUtils который бы хранил подготовленные месяцы или их
    массивы для использования (объекты класса Month).
*/

    private String  month [];
    private int day;
    private int rabDay;

    public HW7_Month(String[] month) {
        this.month = month;
    }

    HW7_Month (String month [], int day, int rabDay){

        this.day = day;
        this.rabDay = rabDay;
        this.month = month  ;




    }

}
