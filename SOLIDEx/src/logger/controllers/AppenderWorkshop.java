package logger.controllers;

import logger.Interfaces.Appender;
import logger.Interfaces.AppenderFactory;
import logger.Interfaces.Layout;
import logger.enums.ReportLevel;

public class AppenderWorkshop implements AppenderFactory {
    @Override
    public Appender produce(String type, ReportLevel reportLevel, Layout layout) {
       return switch(type){
           case "ConsoleAppender" -> new ConsoleAppender(reportLevel, layout);
           case "FileAppender" -> new FileAppender(reportLevel, layout);
           default -> throw new IllegalStateException("Not valid type of appender for " + type);
       };
    }
}
