package kr.co.webmill.dldemo.controllers;

import kr.co.webmill.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedContollerTest {
    private PropertyInjectedController controller;
    @Before
    public void setUp() throws Exception {
        this.controller = new PropertyInjectedController();
        controller.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING_WORD, controller.sayHello());
    }
}
