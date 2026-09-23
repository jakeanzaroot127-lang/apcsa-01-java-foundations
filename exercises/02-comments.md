# Exercise 5 — Comment Rescue

Below is a working method with no comments. It runs fine. It is also very hard to understand.

```java
// formula for remining balance of loan
public static double CalculateInterestEarned(double principal, int loanTerm, double interestRate) {
    //double stores an integer with decimals, while int stores a whole number
    double balance = principal;
    //for every run do this
    //Apply compound interest once for each year.
    for (int i = 0; i < loanTerm; i++) {
        balance = balance + (balance * interestRate);
    }
    //Return only the growth, excluding the original princpal.
    return balance - principal;
    //remember the closing bracket
}
```

## Part A — Figure out what it does

**1. What do you think `p`, `y`, and `r` represent?**

p is principal, y is the loan term, r is interest rate

**2. What does the method return?**

Total amount of interest 

**3. What would you rename each variable and the method itself?**

| Original | Better name |
|---|---|
| `calc` | CalculateInterestEarned |
| `p` | principal |
| `y` | loanTerm |
| `r` | interestRate |
| `t` | balance |

## Part B — Rewrite it

Rewrite the method with better names **and** comments. Remember the rule:

> **Bad comments explain *what*. Good comments explain *why*.**

```java
// your rewritten version here
```

## Part C — Reflect

**Which helped a future reader more — the better variable names, or the comments? Defend your answer in two or three sentences.**

The better variable names as it makes it easier for the reader to understand. It does this because it makes the reader visualise the scenario and use simple arithmetic to relate.

> There's no single right answer here. Most professionals would say good names reduce the *need* for comments, and comments should then explain the things names can't — assumptions, edge cases, and why a decision was made.
