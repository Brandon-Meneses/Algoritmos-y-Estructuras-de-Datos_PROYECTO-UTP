import java.util.Arrays;

public class Hash {
    private int arreglo[];
    double a;

    public Hash(int n) {
        arreglo = new int[n];
        a=Math.random();
    }

    public void aritmeticaModular(int valor) {
        int indice,m=arreglo.length;
        indice = valor % m;
        if(arreglo[indice]!=0)
           // indice = colisionVisitaLineal (indice);
        //indice = colisionVisitaCuadratica (indice);
        indice = colisionVisitaAleatoria (indice);
            arreglo[indice] = valor;
    }
    public void medioCuadrado (int valor){
        double res1;int indice;
        res1=valor*a;
        res1=res1-(int)res1;
        indice = (int) (res1* arreglo.length);
        if(arreglo[indice]!=0)
            //indice = colisionVisitaLineal (indice);
        //indice = colisionVisitaCuadratica (indice);
        indice = colisionVisitaAleatoria (indice);
        arreglo[indice]=valor;
    }
    public int colisionVisitaLineal (int indice){
        int j = 0;
        while (arreglo[(indice+j)% arreglo.length]!=0){
            j++;
        }
        return (indice+j)% arreglo.length;
    }
    public int colisionVisitaCuadratica(int indice){
        int j = 0;
        while (arreglo[(indice+j*j)% arreglo.length]!=0){
            j++;
        }
        return (indice+j)% arreglo.length;
    }
    public int colisionVisitaAleatoria (int indice){
        int j = 0;
        int r = (int)(Math.random()*arreglo.length-1)+1;
        while (arreglo[(indice+r)% arreglo.length]!=0){
            r = (int)(Math.random()*arreglo.length-1)+1;
        }
        return (indice+r)% arreglo.length;
    }

    public String toString() {
        return Arrays.toString(arreglo);

    }



}
