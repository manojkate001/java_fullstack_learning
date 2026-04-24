package day2.LibraryManagement;

public abstract class LibraryIntem {
       private int id;
       private String title;
       private boolean isBorrow;
       public LibraryIntem(int id,String title) {
    	   if(id<1) {
    		   System.out.println("Invalid Input");
    	   }
    	   this.id = id;
    	   this.title =title;
       }
      
       public int getId() {
    	   return id;
       }
       public String getTitle() {
    	   return title;
       }
       public boolean getStatus() {
    	   return isBorrow;
       }
       public void setBorrwed(boolean status) {
    	   this.isBorrow =status;
       }
       abstract void displayDetails();
}

interface Borrowable{
	  void borrowItem();
	  void returnItem();
}
class Books extends LibraryIntem implements Borrowable{
	   private String author;
	   public Books(int id,String title,String author) {
		   super(id,title);
		   this.author = author;
	   }
	   public void displayDetails() {
		  System.out.println("Author : "+author);
	  }
	   public void borrowItem() {
		   System.out.println("Item borrowed Successfully");
	   }
	   public void returnItem() {
		   System.out.println("Item retrurned Successfully");
	   }
}
class Magzine extends LibraryIntem implements Borrowable{
	   private String author;
	   public Magzine(int id,String title,String author) {
		   super(id,title);
		   this.author = author;
	   }
	   public void setValues(int id ,String title,String author) {
		   this.author = author;

		   
	   }
	   public void displayDetails() {
		  System.out.println("Author of this Magzine :"+author);
	  }
	   public void borrowItem() {
		   System.out.println("Borrow Magzine successfully");
	   }
	   public void returnItem() {
		   System.out.println("Return Maxzine succesfully");
	   }
	   
}
