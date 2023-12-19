package seminar3.task1.hw;

public class Mainhw {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


//Разработайте и протестируйте метод numberInInterval, который проверяет,
// попадает ли переданное число в интервал (25;100)
    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}
