public class Logger {

    //Creating a private static variable to store the single object
    private static Logger instance;

    // Making the constructor private so no one can use "new Logger()"
    private Logger() {
        System.out.println("Logger initialized");
    } 
     
    //providing a public static method to get the instance of the Logger class.
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message){
        System.out.println(message);
    }
}
