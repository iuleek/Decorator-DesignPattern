package Proiect;

//Concrete class that implements the interface

public class SufrageriePredefinita implements Sufragerie 
{
	// Method that calculates the deposite given for redecorating the living room
	@Override
	public int pret() 
	{
		return 1000; //Price of the deposit
	}
}
