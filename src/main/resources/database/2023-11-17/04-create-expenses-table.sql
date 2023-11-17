-- liquibase formatted sql
-- changeset vholovetskyi:4

create table `expenses`
(
    id          BIGINT        NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255)  NOT NULL,
    description VARCHAR(255)  NOT NULL,
    amount      DECIMAL(9, 2) NOT NULL,
    currency    CHAR(3)       NOT NULL,
    create_date DATETIME      NOT NULL,
    update_date DATETIME      NOT NULL,
    event_id    BIGINT        NOT NULL,
    CONSTRAINT `fk_expenses_event`
        FOREIGN KEY (`event_id`)
            REFERENCES `event` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE
)