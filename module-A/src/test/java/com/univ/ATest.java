package com.univ;

import org.junit.Test;

/**
 * @author univ
 * @datetime 2018/12/1 10:27 AM
 * @description
 */
public class ATest {

    /*
    子模块间引用
     */
    @Test
    public void test1() {
        B b = new B();
        System.out.println(b.getName());
    }
}
