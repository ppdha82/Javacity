#define StackElement    int
#define TopElement      int
#define MaxStackArraySize   10

typedef enum { FALSE, TRUE } boolean;
typedef struct {
    int Top;
    StackElement Element[MaxStackArraySize];
} Stack;

void StackCreate(Stack* S);
void Push(Stack* S, StackElement NewElement);
TopElement Pop(Stack* S);
boolean StackEmpty(Stack* S);
boolean StackFull(Stack* S);
void StackClear(Stack* S);
void StackShowStructure(Stack* S);
void StackEmptyMessage(Stack* S);
void StackFullMessage(Stack* S);