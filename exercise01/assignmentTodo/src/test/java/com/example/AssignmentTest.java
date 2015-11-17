package com.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssignmentTest {
    private Assignment assignment;

    @Before
    public void setUp() throws Exception {
        assignment = new Assignment();
    }

    @After
    public void tearDown() throws Exception {
        // Tear down tests
    }

    @Test
    public void testRunCommand_init() throws Exception {
        String response = assignment.runCommand("init");

        Assert.assertEquals("init", response, "Command 'init' should return 'init'");
    }

    @Test
    public void testRunCommand_sum_2_2() throws Exception {
        String response = assignment.runCommand("do 2 + 2");

        Assert.assertEquals("4", response, "Command 'init' should return 'init'");
    }

    @Test
    public void testRunCommand_sum_0_3() throws Exception {
        String response = assignment.runCommand("do 0 + 3");

        Assert.assertEquals("3", response, "Command 'init' should return 'init'");
    }

    @Test
    public void testRunCommand_div_4_2() throws Exception {
        String response = assignment.runCommand("do 4 / 2");

        Assert.assertEquals("2", response, "Command 'init' should return 'init'");
    }

    @Test
    public void testRunCommand_div_2_4() throws Exception {
        String response = assignment.runCommand("do div 2 / 4");

        Assert.assertEquals("0.5", response, "Command 'init' should return 'init'");
    }

    @Test
    public void testRunCommand_exit() throws Exception {
        String response = assignment.runCommand("do exit");

        Assert.assertEquals("exit", response, "Command 'init' should return 'exit'");
    }
}