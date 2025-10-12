#include <stdio.h>
#include <stdbool.h>

bool isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0)
            return false;
    }
    return true;
}

int main() {
    int n;

    printf("Enter N: ");
    scanf("%d", &n);

    int arr[n];

    for (int i = 0; i < n; i++) {
        printf("Enter value [%d]: ", i);
        scanf("%d", &arr[i]);
    }

    printf("\nIndex: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", i);
    }
    printf("\nArray: ");
    for (int i = 0; i < n; i++) {
        if (isPrime(arr[i])) {
            printf("%d ", arr[i]);
        } else {
            printf("# ");
        }
    }
    printf("\n");

    return 0;
}
