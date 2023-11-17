package ua.vholovetskyi.expensecalculator.expenses.model;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Event {
    private String name;
    private String description;
    private List<Expense> expenses = new ArrayList<>();
    private EventStatus status;
    private LocalDateTime create;
    private LocalDateTime update;
}
