public class ForEtiquetado {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
        }

        bucle1:
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue bucle1;
            }
            System.out.println("i = " + i);
        }

        bucle2:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle2;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
