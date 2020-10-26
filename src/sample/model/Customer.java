package sample.model;

public class Customer extends User {

    public int customerID;
    //every customer has a budget / top-up function
    // if a salesman wants to rent a car, he has to come as a customer, then i check if he's a salesman indeed ( if true ==> apply 1-2% discount )
    public int budget;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void topUpAccount(int budget){
        if(budget > 0 ) {
            this.budget += budget;
        }
        // What do I want to do if his input is -100 ?
    }
}
