#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main() {
    char word[100];
    
    printf("Enter word :");
    fgets(word, sizeof(word), stdin);
    
    word[strcspn(word, "\n")] = '\0';
    
    int length = strlen(word);
    int isPalindrome = 1; 
    
    for(int i = 0; i < length / 2; i++) {
        if(tolower(word[i]) != tolower(word[length - 1 - i])) {
            isPalindrome = 0;
            break;
        }
    }
    
    if(isPalindrome) {
        printf("~ ~ ~ ~ Pass. ~ ~ ~ ~\n");
    } else {
        printf("~ ~ ~ ~ Not Pass. ~ ~ ~ ~ \n");
    }
    
    return 0;
}