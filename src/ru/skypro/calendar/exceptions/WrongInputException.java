package ru.skypro.calendar.exceptions;


public class WrongInputException extends Exception {

    public WrongInputException() {
    }

    public WrongInputException(String message) {
        super(message);
    }
}
