package tudelft.numfinder;

public class NumFinderMain {
    public static void main(String[] args) {
        NumFinder nf = new NumFinder();

        nf.find(new int[]{4, 3, 2, 1});

        Integer largest = nf.getLargest();
        Integer smallest = nf.getSmallest();

        if (largest != null && smallest != null) {
            System.out.println("+ Grande: " + largest);
            System.out.println("+ Pequeño: " + smallest);
        } else {
            System.out.println("No se proporcionan numeros.");
        }
    }
}
/*
    Código original con errores:

    public class NumFinderMain {
        public static void main (String[] args) {
            NumFinder nf = new NumFinder();

            // this works
            // nf.find(new int[] {4, 25, 7, 9});

            // this crashes
            nf.find(new int[] {4, 3, 2, 1});

            System.out.println(nf.getLargest());
            System.out.println(nf.getSmallest());
        }
    }

    public class NumFinder {
        private int smallest = Integer.MAX_VALUE;
        private int largest = Integer.MIN_VALUE;

        public void find(int[] nums) {
            for(int n : nums) {
                if(n < smallest)
                    smallest = n;
                else if (n > largest)
                    largest = n;
            }
        }

        public int getSmallest () {
            return smallest;
        }

        public int getLargest () {
            return largest;
        }
    }

    Errores en el código:
    - El primer número del array no se asigna bien a largest.
    - No maneja el caso en que el array esté vacío.
    - Usa int, lo que no permite devolver un valor nulo si no hay datos.

 */