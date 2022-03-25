package com.dong.log;

import org.junit.jupiter.api.Test;

public class DiyLogImpl implements DiyLog{
    @Test
    @Override
    public void save() {
        System.out.println("save running");
    }
}
