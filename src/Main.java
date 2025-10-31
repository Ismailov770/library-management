
public class Main {
    public static void main(String[] args) {
        LoggerService logger = new LoggerService();
        SchedulerService scheduler = new SchedulerService(logger);

        logger.log("INFO", "Logger service started");
        scheduler.startScheduler();

        System.out.println("✅ System started. Logs will appear in logs.txt");
    }
}
