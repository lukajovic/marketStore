package main;

import exceptions.NumberNotValidException;
import objects.BronzeCard;
import objects.GoldCard;
import objects.SilverCard;
import util.Util;

public class Main {
    
    public static void main(String[] args) throws NumberNotValidException {
        
        BronzeCard bronzeCard = new BronzeCard();
        bronzeCard.setTurnover(0);
        bronzeCard.setValueOfPurchase(150);
        SilverCard silverCard = new SilverCard();
        silverCard.setTurnover(600);
        silverCard.setValueOfPurchase(850);
        GoldCard goldCard = new GoldCard();
        goldCard.setTurnover(1500);
        goldCard.setValueOfPurchase(1300);
        
        System.out.println(Util.outputData(bronzeCard));
        System.out.println(Util.outputData(silverCard));
        System.out.println(Util.outputData(goldCard));
        
    }
    
}
