#include <stdio.h>

int main() {
    int n, i, j, isPrime;

    printf("Enter number : ");
    scanf("%d", &n);

    for (i = n; i >= 2; i--) {
        isPrime = 1; 
        for (j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }
        if (isPrime) {
            printf("%d ", i);
        }
    }

    return 0;
}
