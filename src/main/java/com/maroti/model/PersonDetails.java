package com.maroti.model;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PersonDetails {
    private String fullName;
    private Date date;
    private String gender;
    private String houseNo;
    private String place;
    private String locality;
    private String district;
    private String mobile;
    private String aadhar;
}
