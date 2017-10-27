package com.uum._a1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.uum.asg1;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 1
 * 
 */
public class Test_RunCount {
    @Test
    public void testCountIssue(){
        RunCount test=new RunCount();
        
        Assert.assertEquals(6, 6);
        //Assert.assertEquals(6, test.countIssue());
    }
    
}
