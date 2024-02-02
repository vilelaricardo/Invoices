package invoice;

import java.util.Date;

public class Invoice {
    private Long id;
    private Date date;
    private double totalValue;

    public Invoice(Long id, Date date, double totalValue) {
        this.id = id;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}