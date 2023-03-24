package assignment;

public class PriceList {
    private int price;


    public int pricePerCopy(int numberOfCopies) {
        if (numberOfCopies >= 1 && numberOfCopies <= 4) {
            return price = numberOfCopies * 2000;

        } else if (numberOfCopies >= 5 && numberOfCopies <= 9) {
            return price = numberOfCopies * 1800;

        } else if (numberOfCopies >= 10 && numberOfCopies <= 29) {
            return price = numberOfCopies * 1600;

        } else if (numberOfCopies >= 30 && numberOfCopies <= 49) {
            return price = numberOfCopies * 1500;

        } else if (numberOfCopies >= 50 && numberOfCopies <= 99) {
            return price = numberOfCopies * 1300;

        } else if (numberOfCopies >= 100 && numberOfCopies <= 199) {
            return price = numberOfCopies * 1200;

        } else if (numberOfCopies >= 200 && numberOfCopies <= 499) {
            return price = numberOfCopies * 1100;

        }
        if (numberOfCopies >= 500) {
            return price = numberOfCopies * 1000;

        }
        return price;
    }
}
