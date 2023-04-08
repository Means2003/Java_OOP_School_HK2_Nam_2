package ex5;

public class Person {
	// Instance variables
	 private String name;
	 private String address;

	 // Constructor
	 public Person(String name, String address) {
	 this.name = name;
	 this.address = address;
	 }

	 // Getters
	 public String getName() {
	 return name;
	 }
	 public String getAddress() {
	 return address;
	 }
	 public void setAddress(String address) {
		this.address = address;
	}
	 public String toString() {
	 return "Person[ name = "+this.name+", address = "+this.address+"]";
	 }
}
