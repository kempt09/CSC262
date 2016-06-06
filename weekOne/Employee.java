public class Employee {

  private String firstName;
  private String lastName;
  private double salary;

  public Employee(String firstName, String lastName, double salary){
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public double getSalary(){
    return salary;
  }

  public void setSalary(double a){
    salary = a;
  }

  public String getFirst(){
    return firstName;
  }

  public void setFirst(String a){
    firstName = a;
  }

  public String getLast(){
    return lastName;
  }

  public void setLast(String a){
    lastName = a;
  }

  public void print(){
    System.out.println("Name: " + getFirst() + " " + getLast());
    System.out.println("Salary: " + getSalary());
  }

}
