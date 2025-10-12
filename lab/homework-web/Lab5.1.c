#include <stdio.h> 
#include <locale.h>

int main(void) {
    setlocale(LC_NUMERIC, "");
    int wh, sh ;
    char id[10]; 
    double salary;

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
    printf("\nSalary = U$ %' .2f\n", salary);
    return 0;                              
}