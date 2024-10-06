package de.telran.hw_20_04okt_RegEx;

import de.telran.hw_19_02okt_Exception.Statistick;
import de.telran.hw_19_02okt_Exception.WrongLoginException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_RegEx {
    // 1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
    public static void main(String[] args) {
        // Опишем требования к нашему шаблону .В общем случае адрес электронной почты должен:
        //Состоять из двух частей, разделённых символом “@”.
        //Левая часть должна состоять из английских букв или цифр, может содержать точки и тире, притом после точки или тире обязательно должна следовать как минимум одна буква.
        //Правая часть должна содержать хотя бы одну точку в конце, после которой должны следовать от двух до 12 букв.
        //Начинаться обе части должны с буквенных символов.
        String emailRegex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,12}";  // Регулярное выражение для проверки email
        Pattern pattern = Pattern.compile(emailRegex); // компилируем паттерн
        Scanner scanner = new Scanner(System.in);
        boolean resalt = false;  // флаг для цикла   do-while
        do {
            System.out.println("Введите Email ");
            String email = scanner.next();
            Matcher matcher = pattern.matcher(email); // сопоставляем email с скомпилированным паттерном
            resalt = matcher.matches();
            if (resalt != true) System.out.println(" к сожалению вы ввели некорректный email ");
            else System.out.println(" email корректный ");
        } while (resalt != true);
    }
}
