package Relp.practise;

public class Account {
	private long acc_no;
	  private String name,email;
	  private double amount;
	  
	  public long getAcc(){
	    return acc_no;
	  }
	  public String getName(){
	    return name;
	  }
	  public String getEmail(){
	    return email;
	  }
	  public double getAmount(){
	    return amount;
	  }
	  
	  public void setAcc(long l){
	    acc_no = l;
	  }
	  public void setName(String str1){
	    name = str1;
	  }
	  public void setemail(String str2){
	    email = str2;
	  }
	  public void setAmount(double d){
	    amount = d;
	  }
}
