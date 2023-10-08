package com.user.ticketBooking;

public class movieTicket {
	private String name;
	private long phone;
	static int  no_of_Tickets=4;
	{
		no_of_Tickets--;
	}
	public movieTicket(String name, long phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "movieTicket [name=" + name + ", phone=" + phone + "]";
	}
	

}
