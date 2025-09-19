#include <stdio.h>

int main() {
    int n, i, j, isPrime;

    printf("Enter number : ");
    scanf("%d", &n);

    i = n;
    while (i >= 2) {
        isPrime = 1;
        j = 2;
        while ( j < i) {
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
            j++;
        }
        if (isPrime) {
            printf("%d ", i);
        }
        i--;
    }

    return 0;
}
