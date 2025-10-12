#include <stdio.h> 

int main(void) {
    int wh, sh ;
    float salary;
    char id[10]; 

    printf("the Employees ID(Max. 10 chars) : ");
    scanf("%s", &id);
    printf("the working hrs : ");
    scanf("%d", &wh);
    printf("Salary amount/hr : ");
    scanf("%d", &sh);   

    salary =  wh * sh;

    printf("--------------");
    printf("\nExpected Output:");
    printf("\nEmployees ID = %s", id);
    printf("\nSalary = U$ %.2f\n", salary);
    return 0;                              
}