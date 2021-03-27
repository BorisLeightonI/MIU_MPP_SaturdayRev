import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name ;
	private List<Account> accounts;

	public Employee(String name){
		this.name = name;
		accounts = new ArrayList<Account>();
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		return 0.0;
	}

	public String getName() {
		return name;
	}

	public void setAccounts(Account account) {
		accounts.add(account);
	}

}
