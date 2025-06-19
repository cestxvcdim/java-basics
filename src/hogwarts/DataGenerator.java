package hogwarts;

import java.lang.reflect.Constructor;
import java.util.Random;

// Да, мне помог GPT, не вижу ничего криминального в том, что он помог мне создать генерацию рандомных объектов.
// К тому же, я приблизительно понимаю, что тут происходит.
public class DataGenerator {
    private final Random rnd = new Random();
    /**
     * Генерирует новый объект заданного класса.
     * Предполагается, что у класса ровно один конструктор,
     * и все его параметры — примитивные int.
     *
     * @param clazz класс, экземпляр которого нужно создать
     * @param <T>   тип создаваемого объекта
     * @return новый экземпляр T, созданный с помощью конструктора
     */
    public <T> T generate(Class<T> clazz, String fullName) {
        try {
            // Берём единственный конструктор
            Constructor<T> ctor = (Constructor<T>) clazz.getDeclaredConstructors()[0];
            ctor.setAccessible(true);

            // Сколько параметров в конструкторе
            int parameterCount = ctor.getParameterCount();

            Object[] args = new Object[parameterCount];
            for (int i = 0; i < parameterCount - 1; i++) {
                args[i] = rnd.nextInt(101);
            }
            args[parameterCount-1] = fullName;

            // Создаём объект
            return ctor.newInstance(args);
        }
        catch (Exception e) {
            throw new RuntimeException("Ошибка генерации " + clazz.getSimpleName(), e);
        }
    }
}
