package src.task_1;

public class Bowl {
    public int food;
    int volume;

    public Bowl(int volume, int food) throws WrongVolumeFoodException {

        if (food > volume) {
            throw new WrongVolumeFoodException("Невозможно создать миску! Объем корма не может превышать объема миски! Превышение составляет: " +
                    (food - volume) + "грамм");
        } else {
            this.food = food;
            this.volume = volume;
        }

    }


    public void decreaseFood(int increase) {
        food -= increase;
    }

    public void increaseFood(int increase) {
        int newVolume = food + increase;
        if (newVolume > volume) {
            System.out.println("Невозможно дабавить такой объем. Превышение на:  " + (newVolume - volume) + "грамм корма");
        } else {
            food += increase;
            System.out.println("Добавлено: " + increase + " грамм корма." + "Текущий объем корма в миске:" + food);
        }
    }

    public void infoBowl() {
        System.out.println("Текущий объем корма в миске: " + food);
        if (food < volume) {
            System.out.println("В миску можно добавить " + (volume - food) + "грамм");
        }

    }
}