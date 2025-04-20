// Custom thread class extending the Thread class for multithreading
public class MyThread extends Thread {
    // Name of the task/thread used for identification during output
    private String taskName;

    // Constructor to initialize the thread with a task name
    public MyThread(String taskName) {
        this.taskName = taskName;
    }

    // The run() method contains the logic that the thread will execute
    @Override
    public void run() {
        // Loop simulating a repetitive task (executed 5 times)
        for (int i = 1; i <= 5; i++) {
            // Print the task name along with the current iteration count
            System.out.println(taskName + " - Count: " + i);

            try {
                // Pause thread execution for 500 milliseconds (0.5 seconds)
                // This simulates time delay or processing time
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle the case when the thread is interrupted during sleep
                System.out.println(taskName + " interrupted.");
            }
        }
    }
}

