package com.example.jenkinsspringboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

//https://docs.spring.io/spring-boot/docs/2.1.5.RELEASE/reference/html/boot-features-testing.html
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //RANDOM_PORT 옵션을 주면 embeded서버가 랜덤 포트로 지정되서 기동된다.
public class mainControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void hello() {
        String body = this.restTemplate.getForObject("/", String.class);
        Assertions.assertThat(body).isEqualTo("Hi");
    }
}
