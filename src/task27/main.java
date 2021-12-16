package task27;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class main {
    public static void main(String[] args) {
        // Создадим хеш-карточку
        Map<String, Integer> hashMap = new HashMap<>();

// Помещаем данные на карточку
        hashMap.put("Item 1", 5);
        hashMap.put("Item 2", 8);
        hashMap.put("Item 3", 12);
        hashMap.put("Item 4", 5);

// Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

// Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

// Добавляем значение
        int value = hashMap.get("Item 1");
        hashMap.put("Item 1", value + 3);
        System.out.println("Item 1 " + hashMap.get("Item 1"));
    }
}
