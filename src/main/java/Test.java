import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CharTree tree = new CharTree();
        //car, carpet, java, javascript, internet
        tree.insert("car");
        tree.insert("carpet");
        tree.insert("cow");
        tree.insert("java");
        tree.insert("javascript");
        tree.insert("internet");
        tree.insert("python");
        tree.insert("php");
        tree.insert("aleks");
        tree.insert("cheese");
        tree.insert("milk");
        tree.insert("pepper");
        tree.insert("potato");
        System.out.println(tree.search("C"));



//        List<String> list = new ArrayList<>(List.of("car", "carpet"));
//        List<String> list2 = new ArrayList<>(List.of("java", "javascript"));
//        List<String> list3 = new ArrayList<>();
//        list3.addAll(list);
//        list3.addAll(list2);
//        System.out.println("list: " + list3);

    }
}
