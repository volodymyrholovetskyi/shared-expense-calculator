package ua.vholovetskyi.expensecalculator.participant.model;

import java.util.List;

public class Group {

    private String name;
    private List<Participant> participants;

    public Group(String name, List<Participant> participants) {
        this.name = name;
        this.participants = participants;
    }
}
