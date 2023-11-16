import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        //castomer s1 = new castomer(3, "salman" , "ddd" ,"01145055","dgggg", "fgdfg","dgdfgfdg");

        cast s = new castomerdoai();
       // s.save(s1);
        s.deletbyID(1);
        s.findbyID(3);
        System.out.println("-------------------------------");
        s.fidall();
        System.out.println("-------------------------------");
        store r1 = new store(2,"Tome","01145055318","sm505939","Tanta","ST-60");
        stoerint r = new storeimp();
       // r.save(r1);
        r.fidall();
        System.out.println("-------------------------------");
        r.findbyID(1);
        System.out.println("-------------------------------");
        r.deletbyID(2);
        r.fidall();
        System.out.println("-------------------------------");

    }
}