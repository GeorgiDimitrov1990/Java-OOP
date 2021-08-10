package logger.controllers;

import logger.Interfaces.Appender;
import logger.Interfaces.Logger;
import logger.enums.ReportLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageLogger extends AbstractLogger {
    public MessageLogger(Appender... appenders) {
        super(appenders);
    }
}
