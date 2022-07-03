import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {



        String s1 = "blah";
        String s2 = fiveTimes(s1);

    }

    public static void print(Object o){
        System.out.println(o.toString());
    }

    public static void print(Object o, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(o.toString());
        }
    }

    public static String fiveTimes(String s){
        String newOne = "";
        for (int i = 0; i < 5; i++) {
            newOne += s;
        }
        return newOne;
    }

    public static int smth(){
//        int x = 5;
//        return x;
        return 5;
    }




}

