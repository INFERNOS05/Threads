// Class implementing Runnable interface for multithreaded execution
public class MyRunnable implements Runnable {
    // Task identifier for distinguishing between multiple threads
    private String taskName;

    // Constructor to initialize task name
    public MyRunnable(String taskName) {
        this.taskName = taskName;
    }

    // The run() method contains the code that will be executed when the thread starts
    public void run() {
        // Loop to simulate repetitive task execution
        for (int i = 1; i <= 5; i++) {
            // Print the task name and current iteration count
            System.out.println(taskName + " - Count: " + i);

            try {
                // Pause thread execution for 700 milliseconds (0.7 seconds)
                // to simulate time-consuming task or delay between operations
                Thread.sleep(700);
            } catch (InterruptedException e) {
                // Handle interruption during sleep (e.g., when thread is interrupted)
                System.out.println(taskName + " interrupted.");
            }
        }
    }
}

