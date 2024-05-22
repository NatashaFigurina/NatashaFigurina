package lesson_6;

public class Park {

    public  class Attraction {
        private String type;
        private String schedule;
        private int price;

        public Attraction (String type, String schedule, int price){
            this.type = type;
            this.schedule = schedule;
            this.price = price;
        }

        public void getInfo (){
            System.out.println ("Вид: " + type + "\n" + "цена: " + price + "\n" + "время работы: " + schedule);

        }

    }
}
