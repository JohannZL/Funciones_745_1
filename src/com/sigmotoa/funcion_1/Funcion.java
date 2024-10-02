package com.sigmotoa.funcion_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Funcion
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int a,b,z,opc;
        int [][] num;
        int []arre;
        int []arre2;
        int [][] bo;
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
            System.out.println("9.Mayor y menor");
            System.out.println("10.Suma de arreglo.");
            System.out.println("11.Multplicar matrizes");
            System.out.println("12.Promedio de arreglo");
            System.out.println("13.Metodo de burbuja.");
            System.out.println("14.trasnpuesta. ");
            System.out.println("15.Rotar.");
            System.out.println("16.Nombres");
            System.out.println("17.Eliminar");
            System.out.println("18.Sumar arreglos");
            System.out.println("20.Salir");
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
                    num=rellenar();
                    mayor(num);

                } break;
                case 10:{
                     num = rellenar();
                     sumarg(num);
                }break;
                case 11:
                {
                   num=rellenar();
                   bo=rellenar();
                   multmtz(num,bo);

                } break;
                case 12:
                {
                    num=rellenar();
                    promedio(num);

                } break;
                case 13:
                {
                    arre=arreglo();
                    burbuja(arre);
                } break;
                case 14:
                {
                    num=rellenar();
                    mostrar(num);
                    System.out.println("La matriz transpuesta es: ");
                    trasnponer(num);
                } break;
                case 15:
                {
                    arre=arreglo();
                    rotar(arre);
                } break;
                case 16:
                {
                    lista();
                } break;
                case 17:
                {
                    eliminar();
                } break;
                case 18:
                {
                    arre=arreglo();
                    arre2=arreglo();
                    sumararreglos(arre,arre2);
                } break;
                case 20:
                {
                    System.out.println(name + "Hasta luego ");
                } break;
                default:
                {
                    System.out.println("ingreso un opcion no valida");
                }
            }
        } while(opc !=20);
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
        c=1;
        d=x;
        for(int i=1;i <=y; i++)
        {
                c=Multiplicacion(d,c);
        }
        System.out.println("la potencia es: "+c);

        return c;
    }
    //funcion 4//
    public static int Factorial(int x)
    {
        int d,c;
        d=1;
        c=1;
        while(d<=x)
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
    public static int[] arreglo()
    {
        Scanner leer = new Scanner(System.in);
        int c, num;
        System.out.println("ingrese el numero de elementos: ");
        c = leer.nextInt();
        int[] x = new int[c];
        for (int i = 0; i < c; i++)
        {
            System.out.println("ingrese un numero: ");
            num = leer.nextInt();
            x[i] = num;
        }
        return x;
    }
    //Funcion 9//
    public static void sumarg(int [][]y)
    {
        int c,d=0;
        for(int i=0;i< y.length;i++)
        {
           for(int j=0;j<y[i].length;j++)
           {
               c=y[i][j];
               d=d+c;
           }
        }
        System.out.println("la suma es: " +d);

    }

    public static int[][] rellenar()
    {
        Scanner leer = new Scanner(System.in);
        int c,y,z;
        System.out.println("ingrese la cantidad de filas: ");
        y = leer.nextInt();
        System.out.println("ingrese la cantidad de columnas: ");
        z = leer.nextInt();
        int [][]x = new int[y][z];
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<z;j++)
            {
                System.out.println("ingrese un numero: ");
                c = leer.nextInt();
                x[i][j]=c;
            }
        }
        return x;
    }
    public static void mayor(int [][]x)
    {
        int mayor,menor;
        mayor=x[0][0];
        menor=x[0][0];
        for(int i=0;i<x.length;i++)
        {
           for(int j=0;j<x[i].length;j++)
           {
               if(x[i][j]>mayor)
               {
                   mayor=x[i][j];
               }
                if(x[i][j]<menor)
                {
                    menor=x[i][j];
                }
           }
        }
        System.out.println("el numero mayor es: " +mayor);
        System.out.println("el numero menor es: " +menor);
    }
    //funcion 11//
    public static void multmtz(int [][]x ,int [][]y)
    {
        int []c;
        int []b;
        int [][]z = new int[0][0];
        int w=0;
        for(int i=0;i< x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                c=x[i];
            }
        }
        for(int i=0;i< y.length;i++)
        {
            for(int j=0;j<y[i].length;j++)
            {
                b=y[j];
                System.out.print(b[j]);
            }
            System.out.println("");
        }
        for(int i=0;i< x.length;i++)
        {
            for(int j=0;j<y[i].length;j++)
            {

            }
        }
    }
    //funcion 12//
    public static void promedio(int [][]x)
    {
        int c=0;
        double promedio=0,suma=0;
        for(int i=0;i< x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                c=x[i][j];
                suma=suma+c;
                promedio=suma;
            }
        }
        System.out.println("el promedio de la matriz es: " +(promedio/x.length));
    }
    //Mostrar//
    public static void mostrar(int [][]y)
    {
        for(int i=0;i<y.length;i++)
        {
            for(int j=0;j<y[i].length;j++)
            {
                System.out.print(y[i][j]+"");
            }
            System.out.println("");
        }
    }
    //transpuesta//
    public static void trasnponer(int [][]x)
    {
        for(int i=0;i<x[i].length;i++)
        {
            for(int j=0;j<x.length;j++)
            {
                System.out.print(x[j][i]+ " ");
            }
            System.out.println("");
        }
    }
    //burbuja//
    public static void burbuja(int []x)
    {
        int aux;
        for(int i=0;i<x.length;i++)
        {
            for(int j = 0; j< x.length -i -1; j++)
            {
                if(x[j]>x[j+1])
                {
                    aux=x[j];
                    x[j]=x[j+1];
                    x[j+1]=aux;
                }
            }
        }
        for (int z=0;z<x.length;z++)
        {
            System.out.print(x[z]);
        }
        System.out.println();
    }
    public static void rotar(int []x)
    {
        for (int i=0;i<x.length;i++)
        {
            for (int j=0;j<1;j++)
            {
                x[j]=x[i];
                x[i]=0;
                System.out.print(x[i]+ " "+x[j]);
            }
            System.out.println();
        }
    }
    public static void lista()
    {
        List<String> nombres=new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int opcion;
        String nombre,name;
        do
        {
            System.out.println("1.ingresar nombres: ");
            System.out.println("2.buscar nombre");
            System.out.println("3.Salir.");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                {
                    System.out.println("ingrese un nombre: ");
                    nombre=leer.next();
                    nombres.add(nombre);
                } break;
                case 2:
                {
                    System.out.println("indique el nombre a buscar: ");
                    name=leer.next();
                    System.out.println(nombres.contains(name));
                } break;
                case 3:
                {
                    System.out.println("Hasta luego");
                }
            }
        }while(opcion!=3);
    }
    public static void eliminar()
    {
        Scanner leer = new Scanner(System.in);
        int a;
        Set<Integer> numeros=new HashSet<>();
        for(int i=0;i<10;i++)
        {
            System.out.println("ingrese un numero: ");
            a=leer.nextInt();
            numeros.add(a);
        }
        System.out.println(numeros);
    }
    public static void sumararreglos(int []x,int []y)
    {
        int []z=new int[x.length];
        if(x.length==y.length)
        {
            for(int i=0;i<x.length;i++)
            {
                z[i]=x[i]+y[i];
            }
        } else
        {
            System.out.println("los arreglos no se pudeden sumar");
        }
        for(int i=0;i<x.length;i++)
        {
            System.out.print(z[i]+" ");

        }
        System.out.println();
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
    10.Suma de un arreglo y arreglo.

    Todas las funciones deben ser llamadas desde el Main.
     */

}
