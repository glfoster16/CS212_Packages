# Purpose
My CS 212 class introduces Java and a lot of the 
assignments and labs include getting input from the
command line. Error checking for variable types, bounds,
and if a number is positive/negative is very tedious, so
I wrote a package to help with that.

# Uses
The package has compatibility with ints, shorts, longs, doubles, floats, and strings.

The methods in this package allow for a single line to:
* Print a prompt to the command line
* Type check without crashing the program
* Check bounds on an inputted number
* Check sign of a number
  * Optional inclusion/exclusion of 0


Each call to a method does create a new scanner object
from the java.util.scanner class without freeing that memory. 
However, the JVM frees the memory during its garbage collection
processes.

# Rights
Anyone is free to use this whenever, for whatever purpose, and
as much as they would like. I have shared this with my professor to distribute to my peers
if he wishes.
