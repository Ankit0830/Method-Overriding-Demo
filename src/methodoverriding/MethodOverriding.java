package methodoverriding;

class Super
{
    public void display()
    {
        System.out.println("Hello Super Class: ");
    }
}
class Sub extends Super
{
   @Override
   public void display()
    {
        System.out.println("Hello Sub Class: ");
    }
}
public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        
        Super su = new Super();
        su.display();
        
        Sub sb = new Sub();
        sb.display();
    }
    
}
