import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(100, "Group");
        Employee employee2 = new SalariedEmployees(77, "Squad", 1000000);

        Generic<Employee>genericEmployee = new Generic<>(employee);
        System.out.println("Employee Details " + genericEmployee.displayEmployeeDetails());

        Generic<Employee>genericEmployee2 = new Generic<>(employee2);
        System.out.println("Employee Details " + genericEmployee2.displayEmployeeDetails());

        Employee employee3 = new Employee(100, "Group 7");
        GenericInterface<Employee> retrograde = new GenericInterfaceImp();
        retrograde.print(employee3);

        List<String> stringList = List.of("A","B","C");
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printList(stringList);





    }
}