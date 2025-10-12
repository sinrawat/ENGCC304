#include <stdio.h>
#include <string.h>

struct Student {
    char Name[20];
    char ID[5];
    float ScoreSub1;
    float ScoreSub2;
    float ScoreSub3;
    float ScoreSub4;
    float ScoreSub5;
} typedef S;

const char* getGrade(float score) {
    if (score >= 80) return "A";
    else if (score >= 75) return "B+";
    else if (score >= 70) return "B";
    else if (score >= 65) return "C+";
    else if (score >= 60) return "C";
    else if (score >= 55) return "D+";
    else if (score >= 50) return "D";
    else return "F";
}

int main(void) {
    int n = 3, i = 0;
    S stu[n];
    printf("Enter the details of 3 students :\n");
    for (i = 0; i < n; i++) {
        printf("Student %d:\n", i+1);

        printf("Name: ");
        scanf("%19s", stu[i].Name);

        printf("ID: ");
        scanf("%4s", stu[i].ID);

        printf("Scores in Subject 1: ");
        scanf("%f", &stu[i].ScoreSub1);

        printf("Scores in Subject 2: ");
        scanf("%f", &stu[i].ScoreSub2);

        printf("Scores in Subject 3: ");
        scanf("%f", &stu[i].ScoreSub3);

        printf("Scores in Subject 4: ");
        scanf("%f", &stu[i].ScoreSub4);

        printf("Scores in Subject 5: ");
        scanf("%f", &stu[i].ScoreSub5);

        printf("---------------------------------------\n");
    }

    for (i = 0; i < n; i++) {
        float avg = (stu[i].ScoreSub1 + stu[i].ScoreSub2 + stu[i].ScoreSub3 +
                     stu[i].ScoreSub4 + stu[i].ScoreSub5) / 5.0;

        printf("\nStudent %d:\n", i + 1);
        printf("Name: %s\n", stu[i].Name);
        printf("ID: %s\n", stu[i].ID);

        printf("Scores: %.0f %.0f %.0f %.0f %.0f\n",
               stu[i].ScoreSub1, stu[i].ScoreSub2, stu[i].ScoreSub3,
               stu[i].ScoreSub4, stu[i].ScoreSub5);

        printf("Grades: %s %s %s %s %s\n",
               getGrade(stu[i].ScoreSub1), getGrade(stu[i].ScoreSub2),
               getGrade(stu[i].ScoreSub3), getGrade(stu[i].ScoreSub4),
               getGrade(stu[i].ScoreSub5));

        printf("Average Scores: %.1f\n", avg);
    }
}