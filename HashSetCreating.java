import java.util.HashSet;
import java.util.Iterator;


public class HashSetCreating {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<20;i++)
            set.add(i);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> i = set.iterator();
        while (i.hasNext())
        {
            Integer n = i.next();
            if (n>10)
                i.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet a = createSet();
        removeAllNumbersMoreThan10(a);
        System.out.println(a.size());
    }
}