package com.DoctorApp;

import com.DoctorApp.service.DoctorService;

import java.util.Scanner;

public class AppDataParser {

    public static void main(String[] args) {
        DoctorService service = new DoctorService();
        System.out.println("Главное меню");
        System.out.println("1. Добавление доктора к JSON файлу");
        System.out.println("2. Смотреть список докторов");
        System.out.println("3. Объединение множеств");
        System.out.println("4. Выйти из приложения");
        Scanner scanner = new Scanner(System.in);
        int sa = scanner.nextInt();
        switch (sa) {
            case 1:
                service.addDoctorWithJson();
                break;
            case 2:
                service.showDoctorWithJson();
                break;
            case 3:
                service.WriteUnion();
                break;
            case 4:
                break;
        }
    }
}
