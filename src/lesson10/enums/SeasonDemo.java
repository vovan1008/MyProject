package lesson10.enums;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season1 = Season.SUMMER;
        Season season2 = Season.AUTUMN;
        System.out.println(season1);
        printSeason(season2);
        printAllSeasons();

        Season season3 = Season.valueOf("SUMMER");
        System.out.println(season1);
    }
    public static void printSeason(Season season){
      switch (season){
          case AUTUMN:
              System.out.println("I like Autumn!");
              break;
          case SPRING:
              System.out.println("I like Spring!");
              break;
          case SUMMER:
              System.out.println("I like Summer!");
              break;
          case WINTER:
              System.out.println("I like Winter");
      }
    }
    public static void printAllSeasons(){
        Season[] seasons = Season.values();
        for (Season s : seasons){
            System.out.println(s+" "+s.getTmp()+" "+s.getDescription());
        }
    }
}
