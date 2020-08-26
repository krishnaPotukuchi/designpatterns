package businessdelegate;

public class BusinessLookup {
	
	public BusinessService getBusinessService(String service){
		if(service.equalsIgnoreCase("Ejb")){
			return new EJBService();
		}else{
			return new JMSService();
		}
	}

}
