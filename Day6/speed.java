package Day6;
import java.util.*;
import java.io.*;

public class speed 
{
    public static void main (String [] args) throws IOException
    {
        File input = new File("/Users/adesh/Documents/GitHub/AdventOfCode/Day6/aaa.txt");
        Scanner scan = new Scanner(input);
        String line = "";
        int start = 0, end = 13;
        String marker = "";
        int FINAL = 0;
        boolean dupe;

        while(scan.hasNext())
        {
            line = scan.nextLine();
        }

        while(end < line.length()-1)
       {
            marker = line.substring(start,end+1);//bvwb
            System.out.println("Marker: " + marker);

            dupe = false;
            
            for(int i = 0; i < marker.length(); i++)
            {
                for(int j = i+1; j < marker.length(); j++)
                {
                    if(marker.charAt(i) == marker.charAt(j))
                    {
                        dupe = true;
                        System.out.println("Duplicate Character: " + marker.charAt(i));
                    }
                  
                }
            }
            
            if(!dupe)
                break;
            else 
            {
                end++;
                start++;
            }
       }
        
        System.out.println(end+1);
        
    }
}
