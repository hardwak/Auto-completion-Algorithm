import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CharTreeEmptyTests {

    private CharTree tree;
    @BeforeEach
    void setUp() {
        tree = new CharTree();
    }

    @Test
    void search_in_empty_dict_0(){
        List<String> expected = new ArrayList<String>();

        List<String> actualItems = tree.search("");

        assertEquals(expected, actualItems, "Search should return empty list");
    }

    @Test
    void search_in_empty_dict_1(){
        List<String> expected = new ArrayList<String>();

        List<String> actualItems = tree.search("ca");

        assertEquals(expected, actualItems, "Search should return empty list");
    }

    @Test
    void search_in_empty_dict_2(){
        List<String> expected = new ArrayList<String>();

        List<String> actualItems = tree.search(null);

        assertEquals(expected, actualItems, "Search should return empty list");
    }

}
