package OOP;

public class Child extends Parent {

	Child(String surname) {
		super(surname);
        this.surname = " barasa wepukhulu";
	
	}
	//overridden method
   public void work_done() {
	   System.out.println(" child does nothing ");
   }
   //overloaded method
   public void family( String members) {
	   members = "only parents  ";
	   System.out.println(members);
   }
}
