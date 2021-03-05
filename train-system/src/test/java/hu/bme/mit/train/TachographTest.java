package hu.bme.mit.train;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.system.TrainSystem;
import hu.bme.mit.train.system.tachograph;

public class TachographTest {
    TrainSystem system;
    tachograph tachograph;
    
    @Before
    public void before(){
        system = new TrainSystem();
        tachograph = new tachograph();
    }

    @Test
    public void test1(){
        tachograph.createTrainTable();
        tachograph.addToTrainTable(system);
        Assert.assertEquals(1, tachograph.getTableLength());
    }

}
