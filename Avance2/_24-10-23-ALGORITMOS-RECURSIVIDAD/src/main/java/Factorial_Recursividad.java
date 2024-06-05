public class Factorial_Recursividad {


    public  int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int resultado = n * factorial(n - 1);
            return resultado;
        }
    }
    public int potencia(int a,int b){
        int resultado;
        if(b==0)
            return 1;
        else{
            resultado=a*potencia(a,b-1);
            return resultado;
        }
    }
    public int sumassucesivas(int a,int b){
        int resultado;
        if(b==0)
            return 0;
        else{
            resultado=a+sumassucesivas(a,b-1);
            return resultado;
        }
    }
    public int enteroDivision (int a, int b){
        if (a<b)
            return 0;
        else
            return 1+enteroDivision(a-b,b);
    }
    public String primo(int n, int i){
        if (n/2<i)
            return "Es primo";
        else if (n%i==0)
            return "No es primo";
        else
            return primo(n,i+1);
    }

}
