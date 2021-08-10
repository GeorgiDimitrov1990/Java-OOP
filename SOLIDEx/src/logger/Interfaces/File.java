package logger.Interfaces;

import logger.enums.ReportLevel;

public interface File {
    void write(String text);
    int getSize();
}
