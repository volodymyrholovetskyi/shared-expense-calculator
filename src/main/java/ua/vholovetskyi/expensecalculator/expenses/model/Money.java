package ua.vholovetskyi.expensecalculator.expenses.model;

import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
import java.util.Currency;

@Embeddable
public class Money {
    private BigDecimal amount;
    private Currency currency;

    public Money() {
    }
    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
