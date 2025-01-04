# Account - Application for Bank Account and Money Transfer Simulation

## Description
The **Account** application simulates a simple bank account system. It allows creating an account with an owner, balance, and account number. The program also allows transferring money from the account, with the option to throw an exception if there are insufficient funds in the account. The exception is handled using a `try-catch` block, and the program prints out the current balance after the transaction attempt.

This application demonstrates basic exception handling in Java, specifically how to deal with a custom exception (`NotEnoughMoneyException`) and use a `finally` block to ensure that the account balance is always displayed.

## How the Program Works
1. **Account Class**:
   - The class has three fields: `owner` (the account owner's name), `balance` (the amount of money in the account), and `accountNumber` (the unique identifier for the account).
   - The constructor initializes these fields.
   - The `transfer(int amount)` method simulates transferring money from the account. If the transfer amount exceeds the available balance, it throws a custom exception `NotEnoughMoneyException`.
   
2. **Main Class**:
   - The program creates an `Account` object with an initial balance of 500.
   - The program attempts to transfer 600 from the account, which will trigger a `NotEnoughMoneyException` because the balance is insufficient.
   - The exception is caught in the `catch` block, and the error message along with the stack trace are displayed.
   - Regardless of success or failure, the `finally` block ensures that the account balance is printed out at the end.

## How to Run the Application

1. **Clone the repository to your computer:**
   ```bash
   git clone https://github.com/your-repository.git
