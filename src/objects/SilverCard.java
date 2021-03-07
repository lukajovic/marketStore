package objects;

import exceptions.NumberNotValidException;

public class SilverCard extends DiscountCard {

    public SilverCard(double turnover, double valueOfPurchase) throws NumberNotValidException {
        super(turnover, valueOfPurchase);
    }

    public SilverCard() {
    }

    public SilverCard(DiscountCard d) throws NumberNotValidException {
        super(d.getTurnover(), d.getValueOfPurchase());
    }

}
