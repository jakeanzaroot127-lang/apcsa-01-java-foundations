/**
 * Exercise 7 — AboutMe
 *
 * TODO: Declare and initialize at least one variable of EACH type:
 *     int, double, boolean, char, String
 *
 * Then print each one with a descriptive label.
 *
 * Requirements:
 *   - Use camelCase names
 *   - Names must be descriptive (favoriteNumber, not x)
 *   - Include at least one `final` constant in ALL_CAPS
 */
public class AboutMe {
    public static void main(String[] args) {
        int favoriteNumber = 7;
        double favoriteDecimal = 3.14;
        boolean likesCoding = true;
        char favoriteLetter = 'A';
        String favoriteColor = "Blue";

        final int MAX_ATTEMPTS = 3;

        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Favorite decimal: " + favoriteDecimal);
        System.out.println("Likes coding: " + likesCoding);
        System.out.println("Favorite letter: " + favoriteLetter);
        System.out.println("Favorite color: " + favoriteColor);
        System.out.println("Max attempts: " + MAX_ATTEMPTS);
    }
}