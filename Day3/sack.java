package Day3;
import java.util.*;
import java.io.*;

public class sack
{
    public static void main (String [] args) throws IOException
    {
        File input = new File("/Users/adesh/Documents/GitHub/AdventOfCode/Day3/ruck.txt");
        Scanner scan = new Scanner(input);
        String line1 = "";
        String line2 = "";
        String line3 = "";
        int length = 0;
        int sum = 0;
        char letter = ' ';

        while(scan.hasNext())
        {
            line1 = scan.nextLine();
            line2 = scan.nextLine();
            line3 = scan.nextLine();

            for(int i = 0; i < line1.length(); i++)
            {
                letter = line1.charAt(i);

                if(line2.indexOf(letter) >= 0 && line3.indexOf(letter) >= 0)
                {
                    if(letter >= 65 && letter <= 90)//uppercase
                    {
                        sum += letter - 38;
                        break;
                    }
                    else if(letter >= 97 && letter <= 122)//lowercase
                    {
                        sum += letter - 96;
                        break;
                    }
                }

            }
        }

        System.out.println(sum);
    }
}