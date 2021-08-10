package logger.controllers;

import logger.Interfaces.Appender;
import logger.Interfaces.Logger;
import logger.enums.ReportLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractLogger implements Logger {
    private List<Appender> appenders;

    public AbstractLogger(Appender... appenders){
        this.appenders = new ArrayList<> (Arrays.asList(appenders));
    }

    @Override
    public void logInfo(String date, String message) {
        callAllAppenders(date, message, ReportLevel.INFO);
    }

    @Override
    public void logWarning(String date, String message) {
        callAllAppenders(date, message, ReportLevel.WARNING);
    }

    @Override
    public void logError(String date, String message) {
        callAllAppenders(date, message, ReportLevel.ERROR);
    }

    @Override
    public void logCritical(String date, String message) {
        callAllAppenders(date, message, ReportLevel.CRITICAL);
    }

    @Override
    public void logFatal(String date, String message) {
        callAllAppenders(date, message, ReportLevel.FATAL);
    }

    private void callAllAppenders(String date, String message, ReportLevel reportLevel) {
        for (Appender appender : appenders) {
            if (appender.getReportLevel().ordinal() <= reportLevel.ordinal()){

                appender.append(date, reportLevel, message);
            }
        }

    }

    @Override
    public void addAppender(Appender appender) {
        this.appenders.add(appender);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Logger info")
                .append(System.lineSeparator());
        builder.append(this.appenders.stream()
                        .map(Appender::toString)
                .collect(Collectors.joining(System.lineSeparator()))
        );


        return builder.toString();

    }
}
