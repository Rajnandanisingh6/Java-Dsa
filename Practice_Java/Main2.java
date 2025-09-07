package Practice_Java;

public class Main2 {
    public static void main(String[] args) {
        //Data types
        //1st --> primitive data types
        //2nd -->Non-Primitive types / Reference
        //first talk about primitive data types
        //1st hai byte - 1 [-128 to 127]
        //short -2 bytes of memory
        //int - 4
        //long - 8
        //float - 4
        //double -8
        //char - 2
        //boolean - 1 true /false
        // byte age=32;
        // int phone= 1234567890;
        // long phone2=1234567890L;
        // float pi =3.14F;
        // char letter ='@';
        // boolean isAdult =true;

        //--------------------------------
        //Non-primitive types
       /* String name=new String("apu");
        String friend =new String("akku");
        String name1="Radha";
        System.out.println(name.length());
        */

        //----------------------------------------

        //Strings --> in java strings are immutable
        //concatenate
        String name1="Amma";
        String name2="Raja";
        String name3= name1 + " and " + name2;
        System.out.println(name3);

        //charAt
        String name ="Aman";
        System.out.println(name.charAt(0));

        //length
        String nam="radhaa";
        System.out.println(nam.length());

        //Replace
        String naam = "Raja";
        String naam1= naam.replace('R','B');
        System.out.println(naam1);

        //SubString
        String name4 ="Raja and Rama";
        System.out.println(name4.substring(0,4));


        

    }
    
}
