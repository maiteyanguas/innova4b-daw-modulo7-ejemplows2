package innova4b.ejemplows2;

import innova4b.ejemplows1.*;


public class WSClient 
{
    public static void main( String[] args )
    {
    	StringServiceImplService serviceImpl = new StringServiceImplService();
    	StringService service =  serviceImpl.getStringServiceImplPort();
    	System.out.println( service.reverse("Kaixo Maite") );
    }
}
