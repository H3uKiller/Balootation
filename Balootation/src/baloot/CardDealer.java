
package baloot;

import java.util.ArrayList;

/**
 *
 * @author RedDragon
 */
public class CardDealer {
    
    
    public static CardHolder dealCardsNormal(ArrayList<Card> cards, int startDealingFromPlayer){
        
        ArrayList<ArrayList<Card>> dealedCards = new ArrayList<ArrayList<Card>>();
        
        dealedCards.add(new ArrayList<Card>());
        dealedCards.add(new ArrayList<Card>());
        dealedCards.add(new ArrayList<Card>());
        dealedCards.add(new ArrayList<Card>());
        
        int nextCardToDealIndex = 0;
        for (int i = 0; i < 4; i++) {
            startDealingFromPlayer = (startDealingFromPlayer + 1) % 4;
            switch(startDealingFromPlayer){
                case 0: 
                    
                    dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    break;
                case 1:  
                    
                    dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    break;
                case 2:  
                    
                    dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    break;
                case 3:  
                    
                    dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    break;
            }
        }
        
        
        for (int player = 0; player < 4; player++) {
            startDealingFromPlayer = (startDealingFromPlayer + 1) % 4;
            switch(startDealingFromPlayer){
                case 0: 
                    
                    dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    break;
                case 1:  
                    
                    dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    break;
                case 2:  
                    
                    dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    break;
                case 3:  
                    
                    dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    break;
            }
        }
        
        
        return new CardHolder(dealedCards);
    }
    
    public static void dealRestOfCardsNormal(CardHolder cardHolder, ArrayList<Card> cards, int startDealingFromPlayer, int boughtByPlayer){
        ArrayList<ArrayList<Card>> dealedCards = cardHolder.getCardsAll();
        int nextCardToDealIndex = 20;
        
        switch(boughtByPlayer){
            case 0:
                dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                break;
            case 1:
                dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                break;
            case 2:
                dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                break;
            case 3:
                dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                break;
            default:
                System.out.println("Dealing cards: invalid bought by player number...");
        }
        
        for (int i = 0; i < 4; i++) {
            startDealingFromPlayer = (startDealingFromPlayer + 1) % 4;
            switch(startDealingFromPlayer){
                case 0:                     
                    dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    if(boughtByPlayer != 0)
                        dealedCards.get(0).add(cards.get(nextCardToDealIndex++));
                    break;
                case 1:  
                    dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    if(boughtByPlayer != 1)
                        dealedCards.get(1).add(cards.get(nextCardToDealIndex++));
                    break;
                case 2:  
                    dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    if(boughtByPlayer != 2)
                        dealedCards.get(2).add(cards.get(nextCardToDealIndex++));
                    break;
                case 3:                      
                    dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    if(boughtByPlayer != 3)
                        dealedCards.get(3).add(cards.get(nextCardToDealIndex++));
                    break;
            }
        }
    }
    
    
    
}
