package class_projects.exceptionHandling;
import java.util.*;;

public class throwThrows {
    public static int devide(int m, int n) throws ArithmeticException{
        if(n==0){
            throw new ArithmeticException("Cannot devide by zero");
        }else if(m<1||n<1){
            throw new ArithmeticException("User didn't enter a whole number");
        }else{
            return m/n;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        try {
            System.out.println(devide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
