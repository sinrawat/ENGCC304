#include <stdio.h>
#include <ctype.h>

int countWords(FILE *fp) {
    int count = 0;
    char ch, prev = ' ';
    
    while ((ch = fgetc(fp)) != EOF) {
        if (!isspace(ch) && isspace(prev)) {
            count++;
        }
        prev = ch;
    }
    return count;
}

int main() {
    char filename[50];
    FILE *fp;

    printf("Enter file name: ");
    scanf("%s", filename);

    fp = fopen(filename, "r");
    if (fp == NULL) {
        printf("Cannot open file %s\n", filename);
        return 1;
    }

    int totalWords = countWords(fp);
    fclose(fp);

    printf("Total number of words in '%s' : %d words\n", filename, totalWords);
    return 0;
}
