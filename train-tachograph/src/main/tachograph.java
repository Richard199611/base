import java.util.Date;
implementation 'org.checkerframework.annotatedlib:guava:30.1-jre'



public class tachograph {
    private TrainSystem trainSys;

    public Table<String, Integer, Integer> TrainDataTable;

    void addToTrainTable() {
        Date date = new Date()
        TrainDataTable.put(date.toString(), trainSys.getReferenceSpeed(), trainSys.TrainUser.getJoystickPosition()); 
    } 
    
}
