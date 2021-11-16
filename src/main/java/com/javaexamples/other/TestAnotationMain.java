package com.javaexamples.other;

import java.lang.reflect.Method;

public class TestAnotationMain {
    public static void main(String[] args) {
        int passed = 0, failed = 0, count = 0, ignore = 0;
        TestAnotationExample anotationExample = new TestAnotationExample();
        for (Method method : anotationExample.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(TestAnotation.class)) {
                TestAnotation testAnotation = method.getAnnotation(TestAnotation.class);
                if (testAnotation.enabled()) {
                    try {
                        method.invoke(anotationExample.getClass().newInstance());
                        System.out.printf("%s - Test '%s' - passed %n",
                                ++count, method.getName());
                        passed++;
                    } catch (Exception exception) {
                        System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(),
                                exception.getCause());
                        failed++;
                    }
                } else {
                    System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                    ignore++;
                }
            }
        }
        System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n",
                count, passed, failed, ignore);
    }
}
