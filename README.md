# Threads
# Java Multithreading Demonstration Using Thread and Runnable

## Author Information
- **Name**: Sehajdeep Singh Sikka
- **PRN**: 23070126119
- **Batch**: AIML B2

## Project Description
This project demonstrates the concept of multithreading in Java using two approaches:
1. Extending the `Thread` class.
2. Implementing the `Runnable` interface.

It showcases how both methods work, how threads can be started and synchronized using `.start()` and `.join()`, and the benefits of multithreading in concurrent programming.

## Technologies Used
- Java (JDK 17 or higher)

## Key Concepts Covered
- Multithreading
- `Thread` class usage
- `Runnable` interface usage
- Thread creation and execution
- Thread synchronization using `.join()`
- Thread sleeping and interruption handling

## Code Structure
The program consists of the following classes:

1. **Main**: This is the entry point of the application. It creates an instance of `ThreadManager` and calls the `runAllThreads` method to start the threads.
2. **ThreadManager**: Manages the execution of multiple threads. It demonstrates both approaches of creating threads (`Thread` and `Runnable`).
3. **MyThread**: A custom class extending the `Thread` class to demonstrate multithreading by directly extending `Thread`.
4. **MyRunnable**: A custom class implementing the `Runnable` interface to demonstrate multithreading using `Runnable`.

## Explanation of the Code

### 1. Main Class:
- The `Main` class contains the `main` method, which serves as the entry point for the program.
- It creates an instance of `ThreadManager` and calls the `runAllThreads` method to start the threads.
- The program demonstrates the creation of threads by using both `Thread` class and `Runnable` interface.

### 2. ThreadManager Class:
- **runAllThreads()**: This method starts two threads: one using the `Thread` class and the other using the `Runnable` interface. It also waits for both threads to finish using the `.join()` method to ensure synchronization.

### 3. MyThread Class:
- A custom class that extends the `Thread` class. It overrides the `run()` method to define the task the thread will execute.
- It prints the task name and count for 5 iterations, pausing for 500 milliseconds between each count.

### 4. MyRunnable Class:
- A custom class that implements the `Runnable` interface. It defines the `run()` method to specify the task the thread will execute.
- It prints the task name and count for 5 iterations, pausing for 700 milliseconds between each count.

## How to Run
1. Compile all `.java` files.
2. Run the `Main.java` class to execute the program.

## Sample Output
=== Starting Threads ===
Thread-Class - Count: 1
Runnable-Interface - Count: 1
Thread-Class - Count: 2
Runnable-Interface - Count: 2
Thread-Class - Count: 3
Runnable-Interface - Count: 3
Thread-Class - Count: 4
Runnable-Interface - Count: 4
Thread-Class - Count: 5
Runnable-Interface - Count: 5
=== All Threads Finished ===


## Learning Outcome
- Understanding of how to manage multiple threads.
- Differences between extending `Thread` vs implementing `Runnable`.

## Future Improvements (Optional)
- Add thread priorities.
- Use a thread pool (`ExecutorService`).
- GUI-based control for thread execution.



