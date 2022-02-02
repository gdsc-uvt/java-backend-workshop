DROP TABLE IF EXISTS USER;
DROP TABLE IF EXISTS PRODUCT;
DROP TABLE IF EXISTS STORE;
DROP TABLE IF EXISTS seq;

CREATE TABLE USER (
    ID  BIGINT(20) NOT NULL,
    DATABASE_VERSION BIGINT(20) NOT NULL,
    CREATE_ON   DATETIME,
    UPDATED_ON  DATETIME,
    USERNAME    VARCHAR(64) NOT NULL,
    PASSWORD    VARCHAR(64) NOT NULL,

    PRIMARY KEY (ID)
);

CREATE TABLE STORE (
    ID  BIGINT(20) NOT NULL,
    DATABASE_VERSION BIGINT(20) NOT NULL,
    CREATE_ON   DATETIME,
    UPDATED_ON  DATETIME,
    NAME        VARCHAR(64) NOT NULL,

    PRIMARY KEY (ID)
);

CREATE TABLE PRODUCT (
    ID  BIGINT(20) NOT NULL,
    DATABASE_VERSION BIGINT(20) NOT NULL,
    CREATE_ON   DATETIME,
    UPDATED_ON  DATETIME,
    NAME        VARCHAR(64) NOT NULL,
    STORE_ID    BIGINT(20),

    PRIMARY KEY (ID),
    FOREIGN KEY (STORE_ID) REFERENCES STORE(ID)
);

CREATE TABLE seq (
    next_val BIGINT(20) DEFAULT NULL
) ENGINE = InnoDB
 DEFAULT CHARSET = utf8;

INSERT INTO seq(next_val) value (739816232)