package ru.netology.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String cardNumber;
    private String month;
    private String year;
    private String cardHolder;
    private String cvv;

//    private static final String url = System.getProperty("db.url");
//    private static final String user = System.getProperty("db.user");
//    private static final String password = System.getProperty("db.password");
// это здесь не нужно
}