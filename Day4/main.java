package Day4;
import java.util.*;
import java.io.*;

public class main 
{
    public static void main (String [] args) throws IOException
    {
        File input = new File("/Users/adesh/Documents/GitHub/AdventOfCode/Day4/asdf.txt");
        Scanner scan = new Scanner(input);
        String line1 = "";
        String line2 = "";
        String line = "";
        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = 0;
        int counter = 0;
        int length1 = 0;
        int length2 = 0;

        while(scan.hasNext())
        {
            line = scan.nextLine();

            start1 = Integer.parseInt(line.substring(0,line.indexOf("-")));
            end1 = Integer.parseInt(line.substring(line.indexOf("-")+1, line.indexOf(",")));

            line = line.substring(line.indexOf(",")+1);

            start2 = Integer.parseInt(line.substring(0,line.indexOf("-")));
            end2 = Integer.parseInt(line.substring(line.indexOf("-")+1));

            if(start1 == start2 || start1 == end2)
                counter++;
            else if(end1 == start2 || end1 == end2)
                counter++;
            else if(start2 < start1 && end2 > start1)
                counter++;
            else if(start1 < start2 && end1 > start2)
                counter++;
            


        }
        System.out.println(counter);
        
    }
}
