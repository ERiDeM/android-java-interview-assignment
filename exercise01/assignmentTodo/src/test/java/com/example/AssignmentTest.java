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
        assignment.clean();
    }

    @Test
    public void test_executeCommand_init() throws Exception {
        String response = assignment
                .execComm("init").getLastResult();
        Assert.assertEquals(Messages.READY_MESSAGE, response, "Command 'init' should return 'init'");
    }

    @Test
    public void test_executeCommand_do_exit() throws Exception {
        String response = assignment
                .execComm("do exit").getLastResult();
        Assert.assertEquals(Messages.BYE_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_2_plus_2_without_init() throws Exception {
        String response = assignment
                .execComm("do 2 plus 2").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_2_plus_2() throws Exception {
        String response = assignment
                .execComm("init")
                .execComm("do 2 plus 2").getLastResult();
        Assert.assertEquals("4", response);
    }

    @Test
    public void test_executeCommand_do_0_plus_3_without_init() throws Exception {
        String response = assignment
                .execComm("do 0 plus 3").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_0_plus_3() throws Exception {
        String response = assignment
                .execComm("init")
                .execComm("do 0 plus 3").getLastResult();
        Assert.assertEquals("3", response);
    }

    @Test
    public void test_executeCommand_do_4_div_2_without_init() throws Exception {
        String response = assignment
                .execComm("do 4 div 2").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_4_div_2() throws Exception {
        String response = assignment
                .execComm("init")
                .execComm("do 4 div 2").getLastResult();
        Assert.assertEquals("2", response);
    }

    @Test
    public void test_executeCommand_do_2_div_4_without_init() throws Exception {
        String response = assignment
                .execComm("do div 2 div 4").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_2_div_4() throws Exception {
        String response = assignment
                .execComm("init")
                .execComm("do div 2 div 4").getLastResult();
        Assert.assertEquals("0.5", response);
    }

    @Test
    public void test_executeCommand_do_sin_90_without_init() throws Exception {
        String response = assignment
                .execComm("do sin 90").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_sin_90() throws Exception {
        String response = assignment
                .execComm("init")
                .execComm("do sin 90").getLastResult();
        Assert.assertEquals("1", response);
    }

    @Test
    public void test_executeCommand_do_sin_30_without_init() throws Exception {
        String response = assignment
                .execComm("do sin 30").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_sin_30() throws Exception {
        String response = assignment
                .execComm("init")
                .execComm("do sin 30").getLastResult();
        Assert.assertEquals("0.5", response);
    }

    @Test
    public void test_executeCommand_do_2_plus_2_div_4_without_init() {
        String response = assignment
                .execComm("do 2 plus 2 div 4").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_2_plus_2_div_4() {
        String response = assignment
                .execComm("init")
                .execComm("do 2 plus 2 div 4").getLastResult();
        Assert.assertEquals("1", response);
    }

    @Test
    public void test_executeCommand_do_2_plus_2_plus_2_without_init() {
        String response = assignment
                .execComm("do 2 plus 2 plus 2").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_2_plus_2_plus_2() {
        String response = assignment
                .execComm("init")
                .execComm("do 2 plus 2 plus 2").getLastResult();
        Assert.assertEquals("6", response);
    }

    @Test
    public void test_executeCommand_do_sin_90_plus_5_div_2_without_init() {
        String response = assignment
                .execComm("do sin 90 plus 5 div 2").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_sin_90_plus_5_div_2() {
        String response = assignment
                .execComm("do sin 90 plus 5 div 2").getLastResult();
        Assert.assertEquals("3", response);
    }

    @Test
    public void test_executeCommand_do_2_plus_sin_90_without_init() {
        String response = assignment
                .execComm("do 2 plus sin 90").getLastResult();
        Assert.assertEquals(Messages.NEED_INIT_MESSAGE, response);
    }

    @Test
    public void test_executeCommand_do_2_plus_sin_90() {
        String response = assignment
                .execComm("do 2 plus sin 90").getLastResult();
        Assert.assertEquals("3", response);
    }
}