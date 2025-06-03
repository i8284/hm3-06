import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Список первых клиентов
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        // Создаем пустую очередь и заполняем ее из списка firstClients
        Queue<String> clientQueue = new LinkedList<>(firstClients);

        // Цикл обработки очереди клиентов
        while (!clientQueue.isEmpty()) {
            // Извлекаем следующего клиента
            String currentClient = clientQueue.poll();

            // Обрабатываем клиента (делаем маникюр)
            System.out.println(currentClient + " сделал" + (currentClient.endsWith("a") ? "а" : "") + " новый маникюр.");

            // С вероятностью 50% добавляем друга клиента
            if (Math.random() < 0.5) {
                // Генерируем имя друга
                String friendName = "a friend of " + currentClient;

                // Добавляем друга в конец очереди
                clientQueue.offer(friendName);
            }
        }
    }
}
