package ylab.project.in;

import java.util.Scanner;

public class ConsoleReader {
    //Console reader для страницы авторизации
    private Scanner scanner = new Scanner(System.in);

    public Integer readValue(){
        return Integer.parseInt(scanner.next());
    }

}
