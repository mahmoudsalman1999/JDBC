public class store {
    private int store_ID ;
    private String Store_name;
    private String phone ;
    private String email ;
    private String city ;
    private String strea ;

    public store() {
    }

    public store(int store_ID, String store_name, String phone, String email, String city, String strea) {
        this.store_ID = store_ID;
        Store_name = store_name;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.strea = strea;
    }

    public int getStore_ID() {
        return store_ID;
    }

    public String getStore_name() {
        return Store_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getStrea() {
        return strea;
    }

    public void setStore_ID(int store_ID) {
        this.store_ID = store_ID;
    }

    public void setStore_name(String store_name) {
        Store_name = store_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStrea(String strea) {
        this.strea = strea;
    }

    @Override
    public String toString() {
        return "order{" +
                "store_ID=" + store_ID +
                ", Store_name='" + Store_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", strea='" + strea + '\'' +
                '}';
    }
}
