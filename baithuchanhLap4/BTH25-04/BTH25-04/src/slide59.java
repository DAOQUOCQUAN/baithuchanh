import java.util.Set;
import java.util.LinkedHashSet;;

public class slide59 {
    public static void main(String[] args) {
        Set<String> linkedHash = new LinkedHashSet<String>();
        linkedHash.add("Java");
        linkedHash.add("C++");
        linkedHash.add("Java");
        linkedHash.add("PHP");
        for (String str : linkedHash) {
            System.out.println(str);
        }
    }
}