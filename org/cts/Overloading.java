package org.cts;

public class Overloading {
	public void jay(int id) {
		// TODO Auto-generated method stub
System.out.println("The Id is :"+id);
	}
public void jay(String name) {
	// TODO Auto-generated method stub
	System.out.println("The Name is :"+name);

}
public void jay(int bill, String restaurant) {
	// TODO Auto-generated method stub
System.out.println("Total bill and restaruant is: "+bill+"\t"+restaurant);
}
public void jay(String office, float sal) {
	// TODO Auto-generated method stub
	System.out.println("Office Name and Sal is"+office+"\t"+sal);

}
public void jay(int eID, String mail, float eSal) {
	// TODO Auto-generated method stub
System.out.println("The eID, mail and eSal is:"+eID+""+mail+""+eSal);
}
public static void main(String[] args) {
	Overloading b=new Overloading();
	b.jay(78);
	b.jay("Jayanthi");
	b.jay(789,"KFC");
	b.jay("String",65000.485f);
}
}
