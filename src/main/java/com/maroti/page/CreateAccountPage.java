package com.maroti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;
import java.util.List;

public class CreateAccountPage {

    /*-------INPUT TEXT FIELD---------------------------*/
    @FindBy(xpath = "//div[@class='card-body'][1]/div[1]/div/input")
    private WebElement fullName;

    /*-----------Calender----------------------*/
    @FindBy(xpath = "//div[@class='card-body'][1]/div[1]/div[2]/div/i")
    private WebElement clickDate;
    @FindBy(xpath = "//span[@id='spanMonth']")
    private WebElement clickMonth;
    @FindBy(xpath = "//div[@id='selectMonth']//td")
    private List<WebElement> selectMonth;
    @FindBy(xpath = "//span[@id='spanYear']")
    private WebElement clickYear;
    @FindBy(xpath = "//div[@id='selectYear']//td")
    private List<WebElement> selectYear;
    @FindBy(xpath = "//span[@id='CalContent']//td/a")
    private List<WebElement> selectDate;

    /*-----------------Radio Button--------------------*/
    @FindBy(xpath = "//div[@class='form-radio']/div/label[1]")
    private List<WebElement> gender;

    /*-------------Text Field-----------------------------*/
    @FindBy(xpath = "//div[@class='card-body'][1]/div[3]/div[1]/input")
    private WebElement houseNo;
    @FindBy(xpath = "//div[@class='card-body'][1]/div[3]/div[2]/input")
    private WebElement place;
    @FindBy(xpath = "//div[@class='card-body'][1]/div[4]/div[1]/input")
    private WebElement locality;

    /*-------------Select Option---------------*/
    @FindBy(xpath = "//div[@class='card-body'][1]/div[4]/div[2]/select")
    private WebElement district;
    /*----------------------------------------------*/
    @FindBy(xpath = "//div[@class='card-body'][1]/div[5]/div[1]/input")
    private WebElement mobile;
    @FindBy(xpath = "//div[@class='card-body'][1]/div[5]/div[2]/input")
    private WebElement aadhar;
    @FindBy(xpath = "//div[@class='card-body'][2]/div[1]/div[1]/input[1]")
    private WebElement emailOrLoginName;
    @FindBy(xpath = "//div[@class='card-body'][2]/div[2]/div[1]/input")
    private WebElement password;

    @FindBy(xpath = "//div[@class='card-body'][2]/div[2]/div[2]/input")
    private WebElement CNFPassword;



    /*-------------Select Option---------------*/
    @FindBy(xpath = "//div[@class='card-body'][3]/div[1]/div[1]/select")
    private WebElement question;


    @FindBy(xpath = "//div[@class='card-body'][3]/div[1]/div[2]/input")
    private WebElement answer;


}
