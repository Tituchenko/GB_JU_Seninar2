package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
/*
Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
 */
    void checkCarIsVehicle(){
        // Arrange
        Car car=new Car("company", "model", 2010);
        //Act
        // Assert
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    /*
    Проверить, что объект Car создается с 4-мя колесами.
     */
    void testCarWheels(){
        // Arrange
        Car car=new Car("company", "model", 2010);
        //Act
        // Assert
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
/*
Проверить, что объект Motorcycle создается с 2-мя колесами.
 */
void testMotoWheels(){
    // Arrange
    Motorcycle motorcycle=new Motorcycle("Yamaha","Z",2015);
    //Act
    // Assert
    assertThat(motorcycle.getNumWheels()).isEqualTo(2);
}
/*
    Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
*/
void checkCarDriveSpeed(){
    // Arrange
    Car car=new Car("company", "model", 2010);
    //Act
    car.testDrive();
    // Assert
    assertThat(car.getSpeed()).isEqualTo(60);
}
/*
Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
 */
void checkMotoDriveSpeed(){
    // Arrange
    Motorcycle motorcycle=new Motorcycle("Yamaha","Z",2015);
    //Act
    motorcycle.testDrive();
    // Assert
    assertThat(motorcycle.getSpeed()).isEqualTo(75);
}
/*
Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
 */
void checkCarDriveParking(){
    // Arrange
    Car car=new Car("company", "model", 2010);
    //Act
    car.testDrive();
    car.park();
    // Assert
    assertThat(car.getSpeed()).isEqualTo(0);
}
/*
Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
 */
void checkMotoDriveParking(){
    // Arrange
    Motorcycle motorcycle=new Motorcycle("Yamaha","Z",2015);
    //Act
    motorcycle.testDrive();
    motorcycle.park();
    // Assert
    assertThat(motorcycle.getSpeed()).isEqualTo(0);
}
}