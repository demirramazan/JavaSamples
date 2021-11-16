package com.javaexamples.other;

@TestAnotation(createdBy = "Ramazan Demir",
        tags = {"test123"},
        priorty = TestAnotation.Priorty.HIGH,
        lastModified = "14/11/2021")
public class TestAnotationExample {

    @TestAnotation
    void testA() {
        if (true)
            throw new RuntimeException("Bu test her zaman başarısız sayılacak.");
    }

    @TestAnotation(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("Bu test görmezden gelinecek.");
    }

    @TestAnotation(enabled = true)
    void testC() {
        if (3<5) {
            // Bu test her zaman başarılı sayılacak.
        }
    }
}
