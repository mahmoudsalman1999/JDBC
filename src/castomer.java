public class castomer {
private int Cast_ID ;
private String First_Name ;
    private String Last_Name ;
    private String Phone ;
    private String Email ;
    private String City ;
    private String Streat ;

    public castomer() {

    }

    public castomer(int cast_ID, String first_Name, String last_Name, String phone, String email, String city, String streat) {
        Cast_ID = cast_ID;
        First_Name = first_Name;
        Last_Name = last_Name;
        Phone = phone;
        Email = email;
        City = city;
        Streat = streat;
    }

    public int getCast_ID() {
        return Cast_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getCity() {
        return City;
    }

    public String getStreat() {
        return Streat;
    }

    public void setCast_ID(int cast_ID) {
        Cast_ID = cast_ID;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setStreat(String streat) {
        Streat = streat;
    }

    @Override
    public String toString() {
        return "castomer{" +
                "Cast_ID=" + Cast_ID +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", City='" + City + '\'' +
                ", Streat='" + Streat + '\'' +
                '}';
    }
}
