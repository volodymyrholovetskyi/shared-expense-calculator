--liquibase formatted sql
--changeset vholovetskyi:2

create table `participant`
(
    id            BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name          VARCHAR(255) NOT NULL,
    last_name          VARCHAR(255) NOT NULL,
    email          VARCHAR(255) NOT NULL,
    phone          VARCHAR(255) NOT NULL,
    group_id       BIGINT NOT NULL,
    CONSTRAINT `fk_participant_group`
        FOREIGN KEY (`group_id`)
            REFERENCES `group` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE
)