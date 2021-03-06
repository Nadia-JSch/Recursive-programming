# Recursive-programming

Exercising recursive thinking with Fibonacci numbers, calculating the greatest common divisor and replacing substrings.

## Description

Methods within the three files demonstrate simple cases where recursive logic applies.

### Recursion.java
Contains two recursive methods:
- revString(String text) that takes the string passed to it and reverses it by creating substrings for each recursive call made.
- fibonacci(int n) will print out the first n number of Fibonacci numbers (a number pattern starting from 0, where the following numbers are a sum of the previous two).

#### Screenshot
![reverse string and fibonacci screenshot](https://github.com/Nadia-JSch/Recursive-programming/blob/master/recursion%20screenshot.png)

### GCDRecursion.java
Finds the Greatest Common Divisor of two given numbers by using the Euclidean equation where the divisor becomes the dividend and the remainder becomes the new divisor in each recursive call. The number that doesn't have a remainder when dividing both numbers is returned.

#### Screenshot
![GCD output](https://github.com/Nadia-JSch/Recursive-programming/blob/master/GCD%20screenshot.png)

### SearchReplace.java
The user enters some text, and then chooses a part of that text to be replaced by a new substring. The method calls itself until the original text has all of the substring within it.

#### Screenshot
![search replace screenshot](https://github.com/Nadia-JSch/Recursive-programming/blob/master/search%20replace%20recursion%20screenshot.png)

## Author

Nadia Schmidtke [contact](https://nadia-jsch.github.io/Nadia-Schmidtke-Webpages/Contact.html)

## License

This project is licensed under the [GNU GENERAL PUBLIC LICENSE](https://github.com/Nadia-JSch/Recursive-programming/blob/master/LICENSE).
