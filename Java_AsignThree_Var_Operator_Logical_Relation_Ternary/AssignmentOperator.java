package Java_AsignThree_Var_Operator_Logical_Relation_Ternary;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a=40;
        int b=50;
        System.out.println("Initial va;ue of A:"+a);
        System.out.println("Initial Value of B:"+b);

        a=b;
        System.out.println("Assigned value B to A, and then now A is  :"+a);

        a+=b;
        System.out.println("Add and assign:"+ a);


        a-=b;
        System.out.println("Subtract and assign"+a);

        a*=b;
        System.out.println("Multiply and assign"+a);
    }



}
