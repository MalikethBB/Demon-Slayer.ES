package com.example.demonslayer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Person;

public class App 
{
    private static final Logger logger=LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");

        Person tanjiro = new Person("Tanjiro", 15);
        Person nezuko = new Person("Nezuko", -5);
    }
}
