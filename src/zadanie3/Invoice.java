package zadanie3;

import java.math.BigDecimal;

public class Invoice {

    private String id;
    private BigDecimal amount;

    private Integer counter;

    public Invoice(String id, BigDecimal amount, Integer counter) {
        this.id = id;
        this.amount = amount;
        this.counter = counter;
    }
    public Invoice() {

    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{ID:" + id +
                ", AMOUNT: " + amount + "}";
    }
}
