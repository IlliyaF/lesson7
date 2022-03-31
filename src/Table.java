import java.util.Objects;

public class Table {
String tableType;
int tableQuantityBox;
String tableColor;
boolean tableIsFolding;
String tableDateProduction;

    public Table(String tableType, int tableQuantityBox, String tableColor, boolean tableIsFolding, String tableDateProduction) {
        this.tableType = tableType;
        this.tableQuantityBox = tableQuantityBox;
        this.tableColor = tableColor;
        this.tableIsFolding = tableIsFolding;
        this.tableDateProduction = tableDateProduction;


    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false;
        Table table = (Table) o;
        return tableQuantityBox == table.tableQuantityBox && tableIsFolding == table.tableIsFolding && tableType.equals(table.tableType) && Objects.equals(tableColor, table.tableColor) && Objects.equals(tableDateProduction, table.tableDateProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableType, tableQuantityBox, tableColor, tableIsFolding, tableDateProduction);
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableType='" + tableType + '\'' +
                ", tableQuantityBox=" + tableQuantityBox +
                ", tableColor='" + tableColor + '\'' +
                ", tableIsFolding=" + tableIsFolding +
                ", tableDateProduction='" + tableDateProduction + '\'' +
                '}';
    }
}
