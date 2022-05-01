import java.util.Arrays;

public class Object {    // obect

    public static void main(String[] args) {

        Person person1 = new Person("Asel");//perenosim s drugogo classa Person

        Person []  arr = new Person [10];  //referens type budet : null

       // int [] arr = new int[0]; - pustoy massiv

        System.out.println(Arrays.toString(arr));


     //   person1.name = "ASEL";       //null - esli eto  string,esli nichego ne zadaem
     //   person1.age = 30;            // 0 - dlai chisel

        Person person2 = new Person("Sergey",29);//perenosim s drugogo classa Person


   //     person2.name = "Sergei";  s konstructorom mojno ne ispolzuem
   //     person2.age = 30;


      person1.printobject();
      person2.printobject();









    }





}
