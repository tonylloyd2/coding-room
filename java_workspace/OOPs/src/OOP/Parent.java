/**
 * 
 */
package OOP;
// * @author lloyd
class Parent {
 private String name;
protected String surname;
private String work;
	Parent( String surname ){
	
		this.surname = "wepukhulu ";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	//method to be overriden
	public void work_done() {
		System.out.println(" takes care of the child");
	}
	//method to be overloaded
	public void family() {
		System.out.println(" parents have more family members");
	}
	
}
