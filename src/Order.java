import java.util.Objects;

public class Order {
    String list;
    String dateOfOrder;
    int idOrder;

    public Order(String list, String dateOfOrder, int idOrder) {
        this.list = list;
        this.dateOfOrder = dateOfOrder;
        this.idOrder = idOrder;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(String dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "list='" + list + '\'' +
                ", dateOfOrder='" + dateOfOrder + '\'' +
                ", idOrder=" + idOrder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return idOrder == order.idOrder && Objects.equals(list, order.list) && Objects.equals(dateOfOrder, order.dateOfOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, dateOfOrder, idOrder);
    }
}
