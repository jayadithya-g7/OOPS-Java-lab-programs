class employee{
 
    String emp_name; int emp_id;
    String address; String mailid; int mobileno;
     
    public void calculatepayslip(float salary){
     
     
    float netsalary=0;
    System.out.println("employee name:"+emp_name); System.out.println("employee id:"+emp_id); System.out.println("gross salary:"+salary);
     
    netsalary=salary+((97/100)+salary)+((10/100)*salary)-((12/100)*salary)-(float) ((0.1/100)*salary);
     
    System.out.println("netsalary:"+netsalary);
     
     
    }
     
    }
     
    class programmer extends employee{
     
     
    }
     
     
    class assistantprofessor extends employee{
     
    }
     
    class associateprofessor extends employee{
     
    }
     
    class professor extends employee{
     
    }
    
    public class payslip{
     
    public static void main(String[] args){ professor prof=new professor();
    prof.emp_name="Jayadithya G"; prof.emp_id=7; prof.calculatepayslip(5000000);
     
     
    }
     
     
    }
