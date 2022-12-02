package Day2;
//rock = 1
//paper = 2
//scissors = 3
//A = rock
//B = paper
//C = scissors
//X = LOSE
//Y = TIE
//Z = WIN
//win = 6
//draw = 3
//lose = 0
import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.io.*;
public class rock 
{
    public static void main (String [] args) throws IOException
    {
        File input = new File("/Users/adesh/Documents/GitHub/AdventOfCode/Day2/paper.txt");
        Scanner scan = new Scanner(input);
        String game = "";
        int score = 0;
        String choice = "";
        String opponent = "";

        while(scan.hasNext())
        {
            game = scan.nextLine();
            choice = game.substring(2);
            opponent = game.substring(0,1);

            if (opponent.equals("A"))//rock
            {
                if(choice.equals("X"))//lose--scissors3
                    score += 3;
                else if(choice.equals("Y"))//tie--rock1
                    score += 4;
                else if(choice.equals("Z"))//win--paper2
                    score += 8;
                    
            }
            else if(opponent.equals("B"))//paper
            {
                if(choice.equals("X"))//lose--rock1
                    score += 1;
                else if(choice.equals("Y"))//tie--paper2
                    score += 5;
                else if(choice.equals("Z"))//win--scissors3
                    score += 9;
            }
            else if(opponent.equals("C"))//scissors
            {
                if(choice.equals("X"))//lose--paper2
                    score += 2;
                else if(choice.equals("Y"))//tie--scissors3
                    score += 6;
                else if(choice.equals("Z"))//win--rock1
                    score += 7;
            }
        }
        System.out.println(score);

    }
    
}
