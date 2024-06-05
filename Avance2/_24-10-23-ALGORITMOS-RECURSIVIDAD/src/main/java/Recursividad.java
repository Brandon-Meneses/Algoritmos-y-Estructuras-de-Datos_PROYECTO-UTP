public class Recursividad {
    private  int a[];
    public Recursividad(int b[]){
        a=b;
    }
    public int sumador(){
        int n=a.length-1;
        return sumaValoresMenoresUltimoValor(n);
    }
    public int identificador(){
        int n=a.length-1;
        return menorValor(n);
    }
    public int sumaArreglo(int n){
        int suma=0;
        if(n<0)
            suma=0;
        else
            suma=a[n]+sumaArreglo(n-1);
        return suma;
    }
    public int sumaPares (int n){
        int suma=0;
        if(n<0)
            suma=0;
        else if(a[n]%2==0)
            suma=a[n]+sumaPares(n-1);
        else
            suma=sumaPares(n-1);
        return suma;
    }
    public int menorValor(int n){
        int menor;
        if(n==0)
            menor=a[0];
        else{
            menor=menorValor(n-1);
            if(menor>a[n])
                menor=a[n];
        }
        return menor;
    }
    public int sumaValoresMenoresUltimoValor(int n){
        int suma=0;
        if(n<0)
            suma=0;
        else if(a[n]<a[a.length-1])
            suma=a[n]+sumaValoresMenoresUltimoValor(n-1);
        else
            suma=sumaValoresMenoresUltimoValor(n-1);
        return suma;

    }
}
