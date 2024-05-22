package com.rbi.operation;
import java.util.Scanner;
import com.rbi.model.Account;
public class Operation {

	
	static Account ac=new Account();
    Scanner sc = new Scanner(System.in);
    
    	public void CreateAccount() {
    		
    System.out.println("Enter Bank name");
        	ac.setBankName(sc.nextLine());
        	
    	System.out.println("Enter Customer Name");
    		ac.setCustomerName(sc.nextLine());
    		
      System.out.println("Enter Customer Id");
    	ac.setCustomerId(sc.nextInt());
    	
    	System.out.println("Enter IFSC Code");
    	ac.setIFSCCode(sc.next());
    	
    	System.out.println("Enter Account Number");
    	ac.setAccountNo(sc.nextLong());
    	
    	System.out.println("Enter Aadhar Number");
    	ac.setAdharNo(sc.nextLong());
  
    	 //sc.nextLine();
    	System.out.println("Enter Pan Card Number");
    	ac.setPanCard(sc.nextInt());
    	
    	System.out.println("Enter type of account");
    	ac.setAccoutnType(sc.nextLine());
    	sc.nextLine();
    	
    	System.out.println("Enter you Address");
    	ac.setAddress(sc.nextLine());
    	
    	System.out.println("Enter your PinCode");
    	ac.setPinCode(sc.nextInt());
    	
    	System.out.println("Enter your Mobile Number");
    	ac.setMobileNo(sc.nextLong());
    	
    	 /*while (true) {
             System.out.println("Enter Deposit Amount");
             double balance = sc.nextDouble();
             if (balance >= 500) {
                 ac.deposit(balance);
                 break;
             } else {
                 System.out.println("Insufficient amount, initial deposit must be at least 500");
             }
         }
         
         System.out.println("Enter Withdraw Amount");
         double withdrawAmount = sc.nextDouble();
         if (ac.withdraw(withdrawAmount)) {
             System.out.println("Withdrawal successful");
         } else {
             System.out.println("Withdrawal failed, insufficient funds or minimum balance requirement not met");
         }
         
         System.out.println("Total Balance: " + ac.getBalance());
     }*/
    	while (true) {
            System.out.println("Enter Deposit Amount");
            double balance = sc.nextDouble();
            if (balance >= 500) {
                ac.deposit(balance);
                break;
            } else {
                System.out.println("Insufficient amount,initial deposit must be at least 500");
            }
        }
        System.out.println("Enter Withdraw Amount");
        double withdrawAmount = sc.nextDouble();
        if (ac.withdraw(withdrawAmount)) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed, insufficient funds or minimum balance requirement not met");
        }
        System.out.println("Total Balance: " + ac.getBalance());
    }
    	public void showAccountDetails() {
    		System.out.println("ACCOUNT DETAILS");
    		//while (true) {
    			
    		System.out.println("Enter your customer Id");
    			int cid = sc.nextInt();
    			
    		if(cid == ac.getCustomerId())
    			
    		
    		{
    			System.out.println("Customer Name:"+ac.getCustomerName());
    			//System.out.println("ac.getCustomerName()");
    			System.out.println("Account number:"+ac.getAccountNo());
    			System.out.println("IFSC code:"+ac.getIFSCCode());
    			System.out.println("Account Type:"+ac.getAccoutnType());
    			System.out.println("Deposite :"+ac.getDeposite());
    			System.out.println("Withdraw:"+ac.getWithdraw());
    			System.out.println("Balance:"+ac.getBalance());
                System.out.println("Aadhar number:"+ac.getAdharNo());
    			System.out.println("Pan Card:"+ac.getPanCard());
    			System.out.println("Address:"+ac.getAddress());
    			System.out.println("Pin code:"+ac.getPinCode());
    			System.out.println("Mobile number:"+ac.getMobileNo());
    			
    		}
    		else
    		{
    			System.out.println("customer Id does not exit");
    		}
    		
    		}
    	
    	public static void main(String[] args) {
    		Operation op = new Operation ();
    		op.CreateAccount();
    		op.showAccountDetails();
    		
		}
		
		}

