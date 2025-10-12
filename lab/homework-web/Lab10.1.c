#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char str[100];
    char cleanStr[100];
    int i, j = 0;

    printf("Enter word: ");
    fgets(str, sizeof(str), stdin);

    str[strcspn(str, "\n")] = 0;

    for(i = 0; str[i] != '\0'; i++) {
        if(!isspace(str[i])) {  
            cleanStr[j++] = tolower(str[i]);
        }
    }
    cleanStr[j] = '\0';

    int len = strlen(cleanStr);
    int isPalindrome = 1;
    for(i = 0; i < len / 2; i++) {
        if(cleanStr[i] != cleanStr[len - i - 1]) {
            isPalindrome = 0;
            break;
        }
    }

    if(isPalindrome) {
        printf("Pass\n");
    } else {
        printf("Not Pass\n");
    }

    return 0;
}
