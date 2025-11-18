
package classespackage;

public class Customer {
    private String customerId;
    private String name;
    private int total;

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total+=total;
    }

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.total = 0;
    }
    
    public void setData(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
    
    
}














