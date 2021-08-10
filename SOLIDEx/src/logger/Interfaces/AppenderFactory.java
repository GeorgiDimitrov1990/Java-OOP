package logger.Interfaces;

import logger.enums.ReportLevel;

public interface AppenderFactory {
    Appender produce(String type, ReportLevel reportLevel, Layout layout);
}
