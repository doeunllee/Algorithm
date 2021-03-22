package mentoring;

public class Account {

	String name;		//고객 이름
	int balance;		//잔액

	public void deposit(int deposit) {		//입금 기능
		this.balance = this.balance + deposit;
		System.out.println(name + " 고객님의 계좌로 " + deposit + "원이 입금되었습니다.");
	}

	public void withdraw(int withdraw) {		//출금 기능
		this.balance = this.balance + withdraw;
		System.out.println(name + " 고객님의 계좌에서 " + withdraw + "원이 출금되었습니다.");
	}

	public void showInfo() {		//잔액 출력

		System.out.println(name + " 고객님의 잔액: " + this.balance );
	}

	public Account(String name) {		//계좌 개설 시 입금액이 0인 경우 호출, this() 메소드 활용.
		this(name, 0);
	}

	public Account(String name, int balance) {		//계좌 개설 시 입금액이 0이 아닌 경우 호출.
		this.name = name;
		this.balance = balance;

		System.out.println(name + " 고객님의 계좌가 개설되었습니다.");
		System.out.println(name + " 고객님의 잔액: " + balance);
	}

	public static void main(String[] args) {

		Account client1 = new Account("김선형", 100000);
		Account client2 = new Account("홍길동");

		client1.deposit(50000);
		client1.withdraw(2500);
		client1.showInfo();

		client2.deposit(10000);
		client2.withdraw(3000);
		client2.showInfo();
	}
}
