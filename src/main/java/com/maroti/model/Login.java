package com.maroti.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Login {
    private String emailOrLoginName;
    private String password;
    private String CNFPassword;

}
