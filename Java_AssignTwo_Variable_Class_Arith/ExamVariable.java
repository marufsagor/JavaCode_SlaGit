package Java_AssignTwo_Variable_Class_Arith;

public class ExamVariable {

    int age=20;
    String name="khan";
    static double salary=15000;

    public void localVar() {
        // Local variable (defined within a method)
        double localVar = 5.25;
        System.out.println("Local var"+localVar);
    }



    public static void main(String[] args) {

      ExamVariable kk=new ExamVariable();
        System.out.println(" Instance variable age"+kk.age);
        System.out.println("Instance Variable name"+kk.name);
        System.out.println("Static var"+salary); //no need to create object as a static variable

        kk.localVar();
    }
}
