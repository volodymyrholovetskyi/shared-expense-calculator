package ua.vholovetskyi.expensecalculator.expenses.model;

import java.time.LocalDateTime;

public class Expense {
    private String name;
    private String description;
    private Money amount;
    private Long eventId;
    private LocalDateTime create;
    private LocalDateTime update;

}
