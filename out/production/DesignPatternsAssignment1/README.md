# Designmönster inlämning 1

## What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?

The main method will break, since it uses the method trimToSize() that doesn't exist in LinkedList.

## Think about the method calls in main - does trimToSize() exist in LinkedList?

See above.

## Should Main know about what concrete type of List Storage provides?

No, the main method shouldn't have to care at all about its implementation.

## Make a UML diagram showing the inheritance tree (you don't need to be specific)

+-------------+   
|  Employee   |   
+-------------+   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&darr;   
+-------------+   
|  Engineer  |   
+-------------+   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&darr;   
+-------------+   
|  Manager    |   
+-------------+   

The significance here lies in the fact that employee is on top and that the others inherit from it.

## Is it possible in this design for an Engineer to also become a Manager?

No, since they both have a common parent and are therefore of the same type (an employee).

## If you want a removeRole(Role) method, how do you have to change the Role class?

Implement an equals method that returns true if the names match.