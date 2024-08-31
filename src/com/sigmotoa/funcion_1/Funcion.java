
import java.util.Scanner;

public class Funcion
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int a,b,z,opc;
        System.out.println("Hello, type your name");
        String name = leer.next();
        do {
            System.out.println("1.sumar");
            System.out.println("2.Multiplicar");
            System.out.println("3.Potencia");
            System.out.println("4.Factorial");
            System.out.println("5.Area de un cuadrado");
            System.out.println("6.Area circulo");
            System.out.println("7.Volumen de un cono");
            System.out.println("8.numeros serie de fibonacci");
            System.out.println("9.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println(name + " Ingrese un numero: ");
                    a = leer.nextInt();
                    System.out.println(name + " Ingrese otro numero: ");
                    b = leer.nextInt();
                    z = Suma(a, b);
                    System.out.println(name + " su resultado es: " + z);
                }
                break;
                case 2: {
                    System.out.println(name + " Ingrese un numero: ");
                    a = leer.nextInt();
                    System.out.println(name + " Ingrese otro numero: ");
                    b = leer.nextInt();
                    z = Multiplicacion(a, b);
                }
                break;
                case 3: {
                    System.out.println(name + " Ingrese la base: ");
                    a = leer.nextInt();
                    System.out.println(name + " Ingrese el exponente: ");
                    b = leer.nextInt();
                    z = Potencia(a, b);
                }
                break;
                case 4: {
                    System.out.println(name + " Ingrese un numero: ");
                    a = leer.nextInt();
                    z = Factorial(a);
                }
                break;
                case 5: {
                    Area();
                }
                break;
                case 6: {
                    AreaCirculo();
                }
                break;
                case 7: {
                    Volumen();
                }
                break;
                case 8: {
                    System.out.println(name + " ingrese un numero: ");
                    a = leer.nextInt();
                    z = Fibo(a);
                }
                break;
                case 9:
                {
                    System.out.println(name + "Hasta luego ");
                } break;
                default:
                {
                    System.out.println("ingreso un opcion no valida");
                }
            }
        } while(opc !=9);
    }
   //funcion 1//
    public static int Suma(int x,int y)
    {
        int c;
        c=x+y;
        return c;
    }
    //funcion 2//
    public static int Multiplicacion(int x,int y)
    {
        Scanner leer = new Scanner(System.in);
        int c, d;
        d = x;
        c = 0;
        for (int i = 1; i <= y; i++)
        {
            c = Suma(c, d);
        }
        System.out.println("la multiplicacion es: "+c);
        return c;
    }
    //funcion3//
    public static int Potencia(int x,int y)
    {
        int c,d;
        c=0;
        d=x;
        for(int i=1;0<=y;i++)
        {
            for(int j=1;j<=y;j++)
            {
                c=Multiplicacion(d,c);
            }
        }
        System.out.println("la potencia es: "+c);

        return c;
    }
    //funcion 4//
    public static int Factorial(int x)
    {
        int a,d,c;
        a=x;
        d=1;
        c=1;
        while(d<=a)
        {
            c=c*d;
            d++;
        }
        System.out.println("el factorial del numero es: "+c);
        return c;
    }
    //funcion 5//
    public static void Area()
    {
        int x,y;
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese el lado del cuadrado:  ");
        x = leer.nextInt();
        y=x*x;
        System.out.println(" el area del cuadrado es: "+y);
    }
    //funcion 6//
    public static void AreaCirculo()
    {
        Scanner leer = new Scanner(System.in);
        int x;
        double y;
        System.out.println("ingrese el radio del circulo: ");
        x = leer.nextInt();
        y = 3.14*(x*x);
        System.out.println("el area del ciruclo es: "+y);
    }
    //funcion 7//
    public static void Volumen()
    {
        double x,y,z;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la altura del cono: ");
        x = leer.nextDouble();
        System.out.println("ingrese el radio del cono: ");
        y = leer.nextDouble();
        z = (3.14/3)*(y*y)*x;
        System.out.println("el volomenr del cono es: "+z);
    }
    //funcion 8//
    public static int Fibo(int x)
    {
        int a,c,d,cont,e;
        a=x;
        c=0;
        d=1;
        e=0;
        cont=2;
        if(a==0)
        {
            System.out.println("el numero"+a+" de la serie Fibonacci es: "+e);
        }
        else
        {
            while (cont <= a) {
                e = c + d;
                c = d;
                d = e;
                cont++;
            }
        }
        System.out.println("el numero "+a+" de la serie Fibonacci es: "+e);
        return e;
    }

    /*
    Crear funciones para las siguientes situaciones
    1. Sumar 2 numeros
    2. Multiplicar 2 numeros con las sumas del 1
    3. Potenciar 2 numeros con las sumas del 1
    4. Calcular el factorial de 1 numero
    5. Calcular el area de un cuadrado(recibiendo un lado)
    6. Calcular el area de un circulo(recibiendo el radio)
    7. Calcular el volumen de un cono(recibiendo el radio y la altura
    8. Mostrar los n numeros de la serie de fibonacci(recibiendo n)

    Todas las funciones deben ser llamadas desde el Main.
     */

}
