Task notes: 

Task One: Create a superclass Parent with a method greet().

What makes a class a superclass (at least at this point and in this context) is its ability to inherit from it. So, to complete this task, I created a class called Parent and added the greet() method inside. This was pretty straightforward.

Task Two: Create a subclass Child that overrides Parent greet().

What makes a class a subclass is its ability to pull methods from its parent. In this task, I had to create the class Child (which extends from Parent) and add the Override so that the compiler knows that the Child greet() is different from the Parent greet().

Task Three: Perform Upcasting and Downcasting, demonstrating both concepts.

This is where it got a little hairy for me. Coding it was simple enough:
I created the theParent obj from the Child() 

But for the downcasting, I’m sure that I didn’t have to create a new method inside the Parent class, but IntelliJ kept prompting me to (I”m not confident in this yet - it’s on my study list).

Task Four: Use abstract classes to enforce a structure.
I like to think about this the same way I do character creation in D&D. You create a character and it will have the same types of stats, but how they are used will vary from class(job) to class. 


In this example, Shape would be the character at the large, while Rectangle and Circle are shapes with specific jobs and tools to do those jobs—that’s what I outline in the specific Rectangle and Circle Java classes.

Task Five: Use interfaces to define a contract for classes.
the difference between a abstract and an interface is that interfaces never see the light of day and only the subclasses can reach it. 



