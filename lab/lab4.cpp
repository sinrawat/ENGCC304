#include <stdio.h>

int main() {
    char emp[11];
    int hw;
    float salary;
    float totalSalary;

    printf("Input the Employees ID (Max. 10 chars):\n");
    scanf("%10s", emp);

    printf("Input the working hrs:\n");
    scanf("%d", &hw);

    printf("Salary amount/hr:\n");
    scanf("%f", &salary);

    totalSalary = hw * salary;

    printf("\nEmployee ID = %s\n", emp);
    printf("Salary = U$ %.2f\n", totalSalary);

    return 0;
}