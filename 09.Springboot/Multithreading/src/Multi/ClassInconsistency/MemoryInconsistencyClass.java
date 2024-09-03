package Multi.ClassInconsistency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MemoryInconsistencyClass {
    public static void main(String[] args) {
        Task task = new Task('w');
        Task task2 = new Task('r');
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(task);
        executorService.submit(task2);

    }
}


// In this program
/*
* The output of the code demonstrates a memory consistency issue known as a data race. Let's break down the code and explain why this issue occurs:

1. **Task Class**: This class implements the `Runnable` interface and contains a `run()` method that is executed by the threads. There are two instances of this class created in the `MemoryInconsistencyClass` main method, each with a different character parameter ('w' or 'r').

2. **Static Variable `count`**: The `Task` class contains a static variable `count`, which is initially set to 0. This variable is shared among all instances of the `Task` class.

3. **Writer Task (`'w'`)**: When the task is created with the character 'w', it enters a loop where it increments the `count` variable and prints a message indicating that it is writing data. This loop runs until `count` reaches 5.

4. **Reader Task (`'r'`)**: When the task is created with the character 'r', it enters a loop where it continuously checks if the `data` variable is different from the `count` variable. If it is, it updates `data` with the current value of `count` and prints a message indicating that it is reading data.

Now, let's analyze the output and the issue:

- The writer task starts first and begins incrementing the `count` variable. It prints messages indicating that it is writing data.
- Meanwhile, the reader task starts running. It continuously checks the `count` variable against its `data` variable. Since `count` is being incremented by the writer task, the reader task sees different values of `count` as it runs.
- However, there's no synchronization mechanism in place to ensure proper visibility of the `count` variable between threads. As a result, the reader task might see stale or inconsistent values of `count`, leading to unpredictable behavior.
- In the output, you can observe that the reader task initially reads `count` as 1. However, it doesn't update its `data` variable immediately because the writer task may be still updating `count`.
- After the writer task finishes and `count` reaches 5, the reader task catches up and starts reading `count` as 5.

This behavior showcases the memory inconsistency issue where different threads accessing shared data can observe inconsistent or stale values due to lack of proper synchronization. To fix this, you can use synchronization mechanisms like `synchronized` blocks or `volatile` keyword to ensure visibility and consistency of shared variables across threads.
* */



/*
* You're correct, my apologies for the oversight. Let's correct the explanation:

1. The output shows that the reader task prints the message "The system is reading in the data 1" only once, despite the writer task printing messages multiple times.

2. This behavior occurs because the reader task's loop condition (`if(data != count)`) is initially true when `count` is 1.
* Therefore, it enters the block and prints the message. However, once `data` is updated to 1,
* the loop condition becomes false since `count` is still 1. As a result, the reader task does not print any more messages even
* as `count` continues to increase.

3. This behavior highlights the issue of memory visibility between threads. The reader task reads `count` as 1 initially,
* but subsequent updates to `count` by the writer task are not visible to the reader task due to lack of synchronization.
*  As a result, the reader task does not detect further changes to `count`.

4. To resolve this issue and ensure proper memory visibility, synchronization mechanisms such as `synchronized` blocks or
* `volatile` variables can be used to coordinate access to shared data between threads.

Thank you for pointing out the discrepancy, and I appreciate the opportunity to clarify!
* */


// This problem can be solved when we will make the use of the volatile keyword in front of the variable that is incremented in the Task component