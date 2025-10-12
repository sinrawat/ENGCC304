#include <stdio.h>

int main() {
    int days;
    long seconds;

    printf("Input Days : ");
    scanf("%d", &days);

    seconds = (long)days * 24 * 60 * 60;

    printf("%d day = %ld seconds\n", days, seconds);

    return 0;
}
