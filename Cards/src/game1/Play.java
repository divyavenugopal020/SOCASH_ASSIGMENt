package game1;

import java.util.Scanner;

public class Play {
	   public Play()
       {

       }
	   public static void main(String[] args)
       {
               CardPlay sl = new CardPlay();

               System.out.println("Card Game \n Player Options");
               System.out.println("1. Start Game \n  \n2. Exit Game");
               System.out.print("Please provide your option : ");

               int i = 1;

               while (i != 0)
               {
                       Scanner in = new Scanner(System.in);
                       i = in.nextInt();

                       switch (i)
                       {
                               case 1:
                                      // System.out.println("Provide the Number of Players ");
                                       //in = new Scanner(System.in);
                            	   System.out.println("Number Of Players: 4");
                                       i = 4;
                                       sl.playGame(i);

                                       sl.showWinners();
                                       break;

                               case 2:
                                       System.exit(0);
                       }

                       System.out.println();
                       System.out.println("Card Game \n Select User Options");
                       System.out.println("1. Start Game \n2. Exit Game");
                       System.out.print("Please provide your option : ");
               }
       }
}
