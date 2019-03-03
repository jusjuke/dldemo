package kr.co.webmill.dldemo;

import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("## - This is LifeCycleDemonBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## - BeanFactory has been set.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## - BeanName is " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## - Life Cycle has been destroyed.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleBean has it's property set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## - ApplicationContext has been set");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("## - PostConstruct annotated method has been called");
    }
    @PreDestroy
    public void preDestory(){
        System.out.println("## - PreDestory annotated method has been called.");
    }
    public void beforeInit(){
        System.out.println("## - Before Init - called by BeanPostProcessor.");
    }
    public void afterInit(){
        System.out.println("## - After Init - called by BeanPostProcessor.");
    }
}
