package mirafuente;

import java.util.Scanner;

public class Mirafuente {

    public static void main(String[] args) {
    int emp_no, age, year_serv;
    String emp_name, add, gend;
    double bas_sal, ann_sal = 0;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("EMPLOYEE NO.:");
    emp_no = scan.nextInt();
    
    System.out.println("EMPLOYEE NAME:");
    emp_name = scan.nextLine();
     
    scan.nextLine();
    System.out.println("ADDRESS:");
    add = scan.nextLine();
    
    System.out.println("AGE:");
    age = scan.nextInt();
    
    scan.nextLine();
    System.out.println("GENDER:");
    gend = scan.nextLine();
    
    System.out.println("YEARS OF SERVICE:");
    year_serv = scan.nextInt();
    
    System.out.println("BASIC SALARY:");
    bas_sal = scan.nextDouble();
    
    ann_sal = bas_sal * 12;
    
    System.out.println("ANNUAL SALARY:"+ann_sal+"0");
    }
    
}
