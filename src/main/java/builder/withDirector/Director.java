package builder.withDirector;

public class Director {

    public void buildSportCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GpsNavigator());
    }

    public void buildCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GpsNavigator());
    }

    public void buildSuvCar(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGpsNavigator(new GpsNavigator());
    }

}