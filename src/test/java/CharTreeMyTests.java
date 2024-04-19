import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CharTreeMyTests {

    private CharTree tree;
    @BeforeEach
    void setUp() {
        tree = new CharTree();
        tree.insert("caR");
        tree.insert("cArpet");
        tree.insert("Cow");
        tree.insert("COW");
        tree.insert("COW");
        tree.insert("java");
        tree.insert("javascript");
        tree.insert("internet");
        tree.insert("python");
        tree.insert("php");
        tree.insert("cheese");
        tree.insert("pepper");
        tree.insert("potato");
        tree.insert("");
        tree.insert(null);
    }

    @Test
    void search_my_scenario_0(){
        List<String> expected = new ArrayList<String>(List.of(
                "car",
                "carpet"
        ));

        List<String> actualItems = tree.search("ca");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_my_scenario_1(){
        List<String> expected = new ArrayList<String>(List.of(
                "car",
                "carpet",
                "cheese",
                "cow"));

        List<String> actualItems = tree.search("c");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_my_scenario_2(){
        List<String> expected = new ArrayList<String>();

        List<String> actualItems = tree.search("cowd");

        assertEquals(expected, actualItems, "Search should return empty list");
    }

    @Test
    void search_my_scenario_3(){
        List<String> expected = new ArrayList<String>(List.of("cheese"));

        List<String> actualItems = tree.search("chees");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_my_scenario_4(){
        List<String> expected = new ArrayList<String>();

        List<String> actualItems = tree.search("ruby");

        assertEquals(expected, actualItems, "Search should return empty list");
    }
}
