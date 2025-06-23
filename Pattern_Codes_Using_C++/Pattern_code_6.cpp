#include<iostream>

int main() {
    int i, j, rows;

    // Get the number of rows from the user
    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    // Outer loop for each row
    for(i = 1; i <= rows; i++) {
        // Inner loop for each column in the row
        for(j = 1; j <= i; j++) {
            printf("*");  // Print a star
        }
        printf("\n");  // Move to the next line after each row
    }

    return 0;
}
