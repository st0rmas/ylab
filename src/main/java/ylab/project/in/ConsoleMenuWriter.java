package ylab.project.in;

public class ConsoleMenuWriter {
    public static void authMenu(){
        System.out.print("[1]. Login\n" +
                "[2]. Sign up\n" +
                "[0]. Exit\n" +
                ">>> ");
    }
    public static void userMenu(){
        System.out.println("[1]. Получить актуальные показатели");
        System.out.println("[2]. Подать показания");
        System.out.println("[3]. Просмотр показаний за конкретный месяц");
        System.out.println("[4]. Просмотр истории показаний");
        System.out.print(">>> ");
    }

}
