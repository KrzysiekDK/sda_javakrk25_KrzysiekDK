package pl.sda.javakrk25.practising.ex_1;


public class Ex_1_printing_shapes {

    /**
     * Używając symbolu #, wypisz w konsoli kształty: kwadrat, prójką prostokątny, trójkąt równoramienny
     *
     * @param args
     */
    public static void main(String[] args) {
        square(10);
        triangle(10);
        triangle2(11);
    }


    private static void triangle2(int size) {
        //todo
    }

    private static void triangle(int size) {
        for (int i = 0; i < size; i++) { // przejście po wierszach
            for (int j = 0; j < size; j++) { // po kolumnach
                if (j > i) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void square(int size) {
        for (int i = 0; i < size; i++) { // przejście linia po linii
            for (int j = 0; j < size; j++) { //przejście po kolumnach
                System.out.print(" # ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
