# Auto-completion Algorithm 
Auto-completion Algorithm is an algorithm designed to suggest words to users as they type, based on the initial letters input. This system employs a trie (prefix tree) data structure for efficient word retrieval. The trie organizes each word by its characters, allowing the system to quickly offer completions by following the path of 
characters starting from the root of the trie. The goal is to provide rapid suggestions that match the user's input, reducing the number of words displayed and enhancing the user experience.\
This is a project made as a recruitment task for Kahoot. `Interview_task_-_summer_intern.pdf` contains description about this task.
## Algorithm
The `insert` method in the `Auto-completion` inserts word in tree, separating it by characters to different levels. Algorithm works as follows:
1. Changes input to lowercase to not contain same words in different cases.
2. Loops through word and adding it characters deeper in the tree.
3. If character already exists, algorithm moving to next level.
4. If algorithm reaches end of the word, it marks last character as end of the word in tree.

The `search` method in the `Auto-completion` searches for every word that can be contained in tree. Algorithm works as follows:
1. Changes input to lowercase to match stored characters.
2. Finds start node that have every next possible words.
3. If start node not found, returns empty list.
4. If start node found, recursively searches for words in every leaf.
## Usage Example
The following code creates an instance of CharTree with some words in it. Search method returns list of words that are auto-completion candidates.
```java
CharTree tree = new CharTree();
tree.insert("Car");
tree.insert("carPet");
tree.insert("java");
tree.insert("javascript");
tree.insert("internet");
List<String> result = tree.search("ca");
```
result:
```
[car, carpet]
```
## Library Methods
 - ##### `insert (String word)`
   Takes word and adds it to tree modifying it structure.\
   When `word` is empty or `null`, `insert` ignores this inputs.
 - ##### `search (String query)`
   Takes word and searches for every match in a tree.\
   When `word` is empty or `null`, `search` returns empty list.
## Tests
All tests were made with JUnit 5.
 - #### `CharTreeEmptyTests`
   Tests checking for proper results when tree is empty.
 - #### `CharTreeKahootTests`
   Tests search results with tests provided in Kahoot interview task.
 - #### `CharTreeMyTests`
   Tests search results in different scenarios provided by me.
## Build with:
- `Java 17` - Project base
- `Maven` - Build tool
- `JUnit 5` - Unit testing
- `JetBrains IntellijIDEA` - IDE
