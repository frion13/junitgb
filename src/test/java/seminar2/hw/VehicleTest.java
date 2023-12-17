package seminar2.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car = new Car("Toyota", "Camry", 2022);
    Motorcycle moto = new Motorcycle("BMW", "1200", 2000);
    @Test
    @DisplayName("instance of car")
    void carIsInstanceOfVehicle() {
        // Check i f car is an instance of Vehicle
        assertTrue(car instanceof Vehicle, "car should be an instance of Vehicle");
    }

    @Test
    @DisplayName("Test 4 wheels of car")
    void testNumWheelsCar() {
        // Check if car has 4 wheels
        assertEquals(4, car.getNumWheels(), "car should have 4 wheels");
    }
    @Test
    @DisplayName("test 2 wheels of motorcycle")
    void testNumWheelsMoto() {
        // Check if car has 2 wheels
        assertEquals(2, moto.getNumWheels(), "car should have 4 wheels");
    }

    @Test
    @DisplayName("test cars speed")
    void testDriveCar() {
        car.testDrive();
        // Perform a test drive
        assertEquals(60, car.getSpeed(), "Car should reach a speed of 60 during a test drive");
    }

    @Test
    @DisplayName("test cars speed")
    void testDriveMoto() {
        moto.testDrive();
        // Perform a test drive
        assertEquals(75, moto.getSpeed(), "Moto should reach a speed of 75 during a test drive");
    }

    @Test
    @DisplayName("test cars park speed")
    void parkCar() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Car should reach a speed of 0 during a test park");
    }

    @Test
    @DisplayName("test moto park speed")
    void parkMoto() {
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed(), "Moto should reach a speed of 0 during a test park");
    }
}