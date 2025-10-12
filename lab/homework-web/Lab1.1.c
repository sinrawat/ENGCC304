#include <stdio.h> 

int main(void) {
    int num1, num2, num3, sum;

    printf("Enter num1 : ");
    scanf("%d", &num1);
    printf("Enter num2 : ");
    scanf("%d", &num2);
    printf("Enter num3 : ");
    scanf("%d", &num3);   

    sum = num1 + num2 + num3;

    printf("\nAnswer = %d\n", sum);
    return 0;                              
}