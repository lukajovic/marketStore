package objects;

import exceptions.NumberNotValidException;

public class GoldCard extends DiscountCard {

    public GoldCard(double turnover, double valueOfPurchase) throws NumberNotValidException {
        super(turnover, valueOfPurchase);
    }

    public GoldCard() {
    }

    public GoldCard(DiscountCard d) throws NumberNotValidException {
        super(d.getTurnover(), d.getValueOfPurchase());
    }

}
