
public class SingleObject {
     private static  SingleObject singleObeject=null;
     private SingleObject () {
    	 
     };
     public static SingleObject getIntnstance () {
    	   if(singleObeject == null) {
    		   singleObeject= new SingleObject();
    	   }
    	  return singleObeject;
     }
     public void ShowMessge () {
    	   System.out.println("welcom to Singleton");
    }
}