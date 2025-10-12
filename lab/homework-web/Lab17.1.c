#include <stdio.h>
#include <string.h>

#define MAX_BOOKS 100

typedef struct {
    int bookID;
    char title[100];
    char author[100];
    int year;
} Book;

void addBook(Book books[], int *count);
void searchBook(Book books[], int count, char title[]);
void displayBooks(Book books[], int count);

int main() {
    Book books[MAX_BOOKS];
    int count = 0;
    int choice;
    char searchTitle[100];

    do {
        printf("\n======= Library Management System =======\n");
        printf("1. Add new book\n");
        printf("2. Search book by title\n");
        printf("3. Display all books\n");
        printf("4. Exit\n");
        printf("Select menu (1-4): ");
        scanf("%d", &choice);
        getchar();

        switch (choice) {
            case 1:
                addBook(books, &count);
                break;
            case 2:
                printf("\nEnter book title to search: ");
                fgets(searchTitle, sizeof(searchTitle), stdin);
                searchTitle[strcspn(searchTitle, "\n")] = '\0'; 
                searchBook(books, count, searchTitle);
                break;
            case 3:
                displayBooks(books, count);
                break;
            case 4:
                printf("Exiting program...\n");
                break;
            default:
                printf("Invalid choice. Please select again.\n");
        }
    } while (choice != 4);

    return 0;
}

void addBook(Book books[], int *count) {
    if (*count >= MAX_BOOKS) {
        printf("Cannot add more books. Storage full.\n");
        return;
    }

    printf("\nEnter Book ID: ");
    scanf("%d", &books[*count].bookID);
    getchar();

    printf("Enter Title: ");
    fgets(books[*count].title, sizeof(books[*count].title), stdin);
    books[*count].title[strcspn(books[*count].title, "\n")] = '\0';

    printf("Enter Author: ");
    fgets(books[*count].author, sizeof(books[*count].author), stdin);
    books[*count].author[strcspn(books[*count].author, "\n")] = '\0';

    printf("Enter Year: ");
    scanf("%d", &books[*count].year);

    (*count)++;

    printf("Book added successfully!\n");
}

void searchBook(Book books[], int count, char title[]) {
    int found = 0;

    for (int i = 0; i < count; i++) {
        if (strcasecmp(books[i].title, title) == 0) { 
            printf("\nBook found!\n");
            printf("ID: %d\n", books[i].bookID);
            printf("Title: %s\n", books[i].title);
            printf("Author: %s\n", books[i].author);
            printf("Year: %d\n", books[i].year);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("\nBook not found.\n");
    }
}

void displayBooks(Book books[], int count) {
    if (count == 0) {
        printf("\nNo books in the library.\n");
        return;
    }

    printf("\n======= All Books in Library =======\n");
    for (int i = 0; i < count; i++) {
        printf("Book #%d\n", i + 1);
        printf("ID: %d\n", books[i].bookID);
        printf("Title: %s\n", books[i].title);
        printf("Author: %s\n", books[i].author);
        printf("Year: %d\n", books[i].year);
        printf("----------------------------------\n");
    }
}
