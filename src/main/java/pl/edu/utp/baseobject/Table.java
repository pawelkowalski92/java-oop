package pl.edu.utp.baseobject;

import java.util.Objects;

public class Table extends Object {

    String materialType;
    int legCount;
    double height;
    double width;
    double length;

    public Table(String materialType, int legCount, double height, double width, double length) {
        this.materialType = materialType;
        this.legCount = legCount;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Table(double height, double width, double length) {
        this("wood", 4, height, width, length);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            // is the same reference?
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Table) {
            // is the obj instance of Table?
            Table other = (Table) obj;
            // narrowing the reference
            return Objects.equals(materialType, other.materialType)
                    && legCount == other.legCount
                    && height == other.height
                    && width == other.width
                    && length == other.length;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(materialType);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Table table = (Table) o;
//        return legCount == table.legCount && Double.compare(table.height, height) == 0 && Double.compare(table.width, width) == 0 && Double.compare(table.length, length) == 0 && Objects.equals(materialType, table.materialType);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(materialType, legCount, height, width, length);
//    }

    @Override
    public String toString() {
        return "Table[material type: " + materialType +
                ", leg count: " + legCount +
                ", height: " + height +
                ", width: " + width +
                ", length: " + length +
                "]";
    }

}
