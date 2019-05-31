package com.example.decorator;

// Обёртка для реализации сервиса электронной почты
public class EmailServiceImplWithSignatureFunction implements EmailService {

    private EmailService emailService;

    public EmailServiceImplWithSignatureFunction(EmailService emailService) {
        this.emailService = emailService;
    }

    // Метод, реализующий щаблон проектирования декоратор
    public void sendLetter() {
        putSignature();
        emailService.sendLetter();
    }

    private void putSignature(){
        System.out.println("К письму добавлена подпись");
    }
}
