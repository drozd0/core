package ru.home.emailnotifier;

import ru.home.emailnotifier.authholder.AuthenticationHolder;
import ru.home.emailnotifier.authholder.FileAuthenticationHolder;
import ru.home.emailnotifier.exception.EmailNotifierException;

public class Main {
    public static void main(String[] args) throws EmailNotifierException {
        AuthenticationHolder holder = new FileAuthenticationHolder("config.properties");
        System.out.println(holder.getPassword());
    }
}
