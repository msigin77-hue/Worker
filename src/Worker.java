public class Worker {
    private OnTaskDoneListener callback;

    // Конструктор, принимающий listener
    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    // Метод для выполнения работы
    public void start() {
        for (int i = 0; i < 100; i++) {
            // Выполняем задачу и уведомляем через callback
            callback.onDone("Task " + i + " is done");
        }
    }
}
