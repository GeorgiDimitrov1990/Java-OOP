package logger.controllers;

import logger.Interfaces.Appender;
import logger.Interfaces.AppenderFactory;
import logger.Interfaces.Layout;
import logger.Interfaces.LayoutFactory;

public class FactoryRepository {
    private static AppenderFactory appenderFactory;
    private static LayoutFactory layoutFactory;

    private FactoryRepository() {
    }

    public static AppenderFactory getAppenderFactory(){
        if (appenderFactory == null){
            return appenderFactory = new AppenderWorkshop();
        }
        return appenderFactory;
    }

    public static LayoutFactory getLayoutFactory(){
        if (layoutFactory == null){
            return layoutFactory = new LayoutWorkshop();
        }
        return layoutFactory;
    }
}
