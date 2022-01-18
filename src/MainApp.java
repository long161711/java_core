import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public ArrayList<BankAcoount> accountList = new ArrayList<BankAcoount>();
    public Scanner scn = new Scanner(System.in);
    public void initBank (){
        while (true){
            BankAcoount account =  new BankAcoount();
            account.inputData();
            accountList.add(account);
            System.out.print("ban co muon them account nua khong (y = co : n = khong):");
            String tt = scn.nextLine();
            if(tt.equals("y")){
                continue;
            }
            else {
                break;
            }
        }
    }
    public void display(){
        for (BankAcoount a : accountList){
            a.display();
        }
    }

    public static void  main(String [] args){
        MainApp alo = new MainApp();
        alo.initBank();
        alo.display();
        for(BankAcoount a :alo.accountList){
            a.doWithdraw();
            a.depositNum();
        }

        alo.display();
    }
}
