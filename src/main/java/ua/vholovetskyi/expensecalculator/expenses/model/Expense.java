package ua.vholovetskyi.expensecalculator.expenses.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Embedded
    private Money amount;
    @Column(name = "event_id")
    private Long eventId;
    private LocalDateTime create;
    private LocalDateTime update;

}
