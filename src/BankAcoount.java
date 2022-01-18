import java.util.Scanner;

public class BankAcoount extends CustomerInfo{
    public double acoountBalance; //so du tai khoan
    public double withdrawNum; // so tien rut
    public double depositNum; //so tien guoi
    public String accountNo ; //STK
    public double accountInterest; //lãi suat tai khoan

    public Scanner scn= new Scanner(System.in);
    public void doWithdraw (){ // thuc hien rut tien
        boolean i = true;

        do{
            try {
                System.out.print("nhap so tien can rut :");
                double sotienrut= scn.nextDouble();
                if(sotienrut <=this.acoountBalance){
                    System.out.println("rut tien thanh cong");
                    this.acoountBalance = this.acoountBalance - sotienrut;
                    this.computeMonthInterest();
                    i =false;
                }
                else {
                    System.out.println("so du khong du nhap lai so tien can rut ");
                }
            }
            catch (Exception e){
                scn.nextLine();
                System.out.println("so tien nhap k hop le");
            }
        }while (i);
    }
    public void depositNum (){
        boolean i = true;
        do{
            try{
                System.out.println("nhap so tien can nop");
                double sotiennop = scn.nextDouble();
                if(sotiennop>0){
                    this.acoountBalance = this.acoountBalance + sotiennop;
                    this.computeMonthInterest();
                    i = false;
                }
                else {
                    System.out.println("so tien nop nhap < 0 khong hop le");

                }
            }
            catch (Exception e){
                scn.nextLine();
                System.out.println("so tien nop nhap k hop le");
            }
        }while (i);
    }
    public void computeMonthInterest(){
        this.accountInterest = this.acoountBalance * BankPolicy.interestRate/12;
    }
    public void display(){
        super.display();
        System.out.println(this.accountNo + " " +this.acoountBalance +" " +this.accountInterest);
    }
    public String toString(){
        String customer = super.toString();
        return customer + " " +this.accountNo + " " + this.acoountBalance + " " +this.accountInterest;
    }
    public void inputData(){
        super.inputData();
        System.out.print("nhap so tai khoan");
        this.accountNo = this.scn.nextLine();
        boolean i = true;
        do{
            try {
                System.out.print("nhap so Du tai khoan");
                this.acoountBalance = this.scn.nextDouble();
                i = false;
            }catch (Exception e){
                scn.nextLine();
                System.out.println("so du tai khoan k hop le");
            }
        }while (i);
        this.computeMonthInterest();

    }

}
