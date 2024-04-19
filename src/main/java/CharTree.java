import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharTree {

    private static class Node {
        Map<Character, Node> children;
        boolean wordEnd = false;

        public Node() {
            children = new HashMap<>();
        }
    }

    private final Node root;

    public CharTree() {
        root = new Node();
    }

    public void insert(String word) {
        if (word == null) {
            System.out.println("Null cannot be stored");
            return;
        }
        if (word.isEmpty()) {
            System.out.println("Empty word cannot be stored");
            return;
        }

        Node current = root;
        word = word.toLowerCase();

        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new Node());
            current = current.children.get(c);
        }

        current.wordEnd = true;
    }

    public List<String> search(String query) {
        List<String> words = new ArrayList<>();
        if (query == null || query.isEmpty())
            return words;

        query = query.toLowerCase();
        Node current = startNode(query);

        if (current != null)
            searchWords(current, query, words);

        return words;
    }

    private void searchWords(Node root, String query, List<String> words) {
        if (root.wordEnd)
            words.add(query);

        for (Map.Entry<Character, Node> child : root.children.entrySet())
            searchWords(child.getValue(), query + child.getKey(), words);
    }

    private Node startNode(String query) {
        Node current = root;

        for (char c : query.toCharArray()) {
            current = current.children.get(c);
            if (current == null)
                return null;
        }

        return current;
    }

}