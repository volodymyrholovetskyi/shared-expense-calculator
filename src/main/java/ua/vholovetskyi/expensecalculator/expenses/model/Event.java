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
    private EventStatus status;
    @OneToOne
    private Group group;
    private LocalDateTime create;
    private LocalDateTime update;

}
