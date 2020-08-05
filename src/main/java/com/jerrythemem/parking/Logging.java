package com.jerrythemem.parking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
    
    private static final Logger logger = LoggerFactory.getLogger(Logging.class);

    public static void main(String[] args) {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.error("Error message");
    }
}
