package class_projects.nestedTry;

public class tryCatch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 0, 8};
        try{
            for (int i = 0; i<6 ;i++) {
                try{
                System.out.println("8 / "+ arr[i]+ " = " + 8/arr[i]);
                }catch(ArithmeticException e){
                    System.out.println("Cannot divide by zero :(");
                }
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }

        System.out.print("The array was: ");
        for (int i : arr) {
            System.out.print(i+ " ");            
        }
    }
}
