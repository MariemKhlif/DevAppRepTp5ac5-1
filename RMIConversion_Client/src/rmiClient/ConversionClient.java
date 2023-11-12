package rmiClient;


	import rmiService.IConversion;

	import java.rmi.Naming;

	public class ConversionClient {
	    public static void main(String[] args) {
	        try {
	            IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/ConversionObject");
	                                //Naming.lookup return an instance of Remote
	            System.out.println(stub.convertirMontant(700.00));
	            System.out.println(stub.convertirMontant(80.00));
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	}