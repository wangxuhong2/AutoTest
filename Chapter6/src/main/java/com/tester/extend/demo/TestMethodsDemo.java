package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }/**
  @Test
    static public void assertSame(String message,Object expected,Object actual){
        if (expected ==actual){
            return;
        }
        failNotsame(message,expected,actual);
    }
    static public void failNotsame(String message, Object expected, Object actual) {
        fail(format(message, expected, actual));
    }
    public static String format(String message, Object expected, Object actual) {
        String formatted = "";
        if (message != null && message.length() > 0) {
            formatted = message + " ";
        }
        return formatted + "expected:<" + expected + "> but was:<" + actual + ">";
    }
    /**
     * Fails a test with the given message.
     *
    static public void fail(String message) {
        if (message == null) {
            throw new RuntimeException();
        }
        throw new RuntimeException(message);
    }
    */



}
