package org.Bank;

public class AxisBank extends Bank_Info
{
	public void deposit()
	{
		System.out.println("Deposited Rs.7,000");
	}
	public static void main(String[] args) 
	{
		AxisBank bank=new AxisBank();
		bank.savings();
		bank.fixed();
		bank.deposit();
	}
}
