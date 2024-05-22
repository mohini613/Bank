package com.rbi.model;
public class Account {


private int CustomerId;
private long AccountNo;
private String CustomerName;
private  long AdharNo;
private int PanCard;
private String AccoutnType;
private String Address;
private int PinCode;
private long MobileNo;
private Double Balance =0.0;
private int Deposite;
private String IFSCCode;
private int withdraw;
private String BankName;
{
	
}
public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}


public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}


public int getPanCard() {
	return PanCard;
}
public void setPanCard(int panCard) {
	PanCard = panCard;
}
public String getAccoutnType() {
	return AccoutnType;
}
public void setAccoutnType(String accoutnType) {
	AccoutnType = accoutnType;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getPinCode() {
	return PinCode;
}
public void setPinCode(int pinCode) {
	PinCode = pinCode;
}


public Double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}
public int getDeposite() {
	return Deposite;
}
public void setDeposite(int deposite) {
	Deposite = deposite;
}


public String getBankName() {
	return BankName;
}
public void setBankName(String bankName) {
	BankName = bankName;
	
}
public int getWithdraw() {
	return withdraw;
}
public void setWithdraw(int withdraw) {
	this.withdraw = withdraw;
	
	
}
public long getAccountNo() {
	return AccountNo;
}
public void setAccountNo(long accountNo) {
	AccountNo = accountNo;
}
public long getAdharNo() {
	return AdharNo;
}
public void setAdharNo(long adharNo) {
	AdharNo = adharNo;
}
public long getMobileNo() {
	return MobileNo;
}
public void setMobileNo(long mobileNo) {
	MobileNo = mobileNo;
}
public String getIFSCCode() {
	return IFSCCode;
}
public void setIFSCCode( String IFSCCode) {
	IFSCCode = IFSCCode;
}
// Method to deposit money into the account
public void deposit(double amount) {
    if (amount > 0) {
        this.Balance += amount;
    }
}

// Method to withdraw money from the account
public boolean withdraw(double amount) {
    if (amount > 0 && (this.Balance - amount) >= 500) {
        this.Balance -= amount;
        return true;
    } else {
        return false;
    }
}
}
	
	

 

