package com.example.demonslayer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Person;

public final class App {

    private App() {
    }

    /** LOGGER for App class. */
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    /** Constant for Tanjiro's age. */
    private static final int TANJIRO_AGE = 15;

    /** Constant for Nezuko's age. */
    private static final int NEZUKO_AGE = -5;

    /**
     * Entry point for the application.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        LOGGER.trace("We've just greeted the user!");
        LOGGER.debug("We've just greeted the user!");
        LOGGER.info("We've just greeted the user!");
        LOGGER.warn("We've just greeted the user!");
        LOGGER.error("We've just greeted the user!");
        LOGGER.fatal("We've just greeted the user!");

        Person tanjiro = new Person("Tanjiro", TANJIRO_AGE);
        Person nezuko = new Person("Nezuko", NEZUKO_AGE);

        tanjiro.intro();
        nezuko.intro();
    }
}
