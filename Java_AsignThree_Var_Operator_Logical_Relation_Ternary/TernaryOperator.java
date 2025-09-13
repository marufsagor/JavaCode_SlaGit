package Java_AsignThree_Var_Operator_Logical_Relation_Ternary;

public class TernaryOperator {

    public static void main(String[] args) {
        int a=50;
        int b=60;
        int min=(a<b)?a:b;
        System.out.println("Minimum Value is:" +min);

        int max=(a>b)?a:b;
        System.out.println("Max Value is "+max);
    }
}
