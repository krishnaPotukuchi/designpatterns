package businessdelegate;

public class BusinessDelegate {
	
	BusinessLookup lookup = new BusinessLookup();
	String serviceType;
	BusinessService bService;
	
	public void setServiceType(String sType){
		this.serviceType = sType;
	}
	
	public void doTask(){
		bService = lookup.getBusinessService(serviceType);
		bService.doProcessing();
	}

}
