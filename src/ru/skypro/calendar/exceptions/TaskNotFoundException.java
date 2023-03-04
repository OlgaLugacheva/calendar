package ru.skypro.calendar.exceptions;


public class TaskNotFoundException extends Exception {

    public TaskNotFoundException() {
    }

    public TaskNotFoundException(String message) {
        super(message);
    }
}
