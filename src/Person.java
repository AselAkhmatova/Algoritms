public class Person {  // klass ne mojem rabotat, ne hranim danye

    String name;  //pole(fiels) , peremenye classy
    int age;      // esli zdesi zadadim znachenr zdec to v objectax budet vce sto zdec vedem

   // void printName(){    //metod

        //konstructor eto spesefic metod classa  1. imeet ima clasa 2. argumenty peredautca pri sozdanii objecta classa
        Person (String name, int age){
        this.name = name;                  // vsegda ispols  this
        this.age = age;}

        // konstructor s 1 parametrom      overloging - peregrusga  - eto kogda 2 metoda s odnim nazvaniem  no s rasnymy parametrami

            Person(String name){
            this.name = name;       // mojem ispolsovat odnu is nix
}

     //   String name = " ";

         void printobject() {                                //sylaetca na pole kotoryy sozdali - this , esli est 2 name
        System.out.println(this.name);                      // eto vsegda pole
        System.out.println(this.age);
    }




}
