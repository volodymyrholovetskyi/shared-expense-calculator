package ua.vholovetskyi.expensecalculator.participant.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "group")
public class Group {

    public Group() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Participant> participants;

    public Group(String name, List<Participant> participants) {
        this.name = name;
        this.participants = participants;
    }
}
