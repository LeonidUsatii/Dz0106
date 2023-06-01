package org.example;

import java.util.Arrays;
import java.util.Set;

/*
Создать класс "Dictionary" - таблица слов и их переводов.

dictionary.put("Hello", "Привет");
dictionary.put("Bye", "Пока");

dictionary.get("Hello"); // Привет

Вложенный класс - DictionaryPair (содержит исходное слово и перевод)
Внутренний класс - Translator

Класс содержит метод String[] translate(String[] words)

dictionary.put("Hello", "Привет");
dictionary.put("Bye", "Пока");

String[] words = {"Hello", "Bye", "Java"};

translator.translate(words); // {"Привет", "Пока", "Java"}

Он переводит входной набор слов по конкретному словарю.
 */
public class Main {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.put("Hello", "Привет");
        dictionary.put("Bye", "Пока");

        String[] words = {"Hello", "Bye", "Java"};

        Dictionary.Translator translator = dictionary.new Translator();

        System.out.println(Arrays.toString(translator.translate(words)));
    }
}