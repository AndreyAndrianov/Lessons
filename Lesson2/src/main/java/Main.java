public class Main {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "Descr", 123L);
        item = tracker.add(item);
        System.out.println(item.getName());
    }
}
