package class_projects.intOp;

import java.util.*;

class ex1{
    public static void main(String[] args) {
        brains b = new brains();
        b.choice();
    }
}

class brains
{
    Scanner input;
    
    brains() {
        this.input = new Scanner(System.in);
    }

    public void choice() {
        int i = 0;
        System.out.println("1. Check even/odd\n2. Check Prime\n3. Factorial\n4. Fibno\n5. Check Armstrong\n6. Pallindrome\n8.Exit ");
        while (i != 8) {
            System.out.print("Enter your choice: ");
            i = this.input.nextInt();
            switch (i) {
                case 1: {
                    this.checkEven();
                    continue;
                }
                case 2: {
                    this.checkPrime();
                    continue;
                }
                case 3: {
                    this.factorial();
                    continue;
                }
                case 4: {
                    this.fibno();
                    continue;
                }
                case 5: {
                    this.armstrong();
                    continue;
                }
                case 6: {
                    this.pallindrome();
                    continue;
                }
                case 7: {
                    this.hbd();
                    continue;
                }
                case 8: {
                    System.out.println("Byebye :)");
                    continue;
                }
                default: {
                    System.out.println("Invalid CHoice :(");
                    continue;
                }
            }
        }
    }
    
    void checkEven() {
        System.out.print("Enter a number: ");
        final int nextInt = this.input.nextInt();
        if (nextInt % 2 != 0) {
            System.out.println(nextInt + " is odd.");
            return;
        }
        System.out.println(nextInt + " is even.");
    }
    
    void checkPrime() {
        System.out.print("Enter a number: ");
        final int nextInt = this.input.nextInt();
        boolean b = true;
        if (nextInt%2==0||nextInt%3==0) {
            b = false;        
        }
        for (int i = 5; i*i < nextInt; i+=6) {
            if (nextInt%i==0 || nextInt%i+2==0) {
                b = false;
            }
        }
        if (b) {
            System.out.println(nextInt + " is Prime.");
            return;
        }
        System.out.println(nextInt + " is not Prime.");
    }
    
    void factorial() {
        System.out.print("Enter a number: ");
        final int nextInt = this.input.nextInt();
        System.out.println("Factorial of " + nextInt + " is " + this.factorialbrains(nextInt, 1));
    }
    
    int factorialbrains(final int n, final int k) {
        if(n==1){return k;}
        return factorialbrains(n-1, n*k);
    }
    
    void fibno() {
        System.out.print("Enter no. of elements req in fib series: ");
        final int nextInt = this.input.nextInt();
        String string = "";
        for (int i = 0; i < nextInt; ++i) {
            string+= fibnobrains(i)+" ";
        }
        System.out.println("Series upto " + nextInt + " is: " + string);
    }
    int fibnobrains(int n){
        if(n<2){
            return n;
        }
        return fibnobrains(n-1)+fibnobrains(n-2);
    }
    
    void armstrong() {
        System.out.print("Enter a number: ");
        final int nextInt = this.input.nextInt();
        int n = 0;
        int n2 = 0;
        for (int i = nextInt; i > 0; i /= 10) {
            ++n2;
        }
        for (int j = nextInt; j > 0; j /= 10) {
            n += (int)Math.pow(j % 10, n2);
        }
        if (nextInt == n) {
            System.out.println(nextInt + " is an Armstrong number.");
            return;
        }
        System.out.println(nextInt + " is not an Armstrong number.");
    }
    
    void pallindrome() {
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int rev=0;
        while (temp!=0) {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if (rev==num) {
            System.out.println(num + " is a Pallindrome.");
            return;
        }
        System.out.println(num + " is not a Pallindrome.");
    }
    
    void hbd() {
        System.out.println("HAPPY BIRTHDay!!!!");
    }
}