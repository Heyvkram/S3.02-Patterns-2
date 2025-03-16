# IT ACADEMY BACKEND JAVA SPECIALIZATION

**SPRINT 3 TASK 2 - Design Patterns 2**

## Summary

This exercise delves deeper into software construction patterns. It focuses on implementing and understanding the Builder, Observer, and Callback design patterns in Java. The application demonstrates the use of these patterns in practical scenarios such as a pizza order management system, a stock market notification system, and a payment gateway simulation.

## Technologies

* Java
* Gradle
* Git
* GitHub

## How to run it

1.  **Clone the repository:**
    * Clone the repository to your local machine using Git.
2.  **Build the project:**
    * Navigate to the project directory and build the project using Gradle.
    * For example: `./gradlew build`
3.  **Run the application:**
    * Execute the `Main` class to run the program using Gradle.
    * For example: `./gradlew run`
4.  **Interact with the program:**

    * **Builder (Pizza Order System):**
        * The Main class will create and display pizza objects with different configurations (size, dough, toppings) using the Builder pattern.
    * **Observer (Stock Market Notification):**
        * The Main class will simulate a stock market agent notifying various stock agencies of changes in the stock market status.
    * **Callback (Payment Gateway Simulation):**
        * The Main class will simulate a shoe store using a payment gateway to process payments with different methods (credit card, PayPal, bank account), demonstrating the use of callbacks.

## Project Structure

* The project is built using Gradle.
* The Java code is located in the `src/main/java/com/example` directory.
* The `build.gradle` file contains the project's dependencies and build configurations.

## Notes

* This exercise emphasizes the importance of design patterns in building extensible and reusable software.
* The use of Gradle simplifies the build process.