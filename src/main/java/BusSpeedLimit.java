public class BusSpeedLimit implements SpeedLimitStrategy{
    @Override
    public boolean isSpeedExceeded(Car car) {
        return car.getSpeed() > 70;
    }
}
