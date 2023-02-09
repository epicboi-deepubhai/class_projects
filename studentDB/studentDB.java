package class_projects.studentDB;
import java.util.*;

class student{
    String name;
    int math;
    int physics;
    int chem;
    int avg;

    void init(String n, int m, int p, int c){
        this.name = n;
        this.math = m;
        this.physics = p;
        this.chem = c;
    }

    int getAvg(){
        return (math+chem+physics)/3;
    }

}

class op{
    public static void disp(student[] s){
        System.out.println("Name\t\t\tAvgScore\t\tMathemetics\t\tPhysics\t\tChemistry\t\t");
        for (student i : s) {
            System.out.println(i.name+"\t\t\t"+i.getAvg()+"\t\t\t"+i.math+"\t\t\t"+i.physics+"\t\t\t"+i.chem);
        }
    }

    public static student[] sort(student[] s){
        int n = s.length;
        student temp = new student();
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(s[j-1].getAvg() < s[j].getAvg()){  
                            temp = s[j];  
                            s[j] = s[j-1];  
                            s[j-1] = temp;  
                    }  
            }  

        }
    return s;
    }

    public static student[] initialize(student[] s){
        for (int i = 0; i < s.length; i++) {
                Scanner input = new Scanner(System.in);                
                s[i] = new student();

                System.out.print("Enter the name of the student: ");
                String name = input.nextLine();

                System.out.print("Enter marks of student in MAths: ");
                int mafs = input.nextInt();

                System.out.print("Enter marks of student in Physics: ");
                int phy = input.nextInt();

                System.out.print("Enter marks of student in Chemistry: ");
                int chem = input.nextInt();
                
                System.out.println("ENtry made for "+name+"\n");
                s[i].init(name, mafs,phy,chem);
        }
        return s;
    }
}

public class studentDB {
    public static void main(String[] args) {
        student classA[] = new student[3];
        classA = op.initialize(classA);
        classA = op.sort(classA);
        op.disp(classA);
    }
}
