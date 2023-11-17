package ua.vholovetskyi.expensecalculator.participant.model;

import jakarta.persistence.*;

@Entity
@Table(name = "group")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
