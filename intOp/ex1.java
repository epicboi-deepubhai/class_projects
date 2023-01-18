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
            System.out.println("Enter your choice: ");
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
        System.out.println("Enter a number: ");
        final int nextInt = this.input.nextInt();
        if (nextInt % 2 != 0) {
            System.out.println(nextInt + " is odd.");
            return;
        }
        System.out.println(nextInt + " is even.");
    }
    
    void checkPrime() {
        System.out.println("Enter a number: ");
        final int nextInt = this.input.nextInt();
        boolean b = true;
        for (int i = 0; i < nextInt; ++i) {
            for (int j = i; j < nextInt; ++j) {
                if (i * j == nextInt) {
                    b = false;
                    break;
                }
            }
        }
        if (b) {
            System.out.println(nextInt + " is Prime.");
            return;
        }
        System.out.println(nextInt + " is not Prime.");
    }
    
    void factorial() {
        System.out.println("Enter a number: ");
        final int nextInt = this.input.nextInt();
        System.out.println("Factorial of " + nextInt + " is " + this.factorialbrains(nextInt));
    }
    
    int factorialbrains(final int n) {
        if (n != 1) {
            return n * this.factorialbrains(n - 1);
        }
        return n;
    }
    
    void fibno() {
        System.out.println("Enter no. of elements req in fib series: ");
        final int nextInt = this.input.nextInt();
        String string = "";
        int n = 0;
        int n2 = 1;
        for (int i = 0; i < nextInt; ++i) {
            string = string + " " + n;
            final int n3 = n + n2;
            n = n2;
            n2 = n3;
        }
        System.out.println("Series upto " + nextInt + " is: " + string);
    }
    
    void armstrong() {
        System.out.println("Enter a number: ");
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
        System.out.println("Enter a number: ");
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