package www.nurv.inherit;

public class Name {

	String firstname;
	String lastname;
	
	public Name(String first,String last) {
		this.firstname = first;
		this.lastname = last;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	public String getLastName() {
		return this.lastname;
	}

	public String toString() {
		String result=this.firstname + " " + this.lastname;
		return result;
		
	}

	public boolean equals(Object obj) {
		if(obj instanceof Name) {
			Name name = (Name)obj;
			return (firstname.equals(name.firstname)) && (lastname.equals(name.lastname));
		}
		return super.equals(obj);
	}
	
	public int hashCode() {
		return firstname.hashCode();
	}
	
/*
	public  static void main(String[] args) {
		Name n1 = new Name("Qin","XiaoBo");
		Name n2 = new Name("Zhen","LiLan");
		Name n3 = new Name("Qin","XiaoBo");
		Object n4 = (Object)n3;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n4);
		System.out.println(n1.equals(n3));
		System.out.println(n1.equals(n2));
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(n3.hashCode());
	}
	
*/
}
