# Week-7-HW
Week 7 – OOP Fundamentals: Encapsulation
Problem 1: The Piggy Bank

Algorithm:

Start.
Create a PiggyBank class with private variables savings and a final id.
Initialize savings to 0 and assign the ID through the constructor.
Create a deposit() method that adds a positive amount to savings.
Create a withdraw() method that subtracts the amount only if it is positive and does not exceed the current savings.
Create a getSavings() method to return the current savings.
Create a getId() method to return the fixed ID.
Test deposits and withdrawals, including a withdrawal greater than the available savings.
Stop.

Commit Message: Add PiggyBank class with encapsulated savings and deposit/withdraw methods

Problem 2: The Quiz Scorecard

Algorithm:

Start.
Create a Scorecard class with a private Boolean array and a private counter.
Initialize the array with the fixed number of questions and set the counter to 0.
Create a recordAnswer() method that stores the result only if the array has space.
Increment the counter after recording each answer.
Create a getScore() method that counts the correct answers among the recorded results.
Return only the total score without exposing the private array.
Test the scorecard by recording correct and incorrect answers.
Stop.

Commit Message: Add Scorecard class with private results array and score calculation

Problem 3: The Nickname Tag

Algorithm:

Start.
Create a NameTag class with private final variables for the first name and last name.
Accept the full name through the constructor.
Split the full name into the first name and last name using a space.
Store both parts in the final variables.
Create a getNickname() method that combines the first name with the first letter of the last name followed by a period.
Return the generated nickname.
Ensure that the stored name cannot be changed after object creation.
Test with a full name such as "Maria Gomez".
Stop.

Commit Message: Add immutable NameTag class with nickname generation

Problem 4: The Locker Code

Algorithm:

Start.
Create a Locker class with a private combination code and a final locker number.
Initialize the locker number and combination code through the constructor.
Create a changeCode() method that accepts the current code and the new code.
Compare the entered current code with the stored combination code.
If the codes match, update the combination code and return success.
Otherwise, reject the change and keep the existing code unchanged.
Do not provide a getter for the combination code.
Test both valid and invalid code changes.
Stop.

Commit Message: Add Locker class with private combination code and secure code change

Concepts Practiced
Encapsulation and data hiding
Private instance variables
Constructors and object initialization
Controlled access through public methods
Validation of deposits and withdrawals
Private arrays and score calculation
Immutability using the final keyword
Secure state modification through validation
