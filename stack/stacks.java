package class_projects.stack;

class stack{
    int stk[] = new int[3];
    int top = -1;

    public void push(int n){
        if(top==stk.length-1){
            System.out.println("Stack Overflowed!!");
            return;
        }top++;
        stk[top] = n;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflowed!!");
            return -1;
        }int i = stk[top--];
        return i;
    }

    public void disp(){
        if(top==-1){
            System.out.println("Stack is empty!!");
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stk[i]+" ");
        }System.out.println();
    }
}

public class stacks {
    public static void main(String[] args) {
        
    }
}
