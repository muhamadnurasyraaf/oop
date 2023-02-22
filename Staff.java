public class Staff extends Uitm{
    String staffCode;

    public Staff(){
        super();
        staffCode = null;
    }
    public Staff(String id,String branch,int age,String sCode){
        super(id,branch,age);
        staffCode = sCode;
    }

    public String getStaffCode(){return staffCode;}

    
    public double calcFee(){
        return 1200.00;
    }

    public String toString(){
        return super.toString() + "\nStaff Code : " + staffCode + "\n";
    }
}
