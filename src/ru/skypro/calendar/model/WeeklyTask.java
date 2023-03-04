package ru.skypro.calendar.model;

import ru.skypro.calendar.Repeatable;
import ru.skypro.calendar.TaskType;
import ru.skypro.calendar.exceptions.WrongInputException;

import java.time.LocalDateTime;

public class WeeklyTask extends Task implements Repeatable {
    public WeeklyTask(String title, String description, TaskType taskType, LocalDateTime date) throws WrongInputException {
        super(title, description, taskType, date);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestedDate) {
        return getFirstDate().getDayOfWeek().equals(requestedDate.getDayOfWeek());
    }
}
