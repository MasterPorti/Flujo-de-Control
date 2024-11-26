public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres triste triges tragan trigo en un trigal";
        String palabra = "trigo";
        int cantidad = 0;
        char letra = 'g';
        blucle1:
        for (int i = 0; i < frase.length(); i++) {
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue blucle1;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrada = " + cantidad + " La palabra '" + palabra + "'");
    }
}
