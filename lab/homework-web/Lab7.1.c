#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

int main() {
    char P[100];
    int play = 0;
    int random, guess;
    int score;
    int low, high;

    srand(time(NULL)); 

    while (1) {
        printf("Do you want to play game (1=play, -1=exit) : ");
        scanf("%s", P);

        if (strcmp(P, "1") == 0) {
            play = 1;
        } else if (strcmp(P, "-1") == 0) {
            play = -1;
        } else {
            printf("Invalid input. Please enter only 1 or -1.\n");
            continue;
        }

        if (play == -1) break;

        // เริ่มเกมใหม่
        random = rand() % 100 + 1;  // สุ่มเลข 1-100
        score = 100;
        low = 1;
        high = 100;

        printf("\n(Score = %d)\n", score);

        while (1) {
            printf("\nGuess the winning number (%d-%d) : ", low, high);
            scanf("%d", &guess);

            if (guess < low || guess > high) {
                printf("Invalid guess. Please enter a number between %d and %d.\n", low, high);
                continue;
            }

            if (guess < random) {
                score -= 10;
                printf("\nSorry, the winning number is HIGHER than %d. (Score=%d)\n", guess, score);
                if (guess + 1 <= high) {
                    low = guess + 1;
                }
            } else if (guess > random) {
                score -= 10;
                printf("\nSorry, the winning number is LOWER than %d. (Score=%d)\n", guess, score);
                if (guess - 1 >= low) {
                    high = guess - 1;
                }
            } else {
                printf("\nThat is correct! The winning number is %d.\n", random);
                printf("\nScore this game: %d\n", score);
                break;
            }

            if (score <= 0) {
                printf("\nYou've run out of points! The winning number was %d.\n", random);
                break;
            }
        }
    }

    printf("\nSee you again.\n");
    return 0;
}
