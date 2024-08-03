package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender {
    MALE("Мужской"), FEMALE("Женский");
    private final String russianTitle;

}
