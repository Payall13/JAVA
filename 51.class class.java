public class classclass1
 {
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class class1 = Class.forName("java.lang.String");
        Class class2 = int.class;
        System.out.println("class repersented by class1:");
        
        System.out.println("class1 to String()");
        System.out.println("class repersented by class2:");

        System.out.println("class2 to String()");
        String s ="javaTpoint";
        int i = 10;
        boolean b1 = class1.isInstance(s);
        boolean b2 = class2.isInstance(i);

        System.out.println("is p instance of string:"+b1);
        System.out.println("is i instance of string:"+b2);
    }
    
}


/*o.p. 
 class repersented by class1:
class1 to String()
class repersented by class2:
class2 to String()
is p instance of string:true
is i instance of string:false
*/
