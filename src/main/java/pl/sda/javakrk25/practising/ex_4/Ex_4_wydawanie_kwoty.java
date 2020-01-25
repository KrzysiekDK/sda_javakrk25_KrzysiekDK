package pl.sda.javakrk25.practising.ex_4;

public class Ex_4_wydawanie_kwoty {

    /**
     * Dostępne nominały: 5,2,1 PLN oraz 50,20,10,5,2,1 groszy
     * kwota do wydania: 18zł, 78gr
     * W jakich nominałach to wydać by było jak najmniej monet?
     * side quests:
     * -lepsze formatowanie wyświetlania, np 5zł x 4, 50gr x 2
     * -ograniczona liczba niektórych nominałów
     *
     * @param args
     */
    public static void main(String[] args) {
        int amountLeft = 1878; //na potrzeby zadania pomnożone x100
        int[] avaliableCoins = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] usedCoins = new int[avaliableCoins.length];

        while (amountLeft > 0) {
            int indexOfCoin = findGreatestAvailableIndex(avaliableCoins, amountLeft);// znaleźć największy możliwy nominał
            int coin = avaliableCoins[indexOfCoin];
            amountLeft -= coin;  //zmniejszyć amount left
            usedCoins[indexOfCoin]++; // zapisać użyte monety
        }
        printOutTheResult(avaliableCoins, usedCoins);

    }

    private static void printOutTheResult(int[] avaliableCoins, int[] usedCoins) {
        for (int i = 0; i < avaliableCoins.length; i++) {
            int coin = avaliableCoins[i];
            int count = usedCoins[i];
            if (count == 0) continue;

            System.out.println(String.format("%.2fPLN x %d", coin / 100f, count));
        }
    }

    private static int findGreatestAvailableIndex(int[] avaliableCoins, int amountLeft) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < avaliableCoins.length; i++) {
            int coin = avaliableCoins[i];
            if (coin > max && coin <= amountLeft) {
                max = coin;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
