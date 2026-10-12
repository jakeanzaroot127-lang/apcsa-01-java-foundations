# Exercises 8 & 10 — Types

## Exercise 8 — Type Detective

For each value, pick the best Java type and justify it in **one sentence.** The justification is the point of the exercise.

| # | Value to store | Type | Why |
|---|---|---|---|
| 1 | A student's age | int | Because its a whole number |
| 2 | The price of a coffee | double | Because its a decimal to the nearest hundredths |
| 3 | Whether a student is enrolled | boolean | Because its either true or false |
| 4 | A student's middle initial | char | because it is a singular character |
| 5 | A phone number | String | there are character besides just numbers |
| 6 | The population of New York City | int | people counted as whole numbers |
| 7 | A test score out of 100 | int | a whole number |
| 8 | A GPA | double | there is a decimal |
| 9 | Whether it is currently raining | boolea | either true or false |
| 10 | A student ID like `0074512` | String | surrounded by single quotes |

### Traps to think carefully about

**#5 — Phone number.** It's made of digits, so `int` feels right. Why is it wrong?

There are characters other then numbers 

**#10 — Student ID.** Same question, plus one more problem `int` would cause.

Not mathematical

**#6 — Population of NYC.** About 8.3 million. Does that fit in an `int`? What about the population of Earth?

No because there is a decimal so it is a double

---

## Exercise 10 — Your Project's Data (Homework)

Think about your project idea. What are the five most important pieces of information it needs to store?

Pay to play video games with sports players, influencers, and celebrities on public live streams where the audience could attempt to guess who will win, lose, the outcomes of the games, etc. in order to recieve rewards

| # | What it stores | Type | Example value | Why this type |
|---|---|---|---|---|
| 1 | Streamer's email | String | "player@email.com" | A string stores text, including letters and symbols in an email address |
| 2 | Streamer's phone number | String | "7182301000" | A string stores phone numbers because they may contain symbols or leading zeros and are not used for calculation |
| 3 | Streamer's  live stream status | boolean | true | A boolean stores either true or false to show whether a streamer is currently live |
| 4 | Game entry fee | double | 7.50 | A double stores decimal numbers, which can represent the amount of money required to enter a game |
| 5 | Number of viewers watching | int | 2500 | An int stores whole numbers, which is useful for counting viewers |

**Is there anything your project needs to store that doesn't fit any of these types?**

Yes. My project needs to store a list of predictions from viewers, including who they think will win and whether their predictions were correct. A single String, int, double, or boolean cannot easily store all of that information together, so I may need to use a list or create my own class later.
