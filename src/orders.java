public class orders {
    private int order_ID ;
    private  String order_state ;
    private  int cast_ID;


    public orders() {
    }

    public orders(int order_ID, String order_state, int cast_ID) {
        this.order_ID = order_ID;
        this.order_state = order_state;
        this.cast_ID = cast_ID;

    }

    public int getOrder_ID() {
        return order_ID;
    }

    public String getOrder_state() {
        return order_state;
    }

    public int getCast_ID() {
        return cast_ID;
    }


    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public void setCast_ID(int cast_ID) {
        this.cast_ID = cast_ID;
    }




}

