package logger.controllers;

import logger.Interfaces.Appender;
import logger.Interfaces.Layout;
import logger.enums.ReportLevel;

public class ConsoleAppender extends AbstractAppender{


    public ConsoleAppender(ReportLevel reportLevel, Layout layout) {
        super(reportLevel,layout);
    }

    @Override
    protected String getType() {
        return "ConsoleAppender";
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        System.out.println(super.getLayout().format(date, reportLevel,message));
        super.incrementAppendCount();
    }
}
