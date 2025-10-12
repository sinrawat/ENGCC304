#include <stdio.h> 

int main(void) {
    int h, w;
    float area;

    printf("H = ");
    scanf("%d", &h);
    printf("W = ");
    scanf("%d", &w); 

    area = (h * w) /2 ;

    printf("\nAnswer = %.1f\n", area);
    return 0;                              
}