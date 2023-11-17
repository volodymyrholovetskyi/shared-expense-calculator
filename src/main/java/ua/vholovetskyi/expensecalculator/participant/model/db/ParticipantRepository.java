package ua.vholovetskyi.expensecalculator.participant.model.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.expensecalculator.participant.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
