package day3;

public class InheritanceEx {
	    InheritanceEx(){
	    	System.out.println("This is parent Class");
	    }
        void sound() {
        	System.out.println("Animal makes Sound");
        }
}

class dog extends InheritanceEx{
	    dog(){
	    	super();
	    	System.out.println("This is Child class");
	    }
	    @Override
	    void sound() {
	    	System.out.println("Dog makes sound");
	    }
}
