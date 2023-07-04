package com.mat.learnspring.cusotmer;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class profile {

    int id;
    private String firstName;
    private String lastName;
    private String SSN;
    private String DOB;
    private String email;
    private int mobile;

    public profile(String firstName, String lastName, String SSN, String DOB, String email, int mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.DOB = DOB;
        this.email = email;
        this.mobile = mobile;
    }
}
