package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("New Deposit");
}
	public static void main(String[] args) {
		AxisBank As= new AxisBank();
		As.deposit();
		As.saving();
		As.fixed();
	}
}