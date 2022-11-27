package main.com.Behavior_Pattern.ChainOfRepository;

public abstract class Logger {
    public static int OUTPUTINFO = 1;
    public static int ERRORINFO = 2;
    public static int DEBUGINFO = 3;
    protected int levels;
    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String msg) {
        if (this.levels <= levels) {
            displayLogInfo(msg);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, msg); // Show message of next level if it is exists and higher
        }
    }
    
    public Logger Next() {
        return this.nextLevelLogger;
    }

    protected abstract void displayLogInfo(String msg);
}
