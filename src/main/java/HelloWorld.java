import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void main(String[] args) {
        System.out.println("Running main method!");
        System.out.println("Logger object: " + logger);
        logger.debug("Debug message...");
    }
}
