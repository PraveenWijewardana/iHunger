
package classespackage;

public class Order {
    private String id;
    private String customerId;
    private int price;
    private String status;
    
    public final static String STATUS1 = "Prepairing";
    public final static String STATUS2 = "Delevered";
    public final static String STATUS3 = "Canceled";

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

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
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Order(String id, String customerId, int price) {
        this.id = id;
        this.customerId = customerId;
        this.price = price;
        this.status = STATUS1;
    }
    
}
