public class Phone {
    private static int count;
    private String model, number;
    private double weight;

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public Phone(String model, String number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
        count++;
    }

    public Phone() {
    }
  static int getCount(){
        return count;
  }
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void sendMessage(String message, String... array) {
        System.out.println(this.number + " is sending message(s)");
        for (String a : array) {
            System.out.println("Send message to: " + a + " " + message);
        }
    }
}