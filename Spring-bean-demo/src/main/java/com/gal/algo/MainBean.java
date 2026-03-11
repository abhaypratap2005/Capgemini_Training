package com.gal.algo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBean {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.scan("com.gal.algo");
            context.refresh();

            Calc calc = context.getBean(Calc.class);
            PasswordHasher hasher = context.getBean(PasswordHasher.class);

            System.out.println(calc);
            System.out.println("10 + 5 = " + calc.add(10, 5));

            System.out.println(hasher);
            System.out.println(hasher.hash("hello"));

            String[] beans = context.getBeanDefinitionNames();
            for (String beanName : beans) {
                System.out.println(beanName);
            }

            Object beanByMethodName = context.getBean("getCalc");
            Object beanByCustomName = context.getBean("calcNameBean");
            System.out.println(beanByMethodName);
            System.out.println(beanByCustomName);
        }
    }
}
