package kr.co.webmill.dldemo.controllers;

import kr.co.webmill.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {
    private GetterInjectedController controller;
    @Test
    public void testGetterInjectedController() throws Exception  {
        assertEquals(GreetingServiceImpl.GREETING_WORD, controller.sayHello());
    }

    @Before
    public void setUp() throws Exception {
        controller = new GetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }
}
