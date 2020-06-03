#ifndef __STACKARR_H__
#define __STACKARR_H__

typedef int StackElement;
typedef int  TopElement;

#define MaxStackArraySize   10

typedef struct {
    int Top;
    StackElement Element[MaxStackArraySize];
} Stack;

void StackCreate(Stack* S);
void Push(Stack* S, StackElement NewElement);
TopElement Pop(Stack* S);
bool StackEmpty(Stack* S);
bool StackFull(Stack* S);
void StackClear(Stack* S);
void StackShowStructure(Stack* S);
void StackEmptyMessage(Stack* S);
void StackFullMessage(Stack* S);

#endif  /* __STACKARR_H__ */