import logger.Interfaces.*;
import logger.controllers.*;
import logger.enums.ReportLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       /* Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");*/

        var reader = new BufferedReader(new InputStreamReader(System.in));
        Logger logger = new MessageLogger();
        new EngineImpl(reader, logger).run();

        System.out.println(logger);


    }
}
