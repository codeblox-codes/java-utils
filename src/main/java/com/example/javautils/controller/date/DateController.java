package com.example.javautils.controller.date;

import com.example.javautils.service.date.DateService;
import com.example.javautils.service.email.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("dates")
public class DateController {

    private DateService dateService;

}
