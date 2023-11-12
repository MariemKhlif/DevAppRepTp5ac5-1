package rmiClient;


	import rmiService.IConversion;

	import java.rmi.Naming;

	public class ConversionClient {
	    public static void main(String[] args) {
	        try {
	            IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/ConversionObject");
	            System.out.println(stub.convertirMontant(6.00));
	            System.out.println(stub.convertirMontant(9.00));
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	}
