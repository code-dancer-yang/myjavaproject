package apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Ismart {

     private static final String con="";
    public static void main(String[] args) {
        System.out.println("hahhah");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Ismart.main");
        String a="i'am a !";
        System.out.println("a = " + a);
        System.out.println(a);
        List<String> str=new ArrayList<>();
        str.add("a");
        str.add("b");
        for (String s : str) {
            System.out.println(s);
        }
        for (String s : str) {
            System.out.println("s = " + s);
        }
        if (str == null) {

        }
        if (str != null) {


        }
        if (str == null) {

        }
        if (str != null) {

        }


    }
    public static void sayHello(){    }

}

