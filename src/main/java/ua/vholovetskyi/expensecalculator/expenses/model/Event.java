package ua.vholovetskyi.expensecalculator.expenses.model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private List<Expense> expenses = new ArrayList<>();
    private EventStatus status;
    private LocalDateTime create;
    private LocalDateTime update;
}
