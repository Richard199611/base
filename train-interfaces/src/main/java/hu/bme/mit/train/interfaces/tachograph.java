package hu.bme.mit.train.interfaces;

import java.util.Date;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class tachograph {
    private TrainController controller;
    private TrainUser user;
    public Table<String, Integer, Integer> TrainDataTable;

    void createTrainTable(){
        TrainDataTable = HashBasedTable.create();
    }

    void addToTrainTable() {
        Date date = new Date();
        TrainDataTable.put(date.toString(), controller.getReferenceSpeed(), user.getJoystickPosition()); 
    } 
    
}
