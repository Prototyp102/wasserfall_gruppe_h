package dhbw.fowler2.theatre;

import java.util.List;

public class Invoice {

    // Test

    public String customer;
    public List<Performance> performances;

    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }
}
