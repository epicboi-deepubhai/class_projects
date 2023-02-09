package class_projects.stack;

import java.util.Scanner;

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
            System.out.print(stk[i]+"\n");
        }
    }
}

public class stacks {
    public static void driver(stack s){
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
        while(i!=4){
            System.out.print("Your choice: ");
            i = input.nextInt();
            switch (i) {
                case 1:{
                    System.out.print("Enter an item to push to the stack: ");
                    int item = input.nextInt();
                    s.push(item);
                    continue;
                }
                case 2:{
                    i = s.pop();
                    if(i!=-1){
                        System.out.println(i+" is popped from the stack");
                    }
                    continue;
                }
                case 3:{
                    System.out.println("The stack is: ");
                    s.disp();
                    continue;
                }
                case 4:{
                    System.out.println("Byebye :)");
                    continue;
                }
                default: {
                    System.out.println("Invalid CHoice :(");
                    continue;
                }
            }
        }
        input.close();
    }
    public static void main(String[] args) {
        stack s = new stack();
        System.out.println("Stack initialized with size "+s.stk.length);
        driver(s);
    }
}
