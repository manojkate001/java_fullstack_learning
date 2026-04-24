package day1;

public class polymorphismMain {
    public static void main(String[] args) {
    	childPolymorphism ch = new childPolymorphism();
    	ch.getValues("Manoj",22,100000,"Pune");
    	ch.setValues("Manoj",22,100000);
    	ch.getValues();
    	ch.show();
    }
}
