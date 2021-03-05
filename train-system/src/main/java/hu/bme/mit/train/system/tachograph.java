package hu.bme.mit.train.system;

import java.util.Date;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class tachograph {
    private TrainSystem system;
    public Table<String, Integer, Integer> TrainDataTable;

    void createTrainTable(){
        TrainDataTable = HashBasedTable.create();
    }

    void addToTrainTable() {
        Date date = new Date();
        TrainDataTable.put(date.toString(), system.getController().getReferenceSpeed(), system.getUser().getJoystickPosition()); 
    } 
    
}
