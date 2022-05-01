public class HW5Codwarse {



        public static int doubleInteger ( int i){
            // Double the integer and return it!
            return i * i;
        }

        //Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.

        public static boolean isLove ( final int flower1, final int flower2){
            return (flower1 % 2 == 0 && flower2 % 2 == 1) || (flower1 % 2 == 1 && flower2 % 2 == 0);
        }


        //    Given [34, 15, 88, 2] your solution will return 2
        //   Given [34, -345, -1, 100] your solution will return -345

        public static int findSmallestInt ( int[] args ){

            int min = args[0];
            for (int i = 1; i < args.length; i++) {
                if (min > args[i]) {
                    min = args[i];
                }
            }
            return min;
        }


//    Given a non-negative integer, 3 for example, return a string with a murmur:
//            "1 sheep...2 sheep...3 sheep...". Input will always be valid,
//    i.e. no negative integers.


        public static String countingSheep ( int num){
            String result = "";
            for (int i = 1; i < num; i++) {
                result += i  + " sheep...";
            }

            return result;
        }

    public class Cube{
        // note: use primitive data type for the side of the cube
    }


// napisat imia famil ---->  I.F  ( ima familiu
        public static String abbrevName(String name) {
            //I take the name string and take the firs character,
            //add a point and take the next character later the first space.
            name = name.charAt(0) + "." + (name.charAt(name.indexOf(" ")+1));
            //I put it everything on the string to upper case:
            name = name.toUpperCase();
            //Return the string.
            return name;
        }



    public static void main(String[] args) {


        System.out.println(abbrevName("Asel "));

    }
}









