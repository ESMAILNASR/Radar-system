public class TruckSpeedLimit implements SpeedLimitStrategy{
    @Override
    public boolean isSpeedExceeded(Car car) {
        return car.getSpeed() > 60;
    }
}
