--liquibase formatted sql
--changeset sayed:20240329_category_table
CREATE SEQUENCE category_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE category
(
    id                BIGINT                 NOT NULL DEFAULT NEXTVAL('category_id_sequence'),
    name              VARCHAR(255)           NOT NULL,
    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,

    CONSTRAINT category_id_pk PRIMARY KEY (id),
    CONSTRAINT category_name_unique UNIQUE (name)
);