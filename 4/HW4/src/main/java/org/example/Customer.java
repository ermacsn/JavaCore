package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Покупатель
 */
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private String name;
    private Gender gender;
}
