import java.util.*;

public class Main {

    public static void main(String[] args) {

//        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 1, 2, 4, 6, 2, 5, 8, 9, 4, 2, 3, 7, 5, 3, 1));
//
//        System.out.println(removeRedundant(integerList));

        rozkladNaCzynnikiPierwsze(210);
        // 1141039
    }

    private static List<Integer> removeRedundant(List<Integer> integerList) {
        System.out.println("your   list: " + integerList);
        integerList.sort(Comparator.naturalOrder());
        System.out.println("sorted list: " + integerList);

        for (int i = 0, j = 1; i < integerList.size() - 1; i++, j++) {
            if (Objects.equals(integerList.get(i), integerList.get(j))) {
                integerList.remove(j);
                i--;
                j--;
            }
        }
        return integerList;
    }

    private static void rozkladNaCzynnikiPierwsze(int liczba) {
        int var = liczba;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; true; i++) {
            if (var % i == 0) {
                list.add(i);
                var = var / i;
                i--;
            }
            if (var == 1) {
                break;
            }
        }
        System.out.println(list);
        Set<Integer> integerSet = new HashSet<>();
        integerSet.addAll(list);
        System.out.println(integerSet);
    }
}
