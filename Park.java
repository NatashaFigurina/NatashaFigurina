public class Park {

    public  class AttractionInfo {
        private String type = "карусель";
        private String schedule = "с 9:00 до 21:00";
        private int price = 45;

        public void getInfo (){
            System.out.println ("Вид: " + type + "\n" + "цена: " + price + "\n" + "время работы: " + schedule);

        }

    }
}
