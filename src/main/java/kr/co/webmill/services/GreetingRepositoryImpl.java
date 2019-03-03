package kr.co.webmill.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hellow World Repo";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servido de Saluo Repo";
    }

    @Override
    public String getGermanGreeting() {
        return "Gutten Tag Repo";
    }
}
