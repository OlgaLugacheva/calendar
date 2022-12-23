package ru.skypro.calendar;

import ru.skypro.calendar.exceptions.WrongInputException;

import java.time.LocalDateTime;

public class DailyTask extends Task implements Repeatable {
    public DailyTask(String title, String description, TaskType taskType, LocalDateTime date) throws WrongInputException {
        super(title, description, taskType, date);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestedDate) {

        return getFirstDate().toLocalDate().equals(requestedDate.toLocalDate());
    }
}