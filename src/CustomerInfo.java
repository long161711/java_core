import java.util.Scanner;

public class CustomerInfo {
    private String customerName; //name
    private String customerAdd; //dia chi

    public Scanner scn  = new Scanner(System.in);
    public void inputData(){
        System.out.print("nhap ten account : " );
        this.customerName = this.scn.nextLine();
        System.out.print("nhap dia chi : ");
        this.customerAdd = this.scn.nextLine();
    }
    public void setCustomerName(String name) {
        this.customerName = name;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerAdd(String add) {
        this.customerAdd = add;
    }
    public String getCustomerAdd(){
        return this.customerAdd;
    }
    public String toString(){
        return getCustomerName() + " " + getCustomerAdd();
    }
    public void display(){
        System.out.println(getCustomerName() + " " + getCustomerAdd());
    }
}
