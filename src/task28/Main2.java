package task28;



import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;

class Anonymous {

    public void nonStaticMethod() {
        // собственно наш анонимный класс
        Consumer<String> foo = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o + " TODO something useful!");
            }
        };

        foo.accept("Работа анонимного класса в НЕстатическом методе.");

        // достаем конструктор у анонимного класса
        Constructor[] constructors = foo.getClass().getDeclaredConstructors();
        // Записываем ссылку на объект Anonymous в массив параметров, для конструктора.
        Object[] params = new Object[1];
        params[0] = this;

        // Создаем новую ссылку типа Consumer
        Consumer otherInstance = null;
        try {
            // создаем новый экземпляр анонимного класса, передав в его конструктор массив параметров, ссылку на текущий
            // класс, в котором мы и осуществляем все манипуляции с анонимным классом.
            otherInstance = (Consumer) constructors[0].newInstance(params);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        otherInstance.accept("Работа второго экземпляра анонимного класса в НЕстатическом методе.");
    }

    public static void main(String[] args) {
        Anonymous anon = new Anonymous();
        anon.nonStaticMethod();
    }
}

