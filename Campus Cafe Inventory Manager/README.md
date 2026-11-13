##What did you predict for Warmup.java, and what did it actually print? Explain the lines that surprised you.
*I predicted the Same Output i.e 7 5.0 -126 from the Warmup.Java*

##What is the difference between the static variable totalProducts and the instance variable name?
*totalProducts is a static variable, meaning only one copy is shared among all instances of the Product class to keep a running count of every object created by the constructors. On the other hand name is an instance variable i.e. every Product object gets its own separate copy of name so each product can store its own distinct title.*

##What does the copy constructor do, and why does changing p2.name not change p1.name?
*The copy constructor creates a new Product object by copying the name, price, and quantity values from an existing Product object and incrementing totalProducts. Changing p2.name does not affect p1.name because p1 and p2 are two separate objects stored in different memory locations, and in Java, reassigning a String variable simply points it to a new string without modifying the original object's data.*

##Why does Java force you to write (int) average when converting a double to an int, and what happens to the decimal part?
*It’s because converting a double to an int shrinks the data size and loses decimal precision. During the conversion, everything after the decimal point is completely truncated rather than rounded for e.g 85.9 simply becomes 85.*
