package com.modernjava.prepare.forty.sync;

/* The following Java application shows how the transactions in a bank can be carried out concurrently. */
class Account {
    public int balance;
    public int accountNo; // 執行時期、編譯時期 -> 這兩個時期都會出現錯誤
//    public int accountNo;

    void displayBalance() {
        System.out.println("Account No:" + accountNo + "Balance: " + balance);
    }

    synchronized void deposit(int amount){ // java keywords 關鍵字/保留字
        balance = balance + amount;
        System.out.println( amount + " is deposited");
        displayBalance();
    }

    synchronized void withdraw(int amount){
        balance = balance - amount;
        System.out.println( amount + " is withdrawn");
        displayBalance();
    }
}

// 存款
class TransactionDeposit implements Runnable{
    int amount;
    Account accountX;

//    TransactionDeposit(){
//
//    }

    TransactionDeposit(Account x, int amount){
        accountX = x;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run(){
        accountX.deposit(amount);
    }
}

// 取款
class TransactionWithdraw implements Runnable{
    int amount;
    Account accountY;

    TransactionWithdraw(Account y, int amount) {
        accountY = y;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run(){

        accountY.withdraw(amount);
    }
}

public class Demonstration_119 extends Thread{

//    private static Account ABC;
//    private static TransactionDeposit t1;
//    private static TransactionWithdraw t2;

    public static void main(String args[]) {
        Account ABC = new Account();
        ABC.balance = 1000;
        ABC.accountNo = 111;

        TransactionDeposit t1;
        TransactionWithdraw t2;

        t1 = new TransactionDeposit(ABC, 500);
//        t1 = new TransactionDeposit();

        t2 = new TransactionWithdraw(ABC, 900);

//        Demonstration_119 thread = new Demonstration_119();
//        thread.start(); // 啟動執行緒
//        System.out.println("This code is outside of the thread");
    }

//    public void run() {
//        System.out.println("This code is running in a thread");
//
//    }



}
