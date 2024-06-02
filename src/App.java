public class App {
    public static void main(String[] args) throws Exception {
        // tính tuổi hiện tại
        GetAge person = new GetAge();
        person.namsinh = 2004;
        int age = person.PredictAge();
        System.out.printf("Your age is %d years old%n", age);

        //tính chu vi và diện tích hình tròn
        CaculaterCircle hinhtron1 = new CaculaterCircle();
        hinhtron1.bankinh = 4;
        double perimeter = hinhtron1.Perimeter();
        System.out.printf("%nThe circumference of the circle is: %f",perimeter);
        double area = hinhtron1.Area();
        System.out.printf("%nThe area of the circle is: %f%n",area);

        //tính tốc độ của xe
        GetSpeed myCar = new GetSpeed();
        int speed1 = myCar.upTo20();
        System.out.printf("%nThe speed of the car in the first acceleration is %d km/h", speed1);
        int speed2 = myCar.upTo40();
        System.out.printf("%nThe speed of the car in the second acceleration is %d km/h", speed2);
        int speed3 = myCar.upTo60();
        System.out.printf("%nThe speed of the car in the third acceleration is %d km/h", speed3);
        int speed4 = myCar.upTo20();
        System.out.printf("%nThe speed of the car in the fourth acceleration is %d km/h%n", speed4);
        //chuyển số phút
        TimeConversionApplication conversion  = new TimeConversionApplication();
        int hoursToMinutes  = conversion.covertHoursToMinutes(2);
        System.out.printf("%n%d minutes", hoursToMinutes );
        int daysToMinutes  = conversion.covertDaysToMinutes(3);
        System.out.printf("%n%d minutes", daysToMinutes );
    }
}