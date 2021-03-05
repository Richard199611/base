import java.util.Date;

public class tachograph {
    private TrainSystem trainSys;

    public Table<String, Integer, Integer> TrainDataTable;
    
    void addToTrainTable() {
        Date date = new Date()
        TrainDataTable.put(date.toString(), trainSys.getReferenceSpeed(), trainSys.TrainUser.getJoystickPosition()); 
    } 
    
}
