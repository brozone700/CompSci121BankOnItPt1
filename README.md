# CompSci121BankOnItPt1

```mermaid
classDiagram
    class HasMenu {
        <<interface>>
        +menu() String
        +start() void
    }

    class CheckingAccount {
        -double balance
        +CheckingAccount()
        +CheckingAccount(double balance)
        +main() void
        +menu() String
        +start() void
        +getBalance() double
        +getBalanceString() String
        +setBalance(double balance) void
        +checkBalance() void
        -getDouble() double
        +makeDeposit() void
        +makeWithdrawal() void
    }

    class SavingsAccount {
        -double interestRate
        +main() void
        +calcInterest() void
        +setInterestRate(double rate) void
        +getInterestRate() double
    }

    class User {
        <<abstract>>
        -String userName
        -String PIN
        +login() boolean
        +login(String userName, String PIN) boolean
        +setUserName(String userName) void
        +getUserName() String
        +setPIN(String PIN) void
        +getPIN() String
        +getReport()* String
    }

    class Customer {
        -CheckingAccount checking
        -SavingsAccount savings
        +main() void
        +Customer()
        +start() void
        +menu() String
        +changePIN() void
        +getReport() String
    }

    HasMenu <|.. CheckingAccount : implements
    HasMenu <|.. User : implements
    CheckingAccount <|-- SavingsAccount : extends
    User <|-- Customer : extends
```
