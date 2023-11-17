--liquibase formatted sql
--changeset vholovetskyi:1

create table `group`
(
    id            BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(255) NOT NULL
)