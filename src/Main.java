import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table("dining", 0, "walnut", true, "3/29/2022");
        Table table2 = new Table("dining", 0, "walnuts", true, "3/29/2022");
        Table table3 = new Table("dining", 0, "walnutd", true, "3/29/2022");

        Set <Table> tblSet = new HashSet();
        tblSet.add(table1);
        tblSet.add(table2);
        tblSet.add(table3);
        boolean contT1 = tblSet.contains(table1);
        int sizeT1 = tblSet.size();
        System.out.println(table1.hashCode());
        System.out.println(table2.hashCode());
        System.out.println(table3.hashCode());

        System.out.println(tblSet.hashCode());
        System.out.println(tblSet.equals(table1));
        System.out.println(tblSet.toString());
        System.out.println(contT1);
        System.out.println(sizeT1);
    }
}
