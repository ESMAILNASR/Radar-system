public class PrivateCarSpeedLimit implements SpeedLimitStrategy{
    @Override
    public boolean isSpeedExceeded(Car car) {
        return car.getSpeed() > 80;
    }
}
