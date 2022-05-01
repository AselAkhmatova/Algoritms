package H;

public class codWars {

    public static String abbrev(String name){
        String array;
        array = name.charAt(0) + ".";
        int n = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                n = i + 1;
            }
            array = array + name.charAt(n);
        }  return array;
        }


        public static String abbrev1(String name1){
                String array1;
                array1 = name1.charAt(0) + ".";
                int n1 = 0;
                for (int i = 0; i < name1.length(); i++) {
                    if (name1.charAt(i) == ' ') {
                        n1 = i + 1;
                    }
                    array1 = array1 + name1.charAt(n1);
                } return array1;

        }



    public static void main(String[] args) {

        System.out.println(abbrev1 ("Katya Smailova"));
        System.out.println((abbrev("katya smailova")));





    }
}
