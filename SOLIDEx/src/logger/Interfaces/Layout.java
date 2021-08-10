package logger.Interfaces;

import logger.enums.ReportLevel;

public interface Layout {
    String format(String date, ReportLevel reportLevel, String message);

    String getType();
}
