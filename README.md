CPEN 221 Lab 3: Matching Parentheses
===

The goal of this activity is to implement method(s) that can be used to verify if a `String` has matching opening and closing parentheses, especially when there can be more than one type of parentheses. Specifically, we will consider the case when there are three types of parentheses: `( ), { }, [ ]`. It is possible to nest different type of parentheses.

Examples:

* `5+6*(3-2.1)+[7-{3/2}]` has matching open and close parentheses.
* `ab(cd}` does not have matching open and close parentheses.
* `ab+(cd*{)` does not have matching open and close parentheses.
* `alpha[]({!(+)[]})` has matching open and close parentheses.


There is no preliminary code associated with this lab activity. You may want to create your own GitHub repository (does not have to be a private repo), clone it, and then add files to it and commit/push your work.

## Problem Solving

How would you solve the problem at hand? Think about the algorithm you may need without writing code. Then translate your ideas into a Java implementation.

## Testing

* What are good test cases to use?
* Can you write a few JUnit test cases for this task?
  - Remember that you may have to add JUnit to the Java build path in Eclipse or whatever IDE you are working with.
