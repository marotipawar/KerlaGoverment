package com.maroti.model;

import lombok.*;
import org.checkerframework.checker.units.qual.A;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private Long id;
    private PersonDetails details;
    private Login login;
    private ForgotPassword forgotPassword;

}
