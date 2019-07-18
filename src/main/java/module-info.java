module eu.flate.GameLibraryCurator {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires spring.webflux;
    requires jackson.annotations;

    exports eu.flate.glc.main;
}