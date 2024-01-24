package com.example.javautils.controller.email;

import com.example.javautils.service.email.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@AllArgsConstructor
@RequestMapping("emails")
public class EmailController {

    private EmailService emailService;

    @GetMapping("/is-email-valid")
    public ResponseEntity<Boolean> isEmailValid(@RequestParam String email){
        Boolean isEmailValid = emailService.isEmailValid(email);
        return new ResponseEntity<>(isEmailValid, OK);
    }

    @GetMapping("/are-emails-valid")
    public ResponseEntity<List<String>> areEmailsValid(@RequestParam String emails){
        List<String> emailList = Arrays.asList(StringUtils.delimitedListToStringArray(emails, ","));
        List<String> areEmailsValid = emailService.areEmailsValid(emailList);
        return new ResponseEntity<>(areEmailsValid, OK);
    }
}
