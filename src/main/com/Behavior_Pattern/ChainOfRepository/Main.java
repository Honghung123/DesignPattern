package main.com.Behavior_Pattern.ChainOfRepository;

public class Main {
    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger); 

        return consoleLogger;
    }

    public static void main(String args[]) {
 
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        System.out.println("------");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
        System.out.println("------");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
        System.out.println("------");
        chainLogger = chainLogger.Next();
        chainLogger.logMessage(Logger.DEBUGINFO, "This is a LINKED LIST");
    }
}
