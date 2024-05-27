package com.example.restbalanceservicev2.test;

import com.example.restbalanceservicev2.model.WalletRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTestAssuredController {
    @Test
    public void testSuccessDeposit() {
        // Создаем запрос на пополнение кошелька
        WalletRequest request = TestData.posDepositWalletRequest;

        // Отправляем запрос и получаем ответ
        given()
                .contentType(ContentType.JSON)
                .body(request)
                .post("/api/v1/wallets")
                .then()
                .statusCode(200)
                .body("success", equalTo(true))
                .body("message", equalTo("Operation successful"));
    }
}
