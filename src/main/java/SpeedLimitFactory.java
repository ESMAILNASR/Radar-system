public class SpeedLimitFactory {
    public static SpeedLimitStrategy speedLimitStrategy(Car car) {
        return switch (car.getType()){
            case BUS -> new BusSpeedLimit();
            case TRUCK -> new TruckSpeedLimit();
            case PRIVATE -> new PrivateCarSpeedLimit();
            default -> null;
        };
    }
}
