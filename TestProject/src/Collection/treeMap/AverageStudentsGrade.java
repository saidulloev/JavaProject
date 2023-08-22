package Collection.treeMap;

import java.util.Objects;

public class AverageStudentsGrade implements Comparable<AverageStudentsGrade> {
    private final String name;
    private final Float averageGrade;


    public AverageStudentsGrade(String name, float grade) {
        this.name = name;
        this.averageGrade = grade;
    }

    public String getName() {
        return name;
    }

    public Float getGrade() {
        return averageGrade;
    }

    @Override
    public int compareTo(AverageStudentsGrade that) {

        if (this.averageGrade < that.getGrade()) {
            return -1;
        }

        if (this.averageGrade > that.getGrade()) {
            return +1;
        }

        return name.compareTo(that.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AverageStudentsGrade that = (AverageStudentsGrade) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(averageGrade, that.averageGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, averageGrade);
    }

    @Override
    public String toString() {
        return "name = " + name + "     averageGrade = " + averageGrade;
    }
}
