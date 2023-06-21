
class EmployeeDetails{
String name;
String position;
int salary;
int experience;
String educational ;


public String getEmp_name() {  
    return name;  
}  
public void setEmp_name(String name) {  
    this.name = name;  
}  
//
public String getEmp_position() {  
    return position;  
}  
public void setEmp_position(String position) {  
    this.position = position;  
}  

//
// public int getEmp_salary() {  
//     return salary;  
// }  
// public void setEmp_salary(int salary) { 

//     this.salary = salary;  
// }  
//
public int getEmp_experience() {  
    return experience;  
}  
public void setEmp_experience(int experience) {  
    this.experience = experience;  
}  
//
public String getEmp_educational() {  
    return educational;  
}  
public void setEmp_educational(String educational) {  
    this.educational = educational;  
}  


public int basic_Salary() {
    int salar;
    educational=getEmp_educational;
    experience=getEmp_experience
if (educational="Bachelor"){
salar= (500) + (500 * 5% * experience);

}
else if(educational="diploma" ){
  salar= (250) + (250 * 5% * experience)  ;
}
else{
  salar= 0;
}
return salar;
}
public void calculated_Salary(int salar){
position=getEmp_position();
if(position="full"){
 salar= basic Salary * 3% ;
}
else{
 salar=basic Salary * 1.5% ;
}
}

@Override  
public String toString() {  
    return "Employee [name = " + getEmp_name() + ", salary = " + salary + ", position = " + getEmp_position() + ", experience = " + getEmp_experience()  
            + ", educational = " + getEmp_educational() "]";  
    } 
}

public class Employee{  

    public static void main(String args[]) {  

        EmployeeDetails emp = new EmployeeDetails();  
    
        emp.setEmp_name("hessa ");  
        emp.setEmp_position("full");
        emp.setEmp_experience(1);
        emp.setEmp_educational("Bachelor");



         System.out.println(emp);  



    }
    }
