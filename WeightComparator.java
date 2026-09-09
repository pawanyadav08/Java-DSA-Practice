import java.util.Comparator;

public class WeightComparator implements Comparator<Stu> {
    @Override
    public int compare(Stu o1, Stu o2) {
        return Integer.compare(o1.weight,o2.weight);
    }
}
