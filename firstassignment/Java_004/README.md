# Java 004 Thread Control

We created an app which allowed us to run five threads automatically. As they run, they will periodically output messages. If the number1 is pressed, the 1st thread will be controlled(etc). 
If controlled, the user can either stop the thread, pause the thread, resume the thread, or set the thread as a priority.

## Procedures

To develop the application, the team started with a basic code that we wrote simultaneously. We created the object by instantiating the object type "Thread". In our thread class, we implemented the Runnable interface.
Next we created 5 thread objects in the Main class. Consequently, it was necessary to divide and conquer different sections that we would later assemble into a single application.
Desmond Yated was responsible for creating a way of implementing keypresses that would call the methods which would control the threads functions.
Busayomi Anifat Olayiwola was responsible for creating the methods that would change the thread's priorties.
Elbert Buchanan was responsible for creating the methods that would pause, resume anad permanantely stop the running threads. The Project manager, Charles Dunn supervised the team and ensured that the parts were assembled correctly. 
The team members all created working Proof of Concepts that would be incorporated into the final working application.

### Contributing Team Members
Charles Dunn
Elbert Buchanan
Desmond Yates
Busayomi Anifat Olayiwola

### Resources

  