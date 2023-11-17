--liquibase formatted sql
--changeset vholovetskyi:3

create table `event`
(
    id            BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name          VARCHAR(255) NOT NULL,
    description   VARCHAR(255) DEFAULT NULL,
    status        VARCHAR(255) NOT NULL,
    currency_code VARCHAR(3)   NOT NULL,
    end_date      DATE         NOT NULL,
    create_date   TIMESTAMP    NOT NULL,
    update_date   TIMESTAMP    NOT NULL
);