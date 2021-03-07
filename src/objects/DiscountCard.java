package objects;

import exceptions.NumberNotValidException;

public abstract class DiscountCard {

    private double turnover, valueOfPurchase;

    public DiscountCard(double turnover, double valueOfPurchase) throws NumberNotValidException {
        setTurnover(turnover);
        setValueOfPurchase(valueOfPurchase);

    }

    public DiscountCard() {
    }

    ;
    
    public DiscountCard(DiscountCard d) {
        this.turnover = d.turnover;
        this.valueOfPurchase = d.valueOfPurchase;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) throws NumberNotValidException {
        if (turnover >= 0) {
            this.turnover = turnover;
        } else {
            throw new NumberNotValidException("Invalid number! Please enter a number larger than 0 for your turnover!");
        }
    }

    public double getValueOfPurchase() {
        return valueOfPurchase;
    }

    public void setValueOfPurchase(double valueOfPurchase) throws NumberNotValidException {
        if (valueOfPurchase >= 0) {
            this.valueOfPurchase = valueOfPurchase;
        } else {
            throw new NumberNotValidException("Invalid number! Please enter a number larger than 0 for your value of pruchase!");
        }
    }

    @Override
    public String toString() {
        return "DiscountCard{" + "turnover=" + turnover + ", valueOfPurchase=" + valueOfPurchase + '}';
    }

}
