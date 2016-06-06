public class EmployeeTest {

  public static void main(String[] args){
    Employee chris = new Employee("Chris", "Kempton", 80000);
    Employee whitney = new Employee("whitney", "Kempton", 70000);
    Employee arr[] = {chris, whitney};

    for (int i = 0; i < arr.length; i++ ) {
      arr[i].print();
      arr[i].setSalary(arr[i].getSalary() * 1.10);
      arr[i].print();
    }

  }

}
