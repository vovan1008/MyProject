package lesson10.enums;

public enum Season {
    WINTER(-25),SPRING(10),SUMMER(25){
        @Override
        public String getDescription() {
            return "Warm Season";
        }
    },AUTUMN(8);
    private double tmp;

    Season(double tmp) {
        this.tmp = tmp;
    }

    Season() {
    }

    public double getTmp() {
        return tmp;
    }
    public String getDescription(){
        return "Cold season";
    }
}
