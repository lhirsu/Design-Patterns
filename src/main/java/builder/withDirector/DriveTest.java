package builder.withDirector;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DriveTest {

    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();

        director.buildSportCar(carBuilder);
        Car sportCar = carBuilder.getResult();

        director.buildCityCar(carBuilder);
        Car cityCar = carBuilder.getResult();

        director.buildSuvCar(carBuilder);
        Car suvCar = carBuilder.getResult();

        log.info(sportCar.toString());
        log.info(cityCar.toString());
        log.info(suvCar.toString());

        ManualBuilder carManualBuilder = new ManualBuilder();

        director.buildSuvCar(carManualBuilder);
        Manual suvManual = carManualBuilder.getResult();

        log.info(suvManual.toString());
        log.info(suvManual.print());

    }

}