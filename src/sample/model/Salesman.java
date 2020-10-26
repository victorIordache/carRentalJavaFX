package sample.model;

import java.util.Date;

public class Salesman extends User{

    public int salesmanID;
    public int salary;
    public Date hiredAt;
    public Date resignedAt;

    public int getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        this.salesmanID = salesmanID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredAt() {
        return hiredAt;
    }

    public void setHiredAt(Date hiredAt) {
        this.hiredAt = hiredAt;
    }

    public Date getResignedAt() {
        return resignedAt;
    }

    public void setResignedAt(Date resignedAt) {
        this.resignedAt = resignedAt;
    }
}
