package ru.skypro.util;

import ru.skypro.calendar.exceptions.WrongInputException;

import java.util.InputMismatchException;

public class ValidateUtils {

    public static String checkString(String str) throws WrongInputException {
        if (str == null || str.isEmpty() || str.isBlank()) {
            throw new WrongInputException("Некорректный ввод");
        } else {
            return str;
        }
    }
}
