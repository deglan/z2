package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {

    WELCOME("Hello, please select the length of your token. \n " +
            "You can choose between 5, 10 and 15"),
    TOKEN("Your token is: "),
    WRONG_NUMBER("Invalid number. \n" +
            "You can choose between 5, 10 and 15 ");

    private final String message;
}
