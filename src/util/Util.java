package util;

import objects.BronzeCard;
import objects.DiscountCard;
import objects.GoldCard;
import objects.SilverCard;

public class Util {

    public static String outputData(DiscountCard d) {

        double total, valueOfPurchase;
        double discountRate = 0;
        double discount = 0;

        BronzeCard b = new BronzeCard();
        SilverCard s = new SilverCard();
        GoldCard g = new GoldCard();

        if (d.getClass() == b.getClass()) {

            if (d.getTurnover() < 100) {

                discountRate = Math.floor(discountRate * 100) / 100;
                discount = Math.floor(discount * 100) / 100;
                total = Math.floor(d.getValueOfPurchase() * 100) / 100;
                valueOfPurchase = Math.floor(d.getValueOfPurchase() * 100) / 100;

                return "Purchase value: " + "$" + valueOfPurchase + "\n" + "Discount rate: " + discountRate + "%" + "\n" + "Discount: " + "$" + discount + "\n" + "Total: " + "$" + total + "\n";

            } else if (d.getTurnover() >= 100 && d.getTurnover() <= 300) {
                discountRate = 1;
                discount = d.getValueOfPurchase() * discountRate / 100;
                discount = Math.floor(discount * 100) / 100;
                total = d.getValueOfPurchase() - discount;

                return "Purchase value: " + "$" + Math.floor(d.getValueOfPurchase() * 100) / 100 + "\n" + "Discount rate: " + discountRate + "%" + "\n" + "Discount: " + "$" + Math.floor(discount * 100) / 100 + "\n" + "Total: " + "$" + Math.floor(total * 100) / 100 + "\n";

            } else if (d.getTurnover() > 300) {
                discountRate = 2.5;
                discount = d.getValueOfPurchase() * discountRate / 100;
                total = d.getValueOfPurchase() - discount;
                return "Purchase value: " + "$" + Math.floor(d.getValueOfPurchase() * 100) / 100 + "\n" + "Discount rate: " + discountRate + "%" + "\n" + "Discount: " + "$" + Math.floor(discount * 100) / 100 + "\n" + "Total: " + "$" + Math.floor(total * 100) / 100 + "\n";

            }

        } else if (d.getClass() == s.getClass()) {

            discountRate = 2;

            if (d.getTurnover() > 300) {
                discountRate = 3.5;
                discount = d.getValueOfPurchase() * discountRate / 100;
                total = d.getValueOfPurchase() - discount;
                return "Purchase value: " + "$" + Math.floor(d.getValueOfPurchase() * 100) / 100 + "\n" + "Discount rate: " + discountRate + "%" + "\n" + "Discount: " + "$" + Math.floor(discount * 100) / 100 + "\n" + "Total: " + "$" + Math.floor(total * 100) / 100 + "\n";
            } else {
                discount = d.getValueOfPurchase() * discountRate / 100;
            }
            total = d.getValueOfPurchase() - discount;
            return "Purchase value: " + "$" + Math.floor(d.getValueOfPurchase() * 100) / 100 + "\n" + "Discount rate: " + discountRate + "%" + "\n" + "Discount: " + "$" + Math.floor(discount * 100) / 100 + "\n" + "Total: " + "$" + Math.floor(total * 100) / 100 + "\n";

        } else if (d.getClass() == g.getClass()) {

            discountRate = 2;

            int x = (int) d.getTurnover();
            int firstDigit = Integer.parseInt(Integer.toString(x).substring(0, 1));

            if (x >= 100) {
                for (int i = 0; i < 11; i++) {

                    if (x >= 1000) {
                        discountRate = 10;

                    } else if (firstDigit == i) {
                        discountRate = discountRate + i;
                    }

                }
            } else {
                discountRate = 2;
            }

            discount = d.getValueOfPurchase() * discountRate / 100;
            total = d.getValueOfPurchase() - discount;

            return "Purchase value: " + "$" + Math.floor(d.getValueOfPurchase() * 100) / 100 + "\n" + "Discount rate: " + discountRate + "%" + "\n" + "Discount: " + "$" + Math.floor(discount * 100) / 100 + "\n" + "Total: " + "$" + Math.floor(total * 100) / 100;
        }
        return "";
    }
;

}
