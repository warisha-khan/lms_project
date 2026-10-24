
package com.hitms.lms;

import java.io.IOException;
import java.util.logging.*;

public class AppLogger {
    private static final Logger LOGGER =
            Logger.getLogger(AppLogger.class.getName());

    public static void main(String[] args) throws IOException {
        Logger rootLogger = Logger.getLogger("");
        FileHandler handler = new FileHandler("app.log", true);
        handler.setFormatter(new SimpleFormatter());
        rootLogger.addHandler(handler);
        LOGGER.setLevel(Level.INFO);

        LOGGER.info("Starting process...");
        LOGGER.info("Step completed");

        handler.close();
    }
}
