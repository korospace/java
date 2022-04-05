package A4.immutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KindOfImmutablelist {
    public static void main(String[] args) {
        List<String> empty = Collections.emptyList();
        //empty.add("four"); // error
        List<String> singleList = Collections.singletonList("one");
        //singleList.add("four"); // error
        List<String> names = List.of("two","tree");
        //names.add("four"); // error

        List<String> products = new ArrayList<>();
        products.add("tes1");
        products.add("tes2");

        List<String> immutableProducts = Collections.unmodifiableList(products);
        //immutableProducts.add("haha"); // error
    }
}
