package com.opslab.util.encrypt;

import junit.framework.TestCase;

public class SecureHATest extends TestCase {
    public void testGetResult() {

        String result = SecureHA.getResult("简单加密");
        System.out.println(result);


    }
}

