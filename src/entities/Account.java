package entities;

import exceptions.DomainException;

public class Account {
	
	private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
    
    public void withdraw(Double amount) throws DomainException{
    	
    	if(amount > withdrawLimit) {
    		throw new DomainException("The amount exceeds withdraw limit");
    	}
    	if(balance < amount) {
    		throw new DomainException("Not enough balance");
    	}
    	
    	balance -= amount;
    }

	public Double getBalance() {
		return balance;
	}
    
}

