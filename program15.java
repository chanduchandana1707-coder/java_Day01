#include <stdio.h>
#include <string.h>

int main() {
    int num, reverse = 0, remainder;
    char str[100];
    int i, length;

    // Reverse a number
    printf("Enter a number: ");
    scanf("%d", &num);

    while (num != 0) {
        remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num = num / 10;
    }

    printf("Reversed number = %d\n", reverse);

    // Clear input buffer
    getchar();

    // Reverse a string
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    length = strlen(str);

    if (str[length - 1] == '\n') {
        str[length - 1] = '\0';
        length--;
    }

    printf("Reversed string = ");

    for (i = length - 1; i >= 0; i--) {
        printf("%c", str[i]);
    }

    return 0;
}