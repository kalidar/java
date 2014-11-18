// Kristoffer Stranden

package workdir;

import java.util.Scanner;

public class ArrayInnlevering
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Oppgi arrayens lengde: ");
        int len = in.nextInt();

        int arrayFoo[] = fyll(len);
        print(arrayFoo);
    }

    public static int[] fyll(int len)
    {
        int[] array = new int[len];

        for (int i = 0; i < len; ++i)
        {
            array[i] = (int) (Math.random() * len + 1);
        }
        return array;
    }

    public static void print(int[] arrayFoo)
    {
        // TODO: Convert to printf!
        for (int i = 0; i < arrayFoo.length; ++i)
        {
            System.out.print(arrayFoo[i] + ", ");
        }
    }

    public void sjekk(int i)
    {
        // For loop som validerer hvor mange indekser som har verdien 'i'.
        // For loop som validerer hvor mange indekser som har verdien 'i'.
    }

    public int felles(int[] arrayA, int[] arrayB)
    {

        return -1;
    }
}


