package seminar4.task3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class OrderTest {

    @Test
    void testOrderShippingWithSpy() {
// Создаем шпиона для класса Order
        Order orderSpy = spy(new Order(1, "Laptop"));

// Вызываем метод ship на шпионе
        orderSpy.ship();

// Проверяем, что метод ship был вызван на шпионе
        verify(orderSpy).ship();

// Проверяем, что статус заказа изменился после вызова метода ship
        assertTrue(orderSpy.isShipped());
    }
}