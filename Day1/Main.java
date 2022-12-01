package Day1;
import java.util.*;
import java.io.*;

public class Main 
{
    public static void main (String [] args) throws FileNotFoundException
    {
        File input = new File("/Users/adesh/Documents/GitHub/AdventOfCode/Day1/input.txt");
        Scanner scan = new Scanner(input);
        String line = "";
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        ArrayList <Integer> currentBag = new ArrayList<>();
        ArrayList <Integer> sumList = new ArrayList<>();
        int sum = 0;

        while(scan.hasNext())
        {
            line = scan.nextLine();

            if(line.length() > 0)
                currentBag.add(Integer.parseInt(line));

            else if(line.length() == 0)
            {
                for(int s: currentBag)
                {
                    sum += s;
                }
                sumList.add(sum);
                sum = 0;

                currentBag = new ArrayList<>();
            }
                
            
        }
        for(int s: sumList)
        {
            if (s > max)
                max = s;
        }
        

        for(int s: sumList)
        {
            if (s > max1 && s < max)
                max1 = s;
        }
        

        for(int s: sumList)
        {
            if (s > max2 && s < max1)
                max2 = s;
        }
        

        System.out.println(max + max1 + max2);
    }
    
}
