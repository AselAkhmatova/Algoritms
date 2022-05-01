public class HW_6_SalaryTeast {

    public static void main(String[] args) {

       Employee [] employees = new Employee[3];

       Employee jon = new Employee("Jon Name", 25,"M",3456);
       Employee min = new Employee("Min Sin",45,"F",56678);
       Employee juana = new Employee("Juana Leo",56,"F",6785);

       employees[0] = jon;
       employees[1] = min;
       employees[2] = juana;

       Salary salary = new Salary();
        System.out.println("sum salarys = " + salary.getSum(employees));

        System.out.println(employees[0] == employees[1]);





    }




}
