// Class responsible for managing and executing multiple thread types
public class ThreadManager {

    // Method to demonstrate the use of both Thread and Runnable implementations
    public void runAllThreads() {
        System.out.println("=== Starting Threads ===");

        // Creating and starting a thread by extending the Thread class
        MyThread thread1 = new MyThread("Thread-Class");
        thread1.start();

        // Creating and starting a thread by passing a Runnable implementation
        Thread thread2 = new Thread(new MyRunnable("Runnable-Interface"));
        thread2.start();

        // Ensuring the main thread waits for both threads to finish execution
        try {
            thread1.join();  // Wait for thread1 to complete
            thread2.join();  // Wait for thread2 to complete
        } catch (InterruptedException e) {
            // Handle interruption during thread joining
            System.out.println("Main thread interrupted.");
        }

        System.out.println("=== All Threads Finished ===");
    }
}

