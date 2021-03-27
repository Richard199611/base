package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {
    TrainController MockTC;
    TrainUser MockTU;
    TrainSensorImpl trainSensor;


    @Before
    public void before() {
        MockTC = mock(TrainController.class);
        MockTU = mock(TrainUser.class);
        trainSensor = new TrainSensorImpl(MockTC,MockTU);
    }


    @Test
    public void SpeedLimitTooLow() {
        trainSensor.overrideSpeedLimit(-1);
        verify(MockTU, times(1)).setAlarmState(true);
    }

    public void SpeedLimitTooHigh() {
        trainSensor.overrideSpeedLimit(501);
        verify(MockTU, times(1)).setAlarmState(true);
    }

    public void SpeedLimitLessThanHalf() {
        trainSensor.overrideSpeedLimit((MockTC.getReferenceSpeed()/2) - 1);
        verify(MockTU, times(1)).setAlarmState(true);
    }

    public void SpeedLimitOkay() {
        trainSensor.overrideSpeedLimit(300);
        verify(MockTU, times(1)).setAlarmState(false);
    }
}
