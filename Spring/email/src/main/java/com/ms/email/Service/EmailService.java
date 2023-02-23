package com.ms.email.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.email.Model.EmailModel;
import com.ms.email.Repository.EmailRepository;

@Service
public class EmailService {
    @Autowired
    EmailRepository emailRepository;

    public String sendEmail(EmailModel emailModel){
        return "Email enviado";
        //Aqui seria a regra de neǵocio com alguma API de envio de email
    }
}
