package game1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CardPlay implements CardGame {
	 private List<Card> cards;
	 private List<Player>players = new ArrayList<Player>();
	 private Map<String, List<Card>> cardsPlayerMap= new HashMap<String, List<Card>>();

     private int currentPlayerIdx = 0;

     private static final int numberOfCardsPerPlayer  = 3;

     private int numberOfPlayers = 4;
     public int getNumberOfPlayers()
     {
             return numberOfPlayers;
     }

     public List<Player> getPlayers()
     {
             return players;
     }

     public CardPlay()
     {
             cards = Card.getPackOfCards();
     }
     public void shuffleCards(List<Player> plys){
    	 this.players = plys;
    	 Card.shuffleCards(cards);
    	 if (cardsPlayerMap.size() == 0)
             cardsPlayerMap.clear();
     }
     public void distributeCardsForPlayers(List<Player> plys)
     {
          /**   this.players = plys;
             Card.shuffleCards(cards);
             if (cardsPlayerMap.size() == 0)
                     cardsPlayerMap.clear();**/

             int m = 0;
             for (Player pl : players)
             {
            	 System.out.println("Enter the Player Name");
            	 Scanner pName = new Scanner(System.in);
            	 pl.setPlayerName(pName.nextLine());
            	 
                     pl.setPoints(0);
                     List<Card> cds = new ArrayList<Card>();
                     int cardLimit = m + numberOfCardsPerPlayer;
                     for (int i = m; i < cardLimit; i++)
                     {
                             cds.add(cards.get(i));
                     }
                     m = cardLimit;
                     cardsPlayerMap.put(pl.getPlayerName().toString(), cds);
             }
             System.out.println(cardsPlayerMap);
     }
     @Override
     public void playGame(int numberOfPlayers)
     {
             this.numberOfPlayers = numberOfPlayers;
             createMultipleUser(numberOfPlayers);
             int i = 0;
             System.out.println("Game Started.....  ");
             List<Card> selCards = new ArrayList<Card>();
             Card maxCard = null;
             Player maxPlayer = new Player(0);
            
             for (int j = 0; j < numberOfCardsPerPlayer; j++)
             {
                     int s = 0;
                     do
                     {
                             Player player = getNextPlayer();
                             System.out.println("1. Shuffle  \n2. Stop Game");
                             System.out.println("Chance for Player..." + player.getPlayerId());
                            System.out.print("Please provide your option : ");
                             Scanner in = new Scanner(System.in);
                             i = in.nextInt();
                             switch (i)
                             {
                                     case 1:
                                    	// distributeCardsForPlayers(players);
                                    	    shuffleCards(players);
                                    	     List<Card> lst=cardsPlayerMap.get(player.getPlayerName());
                                             Card c = cardsPlayerMap.get(player.getPlayerName()).get( 0);
                                             System.out.println("Card Selected -> " + lst.toString());
                                             Card card1=lst.get(0);
                                             Card card2=lst.get(1);
                                             Card card3=lst.get(2);
                                             
                                             String s1=card1.getCdNumber().toString();
                                             String s2=card2.getCdNumber().toString();
                                             String s3=card3.getCdNumber().toString();
                                             int cardVals1=0;
                                             int cardVals2=0;
                                             int cardVals3=0;
                                            
                                             if(s1=="TWO"){
                                            	 cardVals1=2;
                                             }else if(s1=="THREE"){
                                            	 cardVals1=3;
                                             }
                                             else if(s1=="FOUR"){
                                            	 cardVals1=4;
                                             }
                                             else if(s1=="FIVE"){
                                            	 cardVals1=5;
                                            	 
                                             }else if(s1=="SIX"){
                                            	 cardVals1=6;
                                             }else if(s1=="SEVEN"){
                                            	 cardVals1=7;
                                            	 
                                             }else if(s1=="EIGHT"){
                                            	 cardVals1=8;
                                            	 
                                             }else if(s1=="NINE"){
                                            	 cardVals1=9;
                                            	 
                                             }else if(s1=="TEN"){
                                            	 cardVals1=10;
                                             }
                                             else if(s1=="QUEEN"){
                                            	 cardVals1=11;
                                             }
                                             else if(s1=="KING"){
                                            	 cardVals1=12;
                                             }
                                             else if(s1=="ACE"){
                                            	 cardVals1=13;
                                             }
                                             if(s2=="TWO"){
                                            	 cardVals2=2;
                                             }else if(s2=="THREE"){
                                            	 cardVals2=3;
                                             }
                                             else if(s2=="FOUR"){
                                            	 cardVals2=4;
                                             }
                                             else if(s2=="FIVE"){
                                            	 cardVals2=5;
                                            	 
                                             }else if(s2=="SIX"){
                                            	 cardVals2=6;
                                             }else if(s2=="SEVEN"){
                                            	 cardVals2=7;
                                            	 
                                             }else if(s2=="EIGHT"){
                                            	 cardVals2=8;
                                            	 
                                             }else if(s2=="NINE"){
                                            	 cardVals2=9;
                                            	 
                                             }else if(s2=="TEN"){
                                            	 cardVals2=10;
                                             }
                                             else if(s2=="QUEEN"){
                                            	 cardVals2=11;
                                             }
                                             else if(s2=="KING"){
                                            	 cardVals2=12;
                                             }
                                             else if(s2=="ACE"){
                                            	 cardVals2=13;
                                             }
                                             if(s3=="TWO"){
                                            	 cardVals3=2;
                                             }else if(s3=="THREE"){
                                            	 cardVals3=3;
                                             }
                                             else if(s3=="FOUR"){
                                            	 cardVals3=4;
                                             }
                                             else if(s3=="FIVE"){
                                            	 cardVals3=5;
                                            	 
                                             }else if(s3=="SIX"){
                                            	 cardVals3=6;
                                             }else if(s3=="SEVEN"){
                                            	 cardVals3=7;
                                            	 
                                             }else if(s3=="EIGHT"){
                                            	 cardVals3=8;
                                            	 
                                             }else if(s3=="NINE"){
                                            	 cardVals3=9;
                                            	 
                                             }else if(s3=="TEN"){
                                            	 cardVals3=10;
                                             }
                                             else if(s3=="QUEEN"){
                                            	 cardVals3=11;
                                             }
                                             else if(s3=="KING"){
                                            	 cardVals3=12;
                                             }
                                             else if(s3=="ACE"){
                                            	 cardVals3=13;
                                             }
                                             if(s1==s2 && s2==s3){
                                            	 if (maxPlayer.getPlayerId() > 0)
                                                     maxPlayer.setPoints((maxPlayer.getPoints()) + 5);
                                             }
                                             int[] test = new int[] {cardVals1,cardVals2,cardVals3};
                                             Arrays.sort(test);
                                             for (int k = 0; k < test.length - 1; k++) {
                                               if (test[k] + 1 != test[k + 1]) {
                                                 // Not sequential
                                               }else{
                                            	   maxPlayer.setPoints((maxPlayer.getPoints()) + 3);
                                               }
                                             }
                                           
                                             break;
                                     case 2:
                                             return;
                             }

                             System.out.println();
                             s++;
                     } while (s < players.size());
                   /**  if (maxPlayer.getPlayerId() > 0)
                             maxPlayer.setPoints((maxPlayer.getPoints()) + 1);**/
                     maxCard = null;
                     maxPlayer = null;
                     displayScores();
             }
     }
     private void displayScores()
     {
             for (Player pl : players)
             {
                     System.out.println("Player " + pl.getPlayerId() + " Score -> " + pl.getPoints());
             }

     }
     private void displayCardsForPlayer(Player pl)
     {
             int cards = cardsPlayerMap.get(pl).size();
             for (int i = 0; i < cards;)
             {
                     System.out.print((++i) + " ");
             }
     }
     public void displayWinners()
     {
             
     }
     private void createMultipleUser(int j)
     {
             if (players.size() != 0)
             {
                     players.clear();
             }

             for (int i = 0; i < j; i++)
             {
                     int id = i + 1;
                     Player usr = new Player(id);
                     players.add(usr);
             }
             distributeCardsForPlayers(players);
     }
     private Player getNextPlayer()
     {

             Player p = null;
             if (currentPlayerIdx == players.size())
             {
                     currentPlayerIdx = 1;
                     p = players.get(0);
             }
             else
             {
                     p = players.get(currentPlayerIdx);
                     currentPlayerIdx++;
             }

             return p;
     }

	@Override
	public void showWinners() {
		Collections.sort(players);
        int maxPoints = 0;
        Map<String, List<Player>> playerPointsMap = new TreeMap<String, List<Player>>();
        for (Player p : players)
        {

                maxPoints = p.getPoints();
                if (playerPointsMap.get(maxPoints + "") != null)
                {
                        List<Player> lst = playerPointsMap.get(maxPoints + "");
                        lst.add(p);
                        playerPointsMap.put(maxPoints + "", lst);
                }
                else
                {
                        List<Player> lst = new ArrayList<Player>();
                        lst.add(p);
                        playerPointsMap.put(maxPoints + "", lst);
                }
        }
       
        String pts = new Integer(players.get(players.size() - 1).getPoints()).toString();
        if (playerPointsMap.get(pts) != null && playerPointsMap.get(pts).size() > 1)
        {
                System.out.println("Its a draw among the following players ");
                for (Player p : players)
                {
                        System.out.println("Player -> " + p.getPlayerId());
                }
        }
        else if (playerPointsMap.get(pts) != null)
        {
                System.out.println("And the winner is :");
                System.out.println("Player -> " + playerPointsMap.get(pts).get(0).getPlayerId());
        }
		
	}


              
}
