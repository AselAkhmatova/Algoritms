public class Person3 {

    String name;
    int age;
    char gender;

    public Person3(String name) {
        this.name = name;

    }

    public Person3(String name,int age, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    String getName (){

        if ( gender == 'F'){

            return "Mrs. " + name;
        }else {

            return "Mr. " + name;

        }



    }















}
