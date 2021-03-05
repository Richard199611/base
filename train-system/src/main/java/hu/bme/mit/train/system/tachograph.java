package hu.bme.mit.train.system;

import java.util.Date;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class tachograph {
    public Table<String, Integer, Integer> TrainDataTable;

    public void createTrainTable(){
        TrainDataTable = HashBasedTable.create();
    }

    public void addToTrainTable(TrainSystem system) {
        Date date = new Date();
        TrainDataTable.put(date.toString(), system.getController().getReferenceSpeed(),
         system.getUser().getJoystickPosition()); 
    } 
    
    public int getTableLength(){
        return TrainDataTable.size;
    }
}
