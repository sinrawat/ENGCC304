#include <stdio.h>

int main() {
    int N = 0;
    printf("Enter value: ");
    
    if (scanf("%d", &N) != 1) {
        printf("please enter number only.\n");
        return 1;
    }

    printf("Series:");
    if (N % 2 == 0) {
        for (int i = N; i >= 0; i -= 2) {
            printf(" %d", i);
        }
    } else {
        for (int i = 1; i <= N; i += 2) {
            printf(" %d", i);
        }
    }


    return 0;
}
