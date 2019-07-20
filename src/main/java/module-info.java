module eu.flate.GameLibraryCurator {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.data.jpa;
    requires postgresql;
    requires spring.tx;
    requires spring.beans;
    requires java.sql;
    requires spring.webflux;
    requires spring.jdbc;
    requires spring.orm;
    requires jackson.annotations;

    exports eu.flate.glc.main;
}