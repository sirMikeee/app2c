
package banking;

public class bankApp {
    
    int accNo = 100012, pin = 1234;
    float balance;
    
    public boolean verifyAccount(int acc, int pn){
        if(accNo == acc && pin == pn){
            return true;
        }else{
            return false;
        }
    }
    
    public void withdraw(){
    
    }
    
    public void deposit(){
    
    }
    
}
