package models;

public class Card {

    private Double limit;

    public Card(Double limit) {
        this.limit = limit;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public void BuyRealized(double buy){
        limit -= buy;
    }
    @Override
    public String toString() {
        return "Saldo do cartão: " + limit;
    }
}
