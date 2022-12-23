package ru.skypro.calendar;

import java.time.LocalDateTime;

public interface Repeatable {

    boolean checkOccurance(LocalDateTime localDateTime);

}