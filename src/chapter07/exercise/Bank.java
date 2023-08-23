package chapter07.exercise;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(Customer customer) {
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
        // customers[numberOfCustomers++] = customer;
        // 위 두줄이랑 같은 말입니당
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    Customer getCustomer(int index) {
        return customers[index];
    }
}
