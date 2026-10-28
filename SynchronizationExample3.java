package oops;

class BankAcc{
    int balance=10000;
    
    void withdraw(int amount){ //on adding only synchronized, the data became consistent
//        System.out.println("hello customer");
//        System.out.println("Pin verification");
//        System.out.println("Hello customer");
//        System.out.println("pin");

        synchronized(this){ //synchronized blocks kuch particular lines ko hi sync krta hai
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+"  is withdrawing "+amount);
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+" completed withdrawing.Remaining balance: "+balance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+ " - not enough balance!");
        }
    }
}
}
class withdrawthread extends Thread{
    BankAcc account;
    int amount;
    
    withdrawthread(BankAcc account,int amount){
        this.account=account;
        this.amount=amount;
    }
    public void run(){
        account.withdraw(amount);
    }
}
public class SynchronizationExample3 {
    public static void main(String[] args) {
        BankAcc b1= new BankAcc();
        //t1,t2,t3,t4 are different withdrawing methods upi,netbanking etc.
        withdrawthread t1= new withdrawthread(b1, 4000); //threads are running in an unsynchronized manner not following any order thread 1 can be executed befpre thread 0
        withdrawthread t2= new withdrawthread(b1, 3000);

        t1.start();
        t2.start();

         BankAcc b2= new BankAcc();

        withdrawthread t3= new withdrawthread(b2, 4000); //threads are running in an unsynchronized manner not following any order thread 1 can be executed befpre thread 0
        withdrawthread t4= new withdrawthread(b2, 3000);

        t3.start();
        t4.start();
    }
}