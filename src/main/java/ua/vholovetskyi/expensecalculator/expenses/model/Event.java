package ua.vholovetskyi.expensecalculator.expenses.model;
import jakarta.persistence.*;
import ua.vholovetskyi.expensecalculator.participant.model.Group;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "event_id")
    private List<Expense> expenses = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private EventStatus status;
    @OneToOne
    private Group group;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public Event() {
    }

    public Event(Long id, String name, List<Expense> expenses, EventStatus status, Group group) {
        this.id = id;
        this.name = name;
        this.expenses = expenses;
        this.status = status;
        this.group = group;
        this.createDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
    }
}
