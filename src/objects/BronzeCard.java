package objects;

import exceptions.NumberNotValidException;

public class BronzeCard extends DiscountCard {
    
    public BronzeCard(double turnover, double valueOfPurchase) throws NumberNotValidException {
        super(turnover, valueOfPurchase);

    }

    public BronzeCard() {
    }

    public BronzeCard(DiscountCard d) throws NumberNotValidException {
        super(d.getTurnover(), d.getValueOfPurchase());
    }

}
