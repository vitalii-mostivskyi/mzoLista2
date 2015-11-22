package ua.vialii.mostivskyi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Pryvit Ivan!" );
        System.out.println("new line!");
        
        int sw = 50;
        
        switch (sw)
        {
        case 1:
        	System.out.println("one");
        	break;
        	
        case 2:
        	System.out.println("two");
        	break;

        case 5:
        	System.out.println("three");
        	break;

        }
        
        int i = 0;
        for(;i < 10;)
        {
        	System.out.println(i);        	
        	i++;
        }
        
        
        if(false) {
        	System.out.println("I will be never here");
        }
        
    }
}
