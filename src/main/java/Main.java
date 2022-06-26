import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int x = 8;
        double y = 2.7999;

        double y1 = x; // 8.0
        int x1 = (int)y;

        File file = new File("newFile.txt");
        file.createNewFile();

        print("3.0");


    }

    public static void print (int x){
        System.out.println(x);
    }

    public static void print (double x){
        System.out.println(x);
    }

    public static void print (String x){
        System.out.println(x);
    }


}

