public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 60);

        System.out.println("Current Light Color: " + trafficLight.getColor());
        System.out.println("Is it Red? " + trafficLight.isRed());
        System.out.println("Is it Green? " + trafficLight.isGreen());

        trafficLight.changeColor("green");

        System.out.println("Current Light Color: " + trafficLight.getColor());
        System.out.println("Is it Red? " + trafficLight.isRed());
        System.out.println("Is it Green? " + trafficLight.isGreen());
    }
}
