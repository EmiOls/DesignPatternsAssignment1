# Designmönster inlämning 1

## What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?

The main method will break, since it uses the method trimToSize() that doesn't exist in LinkedList.

## Think about the method calls in main - does trimToSize() exist in LinkedList?

See above.

## Should Main know about what concrete type of List Storage provides?

No, the main method shouldn't have to care at all about its implmentation.
