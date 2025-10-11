#include <stdio.h>

void swapNumbers(int *a, int *b) {
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;
}

int main(void) {
    int num1, num2;
    int *ptr1, *ptr2;

    printf("Enter num1 : ");
    scanf("%d", &num1);
    printf("Enter num2 : ");
    scanf("%d", &num2);

    ptr1 = &num1;
    ptr2 = &num2;

    printf("\nBefore swap (num1 & num2) : %d, %d", num1, num2);

    swapNumbers(ptr1, ptr2);

    printf("\nAfter swap  (num1 & num2) : %d, %d\n", num1, num2);

    return 0;
}
