--liquibase formatted sql
--changeset sayed:20240329_product_table
CREATE SEQUENCE product_id_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE product
(
    id                BIGINT                 NOT NULL DEFAULT NEXTVAL('product_id_sequence'),
    name              VARCHAR(255)           NOT NULL,
    price             DECIMAL(10, 2)         NOT NULL,
    category_id       BIGINT                 NOT NULL,
    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,

    CONSTRAINT product_id_pk PRIMARY KEY (id),
    CONSTRAINT product_category_id_fk FOREIGN KEY (category_id) REFERENCES category (id),
    CONSTRAINT product_name_uq UNIQUE (name)
);