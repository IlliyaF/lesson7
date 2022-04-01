import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table("dining", 0, "walnut", true, "3/29/2022");
        Table table2 = new Table("kitchen", 5, "white", true, "12/18/1821");
        Table table3 = new Table("office", 3, "black", false, "08/12/2007");

        TblHashSet tblSet = new TblHashSet();

        //add
        boolean t1 = tblSet.add(table1);
        boolean t2 = tblSet.add(table2);
        boolean t3 = tblSet.add(table3);
        System.out.println("Add new HashSets: '\n'" + t1 + '\n' + t2 + '\n' + t3);


        //contains
        boolean contT1 = tblSet.contains(table1);
        boolean contT2 = tblSet.contains(table2);
        boolean contT3 = tblSet.contains(table3);
        System.out.println("Contains: table1 - " + contT1 + "; table2 - " + contT2 + "; table3 - " + contT3);

        //size
        int sizeTbl = tblSet.size();
        System.out.println("Size Table HashSet: " + sizeTbl);

        //HashCod
        System.out.println("HashCod of table1 = " + table1.hashCode());
        System.out.println("HashCod of table2 = " + table2.hashCode());
        System.out.println("HashCod of table3 = " + table3.hashCode());

        System.out.println("HashCod of our HashSet object = " + tblSet.hashCode());
        //toString
        System.out.println("Our Set to String: " + tblSet.toString());

        //to Array()
        Object [] newArray; //declared array
        newArray = tblSet.toArray();//executed method toArray
        System.out.println("Show toArray: " + Arrays.toString(newArray));

        //remove
        tblSet.remove(table2);
        System.out.println("Our Set after remove the object table2: " + tblSet.toString());

        //clear
        tblSet.clear();
        newArray = tblSet.toArray();
        System.out.println("Show HashSet after clear: " + Arrays.toString(newArray));

        //isEmpty
        System.out.println("Our Set is empty? " + tblSet.isEmpty());







    }
}
