package com.user.task1;

public class Commission {
	String Name,Address;
	long Phone;
	int Sales_Amount;
	public Commission()
	{
	System.out.println("Default");
	}
	public Commission(String Name,String Address,long Phone,int Sales_Amount)
	{
		this.Name=Name;
		this.Address=Address;
		this.Phone=Phone;
		this.Sales_Amount=Sales_Amount;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public int getSales_Amount() {
		return Sales_Amount;
	}
	public int setSales_Amount(int sales_Amount) {
		return Sales_Amount = sales_Amount;
	}
	@Override
	public String toString() {
		return "Commission [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + ", Sales_Amount="
				+ Sales_Amount + "]";
	}
	

}
