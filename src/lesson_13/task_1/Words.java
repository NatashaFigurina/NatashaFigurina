package lesson_13.task_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class Words {
    public List<String> wordsList = List.of("car", "dog,", "pen", "flower", "cat", "dog", "bird", "go", "go", "phone", "name",
            "car", "age");
    HashSet<String> singularWord = new HashSet<>();
    HashMap<String, Integer> wordCount = new HashMap<>();

    public void fildingSingularWord() {
        for (String word : wordsList) {
            singularWord.add(word);
        }
        System.out.println("Уникальные слова:" + " " + singularWord);
    }

    public void isWordCount() {
        for (String word : wordsList) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Количество употреблений слова :");
        for (String word1 : wordCount.keySet()) {
            System.out.println(word1 + " " + wordCount.get(word1) + " " + "шт");
        }
    }
}