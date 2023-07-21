package com.maroti.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ForgotPassword {
    private String question;
    private String answer;

}
