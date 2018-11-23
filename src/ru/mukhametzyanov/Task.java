package ru.mukhametzyanov;

import java.util.*;

public class Task {
    /**
     * Метод удаляет элементы, у которых четное количество символов
     * @param set
     * @return
     */
    public static Set<String> removeEvenLength(Set<String> set) {
        Set<String> setData = new LinkedHashSet<>();
        String[] strings = set.toArray(new String[0]);
            //Iterator
        for (String string : strings) {
            //Фильтруем элементы массива и оставляем элементы с нечетной длиной
            if (string.length() % 2 == 1) {
                setData.add(string);
            }
        }
        System.out.println(setData);
        return setData;
    }

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bord", "spoon", "!", "dude"));
        removeEvenLength(set);
    }
}
