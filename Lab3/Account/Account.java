


public class Account {

private String accountTitle = "Default_Account";
private double totalBalance = 0;

public void deposit(double amountToDeposit)
{
totalBalance += amountToDeposit;
System.out.println( amountToDeposit + " Deposited \nNew Balance = " + totalBalance);
}
public void withdraw(double amountToWithDraw)
{

	if(amountToWithDraw < totalBalance)
	{
		totalBalance -= amountToWithDraw;
		System.out.println( amountToWithDraw + " Withdrawl \nNew Balance = " + totalBalance);
	}
	else
	{
		System.out.println("Not enough funds.");
	}

}


}
 //code by AbdulRauf(github.com/abdulCode) with love for educational purposes only