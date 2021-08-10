package logger.controllers;

import logger.Interfaces.Layout;
import logger.enums.ReportLevel;

public class SimpleLayout implements Layout {
    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s", date, reportLevel, message);
    }

    @Override
    public String getType() {
        return "SimpleLayout";
    }
}
