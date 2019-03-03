package kr.co.webmill.dldemo.controllers;

import kr.co.webmill.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController controller;
    @Before
    public void setUp() throws Exception {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testConstructorInjectedController() {
        assertEquals(GreetingServiceImpl.GREETING_WORD, controller.sayHello());
    }
}
