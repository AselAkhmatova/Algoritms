public class HW_7_Employee {

   /** Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
    setBaseSalary
    getName - получить имя
    setName
    getSalary - получить зарплату

*/
   private int BaseSalary;
    private String Name;
    private double Salary;

    public HW_7_Employee(int BaseSalary,String Name) {
        this.BaseSalary = BaseSalary;
        this.Name = Name;

    }

    public int getBaseSalary() {

        return BaseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        Name = name;
    }






}
