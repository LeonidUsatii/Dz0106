package org.example;

public class Dictionary {
    DictionaryPair[] dictionary;
    int count;

    public Dictionary() {
        this.dictionary = new DictionaryPair[10];
        this.count = 0;
    }

    public static class DictionaryPair {
        private final String word;
        private String translate;

        public DictionaryPair(String word, String translate) {
            this.word = word;
            this.translate = translate;
        }
    }

    public class Translator {

        public String[] translate(String[] words) {

            String[] translates = new String[words.length];

            for (int i = 0; i < words.length; i++) {
                if (dictionary[i] == null) {
                    put(" ", " ");
                }
                if (words[i].equals(dictionary[i].word)) {
                    translates[i] = dictionary[i].translate;
                } else {
                    translates[i] = words[i];
                }

            }

            return translates;
        }
    }

    public void put(String word, String translate) {
        for (int i = 0; i < count; i++) {
            if (dictionary[i].word.equals(word)) {
                dictionary[i].translate = translate;
                return;
            }
        }
        dictionary[count] = new DictionaryPair(word, translate);
        count++;
    }

    public String get(String word) {
        for (int i = 0; i < count; i++) {
            if (dictionary[i].word.equals(word)) {
                return dictionary[i].translate;
            }
        }
        throw new IllegalArgumentException("Ключа <" + word + "> в таблице нет");
    }

}
