package Builder;
import  java.util.*;

public class Product {
    List<String> parts = new ArrayList<String>();

    public void Add(String part) {
        parts.add(part);
    }

    public void Show() {
        System.out.println(" Product Build");
        for (String part:parts
             ) {
            System.out.println(part);
        }
    }
}
