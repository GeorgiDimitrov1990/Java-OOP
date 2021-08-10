package logger.controllers;

import logger.Interfaces.Appender;
import logger.Interfaces.File;
import logger.Interfaces.Layout;
import logger.enums.ReportLevel;

public class FileAppender extends AbstractAppender {
    private File file;

    public FileAppender(ReportLevel reportLevel,Layout layout) {
        super(reportLevel,layout);
        this.file = new LogFile();
    }

    @Override
    protected String getType() {
        return "FileAppender";
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        String format = super.getLayout().format(date, reportLevel, message);
        this.file.write(format);
        this.incrementAppendCount();
    }

    @Override
    public String toString() {
        return super.toString() + ", File size: " + this.file.getSize();
    }
}
