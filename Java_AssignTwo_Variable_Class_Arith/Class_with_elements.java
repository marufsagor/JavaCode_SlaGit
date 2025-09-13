package Java_AssignTwo_Variable_Class_Arith;

public class Class_with_elements {

    int player=11;
    static String teamName ="Ekota Club";
     String brand;
     int year;
    public Class_with_elements(){
        brand="Nokia";
        year=2005;

    }
    void displayInfor(){

        System.out.println("Brand Name is :"+brand+"Year is:"+year);

    }

    public static void main(String[] args) {
        System.out.println("ClubName:"+teamName);
        Class_with_elements kk = new Class_with_elements();
        System.out.println("Player is: "+kk.player);
         kk.displayInfor();
    }

}
