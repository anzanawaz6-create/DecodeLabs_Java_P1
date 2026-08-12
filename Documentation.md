# Project 1 — Number Guessing Game

## 1. Project Overview

The Number Guessing Game is a console-based Java application developed as Project 1 for the DecodeLabs Java Programming Internship (Batch 2026).

The program generates a random number between 1 and 100. The user has three attempts to guess the correct number. After each incorrect guess, the program provides feedback to help the user determine whether the guess is too high or too low.

## 2. Objectives

- To practice basic Java programming concepts.
- To implement loops and conditional statements.
- To generate random numbers using Java.
- To handle user input using Scanner.
- To implement exception handling.
- To develop a simple interactive console-based game.

## 3. Technologies Used

- **Programming Language:** Java
- **Random Number Generation:** `java.util.Random`
- **User Input:** `java.util.Scanner`
- **Exception Handling:** `InputMismatchException`

## 4. Features

### Random Number Generation
The program generates a random number between 1 and 100.

### Limited Attempts
The user gets a maximum of three attempts to guess the number.

### Guess Feedback
The program tells the user whether the guess is **Too High**, **Too Low**, or **Correct**.

### Input Validation
The program handles invalid input using `InputMismatchException`.

## 5. Concepts Used

- Variables and data types
- `if-else` conditional statements
- Loops
- `Random` class
- `Scanner` class
- Exception handling
- User input
- Basic program logic

## 6. Program Flow

1. Generate a random number between 1 and 100.
2. Ask the user to enter a guess.
3. Compare the guess with the generated number.
4. Display appropriate feedback.
5. Allow the user to try again if the guess is incorrect.
6. Stop when the user guesses correctly or uses all three attempts.
7. Display the final result.

## 7. Screenshots

### Game Start
![Game Start](screenshots/game-start.png)

### Guess Feedback
![Guess Feedback](screenshots/guess-feedback.png)


### Invalid Input
![Invalid Input](screenshots/invalid-input.png)

## 8. How to Run

Compile the Java file:

```bash
javac DecodeLabs_Java_P1.java
