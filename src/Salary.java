public class Salary {
    /**
     * Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
     * метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве
     * аргумента вызова метода.
     */
    public double getSum(Employee[] employeesArray) {


        double sum = 0;
        for (int i = 0; i < employeesArray.length; i++) {

            sum = sum + employeesArray[i].salary;
        }

       return sum;
    }


}













