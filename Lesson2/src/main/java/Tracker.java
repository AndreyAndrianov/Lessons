import java.util.Random;

/**
 * @author Bulat Yusupov
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    private static final Random RANDOM = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Редактирование заявок.
     */
    public void update(Item item) {
//        String editedItemId = item.getId();
        Item editedItem = findById(item.getId());
        editedItem.setComments(item.getComments());
        editedItem.setDescription(item.getDescription());
        editedItem.setName(item.getName());
    }

    /**
     * Удаление заявок.
     */
    public void delete(Item item) {
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(item.getId())) {
                System.arraycopy(this.items, index + 1, this.items, index, this.position - index);
                position--;
            }
        }
    }

    /**
     * Получение списка всех заявок.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result [index] = this.items[index];
        }
        return result;
    }

    /**
     * Получение списка по имени.
     */
    public Item[] findByName(String key) {
        Item[] returnedItems = new Item[100];
        int arrayPosition = 0;
        for(int count = 0; count < position; count++){
            if (items[count] != null && items[count].getName().equals(key)) {
                returnedItems[arrayPosition] = items[count];
            }
        }
        return returnedItems;
    }

    /**
     * Получение заявки по ID.
     */
    protected Item findById(String id) {
        for(int count = 0; count < position; count++)
            if (items[count] != null && items[count].getId().equals(id))
                return items[count];
        return null;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        return String.valueOf(System.currentTimeMillis() + RANDOM.nextInt(100));
    }

}