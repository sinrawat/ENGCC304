#include <stdio.h>
#include <math.h>
int isArmstrong(int num) {
    int originalNum = num;
    int sum = 0;
    int digits = 0;
    int temp = num;
    
    while (temp != 0) {
        digits++;
        temp /= 10;
    }
    
    temp = num;
    while (temp != 0) {
        int digit = temp % 10;
        sum += pow(digit, digits);
        temp /= 10;
    }
    
    return (sum == originalNum);
}

int main() {
    int number;
    
    printf("กรุณาใส่ตัวเลข : ");
    if (scanf("%d", &number) != 1) {
        printf("ขออภัย !! โปรดใส่ข้อมูลเป็นตัวเลขเท่านั้น\n");
        return 1;
    }
    
    if (isArmstrong(number)) {
        printf("~ ~ ~ ~ Pass. ~ ~ ~ ~\n");
    } else {
        printf("~ ~ ~ ~ Not Pass. ~ ~ ~ ~\n");
    }
    
    return 0;
}