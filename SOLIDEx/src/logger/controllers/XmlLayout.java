package logger.controllers;

import logger.Interfaces.Layout;
import logger.enums.ReportLevel;

public class XmlLayout implements Layout {
    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("<log>%n" +
                "<date>%s</date>%n" +
                "<level>%s</level>%n" +
                "<message>%s</message>%n" +
                "</log>", date, reportLevel, message);
    }

    @Override
    public String getType() {
        return "XmlLayout";
    }
}
