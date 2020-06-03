#include <stdio.h>
#include <conio.h>

#include "StackArr.h"

void main(void)
{
    Stack S;

    StackCreate(&S);

    Push(S, '1');
    Push(S, '2');

    TopElement PopElement;

    if((PpopElement = Pop(S)) != 10) {
        printf("\nPop : %c", PopElement);
    }

    if((PopElement = Pop(S)) != 10) {
        printf("\nPop : %c", PopElement);
    }

    if((PopElement = Pop(S)) != 10) {
        printf("\nPop : %c", PopElement);
    }
}