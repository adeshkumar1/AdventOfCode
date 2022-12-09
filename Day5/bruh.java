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
        ArrayList <Stack> box = new ArrayList<>();
        int boxes = 0;
        String temp = "";
        int counter = 0;
        String line2 = "";
        line = scan.nextLine();
        line1 = scan.nextLine();
        int amount = 0;
        int amount1 = 0;
        int amount2 = 0;
        Object temp1;
        
        while(line1.length() != 0)
        {
            line = line1 + "\n" + line;
            line1 = scan.nextLine();
        }


        
        Scanner scan1 = new Scanner(line);
        temp = scan1.nextLine();

        boxes = temp.charAt(temp.length()-2);
        boxes -= 48;

        for(int i = boxes; i > 0; i--)
        {
            box.add(new Stack<>());
        }

        
        

        for(int i = 0; i < boxes; i++)
        {
            

            for(int num = line.indexOf(i+49) + 36 ; num < line.length(); num += 36)//36
            {
                if(line.charAt(num) == ' ');
                else
                    box.get(i).push(line.charAt(num));
            }
        }
        System.out.println(box.get(0));
        System.out.println(box.get(1));
        System.out.println(box.get(2));
        System.out.println(box.get(3));
        System.out.println(box.get(4));
        System.out.println(box.get(5));
        System.out.println(box.get(6));
        System.out.println(box.get(7));
        System.out.println(box.get(8));


        while(scan.hasNext())
        {
            line2 = scan.nextLine();
            int start = 5;
            int end  = line2.indexOf("from") - 1;

            amount = Integer.parseInt(line2.substring(start,end));
            
            start = line2.indexOf("from") + 5;
            end = line2.indexOf("to") - 1;

            amount1 = Integer.parseInt(line2.substring(start,end));

            start = line2.indexOf("to") + 3;

            amount2 = Integer.parseInt(line2.substring(start));

            int amount3 = amount;

            Stack temp40 = new Stack<>();

            while(amount > 0)
            {
                temp1 = box.get(amount1-1).pop();
                temp40.push(temp1);
                amount--;
            }

            while (amount3 > 0) {
                box.get(amount2-1).push(temp40.pop());
                amount3--;
            }
        }
        
        for(Stack s: box)
            {
                if(s.isEmpty());
                else
                    System.out.print(s.pop());
            }
         
        
 
        


        
       

    }
}

