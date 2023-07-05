package com.endava.letskata.workshops.gdansk.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkshopsApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkshopsApp.class);

    public static void main(String[] args) {
        new WorkshopsApp().run();
    }

    void run() {
        LOGGER.info("Nothing to see here...");
    }
}