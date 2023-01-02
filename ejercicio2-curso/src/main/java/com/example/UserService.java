package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private NotificationService notification;

    public void mostrarNotificacion(){
        notification.imprimirSaludo();
    }
}
