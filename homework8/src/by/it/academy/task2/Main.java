package by.it.academy.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Aircraft[] aircrafts = new Aircraft[] {
                new Airplane(500, 300, 4000.0, "Boeng 747"),
                new Airplane(600, 400, 4500.0, "Boeng 748"),
                new Airplane(700, 500, 5000.0, "Boeng 749"),
                new Helicopter(200, 8, 500, "Bell 407"),
                new Helicopter(250, 9, 400, "Bell 408"),
                new Helicopter(300, 10, 300, "Bell 409"),
                new Quadcopter(100, 3, 200, "DJI Phantom 4"),
                new Quadcopter(150, 4, 250, "DJI Phantom 5"),
                new Quadcopter(200, 5, 300, "DJI Phantom 6")
        };

        sortArr(aircrafts);
        showSortedAircraft(aircrafts);
        System.out.println();
        getFilteredOfAircraft(aircrafts);
        System.out.println();
        System.out.println(Arrays.toString(getCommonLoadCapacityAndCapacity(aircrafts)));
    }

    public static int[] getCommonLoadCapacityAndCapacity(Aircraft[] aircrafts) {
        int commonCapacity = 0;
        int commonLoadCapacity = 0;
        int[] arr = new int[2];
        for (Aircraft aircraft : aircrafts) {
            commonLoadCapacity += aircraft.getLoadCapacity();
            commonCapacity += aircraft.getCapacity();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[0] = commonLoadCapacity;
            arr[1] = commonCapacity;
        }
        return arr;
    }

    public static void sortArr(Aircraft[] aircrafts) {
        for (int i = 0; i < aircrafts.length - 1; i++) {
            for (int j = i + 1; j < aircrafts.length - 1; j++) {
                if (aircrafts[i].getRange() > aircrafts[i + 1].getRange()) {
                    Aircraft tmp = aircrafts[j];
                    aircrafts[j] = aircrafts[j + 1];
                    aircrafts[j + 1] = tmp;
                }
            }
        }
    }

    public static void showSortedAircraft(Aircraft[] aircrafts) {
        for (Aircraft aircraft : aircrafts) {
            System.out.println(aircraft.getName() + "\t" + aircraft.getRange());
        }
    }

    public static void getFilteredOfAircraft(Aircraft[] aircrafts) {
        double minRange = 700;
        double maxRange = 100;
        for (Aircraft aircraft : aircrafts) {
            if ((aircraft.getRange()) > maxRange && aircraft.getRange() < minRange) {
                System.out.println(aircraft.getName());
            }
        }
    }
}
