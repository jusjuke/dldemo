package kr.co.webmill.dldemo;

import kr.co.webmill.dldemo.controllers.ConstructorInjectedController;
import kr.co.webmill.dldemo.controllers.GetterInjectedController;
import kr.co.webmill.dldemo.controllers.MyController;
import kr.co.webmill.dldemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"kr.co.webmill.services","kr.co.webmill.dldemo"})
public class DlDemoApplication {

    public static void main(String[] args) {

       ApplicationContext ctx =  SpringApplication.run(DlDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
       controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
