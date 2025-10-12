#include <stdio.h>

int main() {
    int position, yw, pc, bs, bonus, etb, ns;

    printf("Position (1=Junior, 2=Mid-Level, 3=Senior): ");
    scanf("%d", &position);

    printf("Years of Experience: ");
    scanf("%d", &yw);

    printf("Number of Projects Completed this Year: ");
    scanf("%d", &pc);

    switch(position) {
        case 1:
            bs = 20000;
            break;
        case 2:
            bs = 35000;
            break;
        case 3:
            bs = 50000;
            break;
        default:
            printf("ตำแหน่งไม่ถูกต้อง\n");
            return 1;
    }

    if (yw < 1) {
        bonus = 0;
    } else if (yw <= 3) {
        bonus = 0.10 * bs;
    } else if (yw <= 5) {
        bonus = 0.15 * bs;
    } else {
        bonus = 0.20 * bs;
    }

    if (pc > 5) {
        etb = 0.05 * bs;
    }

    ns = bs + bonus + etb;

    printf("\nBase Salary: %d THB\n", bs);
    printf("Experience Bonus: %d THB\n", bonus);
    printf("Special Bonus: %d THB\n", etb);
    printf("Net Salary: %d THB\n", ns);

    return 0;
}
