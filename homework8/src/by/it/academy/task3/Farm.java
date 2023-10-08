package by.it.academy.task3;

public class Farm {
    private final FarmAnimal[] farmAnimals;

    public Farm(FarmAnimal... farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public void getProduct() {
        for (FarmAnimal farmAnimal : farmAnimals) {
            int week = farmAnimal.getProductivityPerWeek();
            int month = farmAnimal.getProductivityPerWeek() * 4;
            int year = month * 12;
            System.out.println(farmAnimal.getName() + " дают " + week + " " + farmAnimal.getUnit() + " "
                    + farmAnimal.getProduct() + " в неделю, " + month + " " + farmAnimal.getUnit() + " в месяц и "
                    + year + " " + farmAnimal.getUnit() + " в год.");
        }
    }

    public void print () {
        for (FarmAnimal farmAnimal : farmAnimals) {
            System.out.println(farmAnimal.getName() + " дают: "
                    + farmAnimal.getProduct());
        }
        System.out.println();
    }
}
