import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharTreeKahootTests {

    private CharTree tree;
    @BeforeEach
    void setUp() {
        tree = new CharTree();
        tree.insert("car");
        tree.insert("carpet");
        tree.insert("java");
        tree.insert("javascript");
        tree.insert("internet");
    }

    @Test
    void search_kahoot_scenario_a(){
        List<String> expected = new ArrayList<String>(List.of("car", "carpet"));

        List<String> actualItems = tree.search("c");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_kahoot_scenario_b(){
        List<String> expected = new ArrayList<String>(List.of("car", "carpet"));

        List<String> actualItems = tree.search("car");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_kahoot_scenario_c(){
        List<String> expected = new ArrayList<String>(List.of("carpet"));

        List<String> actualItems = tree.search("carp");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_kahoot_scenario_d(){
        List<String> expected = new ArrayList<String>(List.of("java", "javascript"));

        List<String> actualItems = tree.search("jav");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_kahoot_scenario_e(){
        List<String> expected = new ArrayList<String>(List.of("internet"));

        List<String> actualItems = tree.search("intern");

        assertEquals(expected, actualItems, "Lists are not matched");
    }

    @Test
    void search_kahoot_scenario_f(){
        List<String> expected = new ArrayList<String>();

        List<String> actualItems = tree.search("foo");

        assertEquals(expected, actualItems, "Search should return empty list");
    }

}