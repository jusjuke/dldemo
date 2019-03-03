package kr.co.webmill.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Primary
//@Profile({"de","default"})
public class PrimaryGermanGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        //return "Gutten Tag - Greeting";
        return greetingRepository.getGermanGreeting();
    }
}