package pl.sternik.mc.zad5;


public class App 
{
    public static void main( String[] args )

    {
        String[] kolumny = {"Krzys","Rys","Mis"};
        System.out.println("while");
        int licznik =0;
        while(licznik<kolumny.length)
        {
            System.out.println(kolumny[licznik]);
            licznik++;
        }
        System.out.println("for");

        for(int i=0;i<kolumny.length;i++)
        {
            System.out.println(kolumny[i]);
        }
        System.out.println("foreach");

        for(String item : kolumny) {
            System.out.println(item);
        }
        }

    }

