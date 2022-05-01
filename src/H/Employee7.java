package H;

public class Employee7 {

 /**   Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    Все поля сделать приватными и для каждого поля добавить методы set и get.
    Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
    зарплату за те месяцы которые были переданы в качестве аргумента.
*/

  private String name;
  private int age;
  private String gender;
  private double salaryDay;

  public Employee7(String name,int age,String gender,double salaryDay){

    this.name =name;
    this.age = age;
    this.gender = gender;
    this.salaryDay = salaryDay;
  }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(double salaryDay) {
        this.salaryDay = salaryDay;
    }

//    public double getSalary(Month [] monthArray){
//
//      double result = 0;
//      for (int i = 0; i < monthArray.length;i++){
//          result += getSalaryDay() * monthArray
//      }
//    }
//
//
//
//
//









}
