package zadanie1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Car> carList1 = new ArrayList<>(Arrays.asList(
                new Car("BMW", "8",2010),
                new Car("BMW", "i4",2022),
                new Car("Porsche", "Cayenne",2017),
                new Car("Subaru", "Ascent",2020),
                new Car("Toyota", "Corolla",2012),
                new Car("Mercedes", "AMG",2020),
                new Car("Toyota", "GR Supra",2022),
                new Car("Volvo", "S60",2014),
                new Car("Toyota", "Tundra",2011),
                new Car("Mercedes", "4-Matic",2018),
                new Car("Volvo", "S90",2019),
                new Car("Porsche", "718 Cayman",2020),
                new Car("Subaru", "BRZ",2019),
                new Car("Porsche", "911",2015)
        ));
        List<Car> carList2 = new ArrayList<>(Arrays.asList(
                new Car("Mercedes", "4-Matic",2018),
                new Car("BMW", "i4",2022),
                new Car("Volvo", "XC40",2019),
                new Car("Mercedes", "S-Class",2022),
                new Car("Subaru", "Ascent",2020),
                new Car("Mercedes", "S-Class",2022),
                new Car("BMW", "8",2010),
                new Car("Mitsubishi", "Space Star",2015),
                new Car("Volvo", "XC40",2019),
                new Car("Toyota", "Tundra",2011),
                new Car("Mitsubishi", "Mirage",2013),
                new Car("BMW", "X6",2017),
                new Car("Volvo", "S90",2019),
                new Car("Mercedes", "AMG",2020),
                new Car("Porsche", "Panamera",2015)
        ));

        Comparator<Car> comperingYear = (car1, car2) -> car2.getYear() - car1.getYear();
        Comparator<Car> comperingBrand = comperingYear.thenComparing((car1, car2) -> car2.getBrand().compareTo(car1.getBrand()));
        Comparator<Car> comperingModel = comperingBrand.thenComparing((car1, car2) -> car2.getModel().compareTo(car1.getModel()));


        Set<Car> carSet = new TreeSet<>(comperingModel);
        List<Car> bothListsCombined = new ArrayList<>();
        bothListsCombined.addAll(carList1);
        bothListsCombined.addAll(carList2);
        bothListsCombined.sort(comperingModel);

        for (Car car : bothListsCombined) {
//            System.out.println(car);
        }
        System.out.println();

        carSet.addAll(bothListsCombined);
        for (Car car : carSet) {
            System.out.println(car);
        }

        removeRedundant(bothListsCombined);
    }

    private static void removeRedundant(List<Car> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                    j--;
                }
            }
        }
        System.out.println();
        for (Car car : list) {
            System.out.println(car);
        }
    }
}
