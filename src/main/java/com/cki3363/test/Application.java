package com.cki3363.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/**
 * @SpringBootApplication 으롸 인해 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정된다.
 * 특히나 @SpringBootApplication이 있느 ㄴ위치부터 설정을 읽어나가기 때문에 이클래스는 항상 프로젝트의 최상단에
 * 위치해야 한다.
 * main 메소드에서 실행하는 SpringApplication.run으로 인해 내장 WAS Web Application Server, 웹 애플리케이션 서버)
 * 를 실행한다. 내장 WAS란 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것을 이야기한다.
 * 이렇게 되면 항상 서버에 톰캣 을 설치할 필요가 없게 되고, 스프링 부트로 만들어진 Jar 파일(실행 가능한 java 패키징 파일)로
 * 실행하면 된다.
 *
 * - 후반부에서 톰캣 없이 어떻게 배포하고 서비스를 할 수 있는지 설명하니 조금만 기다리길 바란다.
 *
 * 꼭 스프링 부트에서만 내장 WAS를 사용할 수 있는 것은 아니지만, 스프링 부트에서 내장 WAS 를 사용하는 것을 권장 하고 있다.
 * 이유는 정말 간단하다.
 * 언제 어디서나 같은 환경에서 스프링 부트를 배포 할 수 있기 때문이다.
 * 외장 WAS를 슨다고 하면 모든 서버는 WAS의 종류와 버전, 설정을 일치시켜야마나 한다. 새로운 서버가 추가되면 모든 서버가 같은 WAS
 * 환경을 구축해야만 한다. 1대면 다행이지만 30대의 서버에 설치된 WAS의 버전을 올린다고 하면 어떻게 될까? 실수할 여지도 많고, 시간도 많이 필요한 큰
 * 작업이 될 수도 있다. 하지만 이렇게 내장 WAS를 사용 할 경우 이문제를 모두 해결할 수 있다. 글서 많은 회사에서 내장 WAS를 사용하도록
 * 전환하고 있다.
 *
 * 간혹 내장 WAS를 씀녀 성능상 이슈가 있지 않냐고 하시는 분들이 계신다. 하지만 어느 회사나 높은 트래픽의 서비스를 하고 있지만 이회사들 모두
 * 스프링 부트로 큰 문제 없이 운영하고 있다.
 *
 */
