package Day5;
import java.util.*;
import java.io.*;

public class bruh 
{
    public static void main (String [] args) throws IOException
    {
        File input = new File("/Users/adesh/Documents/GitHub/AdventOfCode/Day5/tren.txt");
        Scanner scan = new Scanner(input);
        String line = "";
        String line1 = "";

        line = scan.nextLine();
        line1 = scan.nextLine();
        while(line1.length() != 0)
        {
            line = line1 + "\n" + line;
            line1 = scan.nextLine();
        }


        System.out.println(line);

    }
}
