package nl.breun;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jOff {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        // Set initial log level
        Level level = Level.INFO;

        // Log a message
        logFooAtLevel(level);

        // User changes log level, intending to disable logging for this logger
        level = Level.OFF;

        // But this still logs a message
        logFooAtLevel(level);
    }

    private static void logFooAtLevel(Level level) {
        logger.atLevel(level).log("Foo");
    }
}
