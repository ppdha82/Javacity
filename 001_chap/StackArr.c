#include <stdio.h>
#include <curses.h>
#include <stdbool.h>

#include "StackArr.h"

void StackCreate(Stack* S)
{
    S->Top = -1;
}

void Push(Stack* S, StackElement NewElement)
{
    if(!StackFull(S)) {
        S->Top++;
        S->Element[S->Top] = NewElement;
    }
    else {
        StackFullMessage(S);
    }
}

TopElement Pop(Stack* S)
{
    int temp;

    if(!StackEmpty(S)) {
        temp = S->Element[S->Top];
        S->Top--;
        return temp;
    }
    else {
        StackEmptyMessage(S);

        return 10;
    }
}

bool StackEmpty(Stack* S)
{
    if(S->Top == -1) {
        return TRUE;
    }
    else {
        return FALSE;
    }
}

bool StackFull(Stack* S)
{
    if(S->Top == MaxStackArraySize - 1) {
        return TRUE;
    }
    else {
        return FALSE;
    }
}

void StackClear(Stack* S)
{
    S->Top = -1;
}

void StackShowStructure(Stack* S)
{
    Stack Temp;
    TopElement item;

    Temp = *S;
    printf("\n");
    while(Temp.Top != 1) {
        item = Pop(&Temp);
        printf("%c\n", item);
    }
}

void StackEmptyMessage(Stack* S)
{
    if(StackEmpty(S)) {
        printf("\nStack is Empty!!\n");
    }
    else {
        printf("\nStack is not Empty\n");
    }
}

void StackFullMessage(Stack* S)
{
    if(StackFull(S)) {
        printf("\nStack is full!!!\n");
    }
    else {
        printf("\nStack is not full!!!\n");
    }
}