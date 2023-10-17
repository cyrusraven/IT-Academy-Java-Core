package by.it.academy.task3;

public class Farm {
    private final FarmAnimal[] farmAnimals;
    private int count;

    public Farm(int size) {
        farmAnimals = new FarmAnimal[size];
        count = 0;
    }

    public void addAnimal(FarmAnimal farmAnimal) {
        farmAnimals[count] = farmAnimal;
        count++;
    }

    public void printProducts() {
        for (int i = 0; i < count; i++) {
            FarmAnimal farmAnimal = farmAnimals[i];
            System.out.println("Животное: " + farmAnimal.getName());
            System.out.println("Продукт: " + farmAnimal.getProduct());
            System.out.println("Количество продукции в неделю: " + farmAnimal.getProductivityPerWeek() + " "
                    + farmAnimal.getUnit());
            System.out.println("Количество продукции в месяц: " + farmAnimal.getProductivityPerWeek() * 4 + " "
                    + farmAnimal.getUnit());
            System.out.println("Количество продукции в год: " + farmAnimal.getProductivityPerWeek() * 4 * 12 + " "
                    + farmAnimal.getUnit());
            System.out.println();
        }
    }
}
