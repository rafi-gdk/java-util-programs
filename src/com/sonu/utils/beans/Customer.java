package com.sonu.utils.beans;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Customer {

    private Integer customerId;
    private String customerName;
    private LocalDate customerDOB;
    private String phoneNumber;
    private String email;
    private String password;

}

