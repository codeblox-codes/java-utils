package com.example.javautils.service.email;

import java.util.List;

public interface EmailServiceImpl {
    Boolean isEmailValid(String email);

    List<String> areEmailsValid(List<String> emails);
}
