package kr.co.webmill.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static String GREETING_WORD = "Hello World!! - Greeting Service Impl";
    @Override
    public String  sayGreeting() {
        System.out.println(GREETING_WORD);
        return GREETING_WORD;
    }
}
