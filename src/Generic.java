public class Generic <T extends Employee>{

    public T employee;

    public Generic(T employee) {
        this.employee = employee;
    }


    public T getEmployee(){

        return employee;
    }

    public void setEmployee(T employee){

        this.employee = employee;
    }

    public String displayEmployeeDetails(){

        return employee.toString();
    }


}

