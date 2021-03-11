import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//package com.jojodul.book.springboot;

// 메인 클래스 생성
@SpringBootApplication  // 스프링 부트 자동 설정, 스프링 bean 읽기와 생성을 자동 설정. 해당 위치의 클래스부터 읽기 때문에 이 클래스는 항상 프로젝트의 최상단 클래스에 위치해야 한다
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);  // 내장 WAS(웹 어플리케이션 서버)를 실행(run)
    }
}

